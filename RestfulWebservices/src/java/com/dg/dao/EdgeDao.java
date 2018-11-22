/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.dao;

import com.dg.model.EdgeModel;
import com.dg.services.EdgeService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bsganesh
 */
@Service("edgeService")
public class EdgeDao extends AbstractDao implements EdgeService{

    @Override
    public Object save(EdgeModel model) {
        return super.save(model);
    }

    @Override
    public boolean update(EdgeModel model) {
        return super.update(model);
    }

    @Override
    public boolean delete(EdgeModel model) {
        return super.delete(model);
    }

    @Override
    public List<EdgeModel> getList() {
        return (List<EdgeModel>)super.getList("from EdgeModel model");
    }
    
}
