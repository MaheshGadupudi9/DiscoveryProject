package com.discovery.routes.model;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Mahesh
 */
public class RouteModel {
     private String planetNode;
        private String planetName;
        private float distance;

    public String getPlanetNode() {
        return planetNode;
    }

    public void setPlanetNode(String planetNode) {
        this.planetNode = planetNode;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
        
}
