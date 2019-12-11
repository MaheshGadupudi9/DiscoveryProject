/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.model;

import java.io.Serializable;

/**
 *
 * @author Mahesh
 */
public class EdgeModel implements Serializable{
    
    private int routeId;
    private VertexModel source;
    private VertexModel destination;
    private float distance;

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public VertexModel getSource() {
        return source;
    }

    public void setSource(VertexModel source) {
        this.source = source;
    }

    public VertexModel getDestination() {
        return destination;
    }

    public void setDestination(VertexModel destination) {
        this.destination = destination;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
    
    
    
}
