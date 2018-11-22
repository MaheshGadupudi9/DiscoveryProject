/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.discovery.routes.model;

/**
 *
 * @author Mahesh
 */
public class RouteRequestModel {
    
    private String planetOrigin;
    private String planetDestination;

    public String getPlanetOrigin() {
        return planetOrigin;
    }

    public void setPlanetOrigin(String planetOrigin) {
        this.planetOrigin = planetOrigin;
    }

    public String getPlanetDestination() {
        return planetDestination;
    }

    public void setPlanetDestination(String planetDestination) {
        this.planetDestination = planetDestination;
    }
   
}
