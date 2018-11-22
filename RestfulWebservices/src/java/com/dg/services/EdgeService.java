/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.services;

import com.dg.model.EdgeModel;
import java.util.List;

/**
 *
 * @author Mahesh
 */
public interface EdgeService {

    Object save(EdgeModel model);
    boolean update(EdgeModel model);
    boolean delete(EdgeModel model);
    List<EdgeModel> getList();
}
