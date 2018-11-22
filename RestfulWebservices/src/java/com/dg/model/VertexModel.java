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
public class VertexModel implements Serializable{

    private String planet;
    private String planetName;

    public VertexModel() {
    }

    public VertexModel(String planet, String planetName) {
        this.planet = planet;
        this.planetName = planetName;
    }



    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }




}
