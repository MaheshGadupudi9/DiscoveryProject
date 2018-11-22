/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.services;

import com.dg.model.VertexModel;
import java.util.List;

/**
 *
 * @author Mahesh
 */
public interface VertexService {

    String save(VertexModel instance);
    List<VertexModel> getVetices();
    boolean delete(VertexModel instance);
    boolean update(VertexModel instance);

}
