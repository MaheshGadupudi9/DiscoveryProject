/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.discovery.algorithm.calculate;

/**
 *
 * @author Mahesh
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DBConnetionJDBC {

    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private SessionFactory factory = NewHibernateUtil.getSessionFactory();

    public List<Routes> getList() {
        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            return session.createQuery("from Routes").list();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        } finally {
            session.close();
        }
    }

    public String getPlanetNameBynode(String node) {
        System.out.println("Node name :" + node);
        Session session = factory.openSession();
        session.getTransaction().begin();
        try {

            Query q = session.createQuery("from Planets where planetnode='B'");
            //  q.setString("node", node);
            List<Planets> planetslist = q.list();
            System.out.println("planetslist.get(0).getPlanetname() :" + planetslist.get(0).getPlanetname());
            return planetslist.get(0).getPlanetname();

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
}
