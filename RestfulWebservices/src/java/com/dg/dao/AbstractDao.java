/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Mahesh
 */
public abstract class AbstractDao  {

    @Autowired
    private SessionFactory factory;


    protected Object save(Object instance) {
        Session session = factory.openSession();
        Transaction tx = session.getTransaction();
        tx.begin();
        try {
          Object id =  session.save(instance);
           tx.commit();
           return id;
        } catch (HibernateException ex) {
            System.out.println(ex.getMessage());
            return null;
        } finally {
            session.close();
        }
    }

    protected boolean delete(Object instance) {
        Session session = factory.openSession();
        Transaction tx = session.getTransaction();
        tx.begin();
        try {
           session.delete(instance);
           tx.commit();
           return true;
        } catch (HibernateException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            session.close();
        }
    }

    protected boolean update(Object instance) {
        Session session = factory.openSession();
        Transaction tx = session.getTransaction();
        tx.begin();
        try {
           session.update(instance);
           tx.commit();
           return true;
        } catch (HibernateException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            session.close();
        }
    }

    protected List getList(String query) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            return session.createQuery(query).list();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        } finally {
            session.close();
        }
    }
}
