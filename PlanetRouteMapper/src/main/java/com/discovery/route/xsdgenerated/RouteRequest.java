
package com.discovery.route.xsdgenerated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planetOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="planetDestination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteRequest", propOrder = {
    "planetOrigin",
    "planetDestination"
})
public class RouteRequest {

    @XmlElement(namespace = "http://webservices.samples.blog.com", required = true)
    protected String planetOrigin;
    @XmlElement(namespace = "http://webservices.samples.blog.com", required = true)
    protected String planetDestination;

    /**
     * Gets the value of the planetOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanetOrigin() {
        return planetOrigin;
    }

    /**
     * Sets the value of the planetOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanetOrigin(String value) {
        this.planetOrigin = value;
    }

    /**
     * Gets the value of the planetDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanetDestination() {
        return planetDestination;
    }

    /**
     * Sets the value of the planetDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanetDestination(String value) {
        this.planetDestination = value;
    }

}
