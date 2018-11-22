/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.util;

/**
 *
 * @author Mahesh
 */
public interface EdgeUrlUtil {
    String CREATE = "/createEdge/{source}/{dest}/{dist}";
    String UPDATE = "/updateEdge/{id}/{source}/{dest}/{dist}";
    String DELETE = "/deleteEdge/{id}";
    String LIST = "/getEdgeList";



}
