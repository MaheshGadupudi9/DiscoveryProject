/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.dao;

import com.dg.model.VertexModel;
import com.dg.services.VertexService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahesh
 */
@Service("vertexService")
public class VertexDao extends AbstractDao implements VertexService{

    @Override
    public String save(VertexModel instance) {
        return super.save(instance).toString();
    }

    @Override
    public List<VertexModel> getVetices() {
        return (List<VertexModel>) super.getList("from VertexModel vm");
    }


    @Override
    public boolean delete(VertexModel instance) {
        return super.delete(instance);
    }

    @Override
    public boolean update(VertexModel instance) {
        return super.update(instance);
    }






}
