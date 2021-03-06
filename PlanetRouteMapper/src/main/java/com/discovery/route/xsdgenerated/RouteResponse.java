
package com.discovery.route.xsdgenerated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="route" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="planetNode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="planetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "route"
})
@XmlRootElement(name = "RouteResponse", namespace = "")
public class RouteResponse {

    @XmlElement(required = true)
    protected List<RouteResponse.Route> route;

    /**
     * Gets the value of the route property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the route property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteResponse.Route }
     * 
     * 
     */
    public List<RouteResponse.Route> getRoute() {
        if (route == null) {
            route = new ArrayList<RouteResponse.Route>();
        }
        return this.route;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="planetNode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="planetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "planetNode",
        "planetName",
        "distance"
    })
    public static class Route {

        @XmlElement(required = true)
        protected String planetNode;
        @XmlElement(required = true)
        protected String planetName;
        protected float distance;

        /**
         * Gets the value of the planetNode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlanetNode() {
            return planetNode;
        }

        /**
         * Sets the value of the planetNode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlanetNode(String value) {
            this.planetNode = value;
        }

        /**
         * Gets the value of the planetName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlanetName() {
            return planetName;
        }

        /**
         * Sets the value of the planetName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlanetName(String value) {
            this.planetName = value;
        }

        /**
         * Gets the value of the distance property.
         * 
         */
        public float getDistance() {
            return distance;
        }

        /**
         * Sets the value of the distance property.
         * 
         */
        public void setDistance(float value) {
            this.distance = value;
        }

    }

}
