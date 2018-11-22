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
public interface VertexUrlUtil {

    String CREATE = "/createVertex/{node}/{name}";
    String UPDATE = "/updateVertex/{node}/{name}";
    String DELETE = "/deleteVertex/{node}";
    String LIST = "/getList";

}
