
package com.discovery.route.xsdgenerated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.discovery.route.xsdgenerated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RouteRequest_QNAME = new QName("http://webservices.samples.blog.com", "RouteRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.discovery.route.xsdgenerated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RouteResponse.Route }
     * 
     */
    public RouteResponse.Route createRouteResponseRoute() {
        return new RouteResponse.Route();
    }

    /**
     * Create an instance of {@link RouteRequest }
     * 
     */
    public RouteRequest createRouteRequest() {
        return new RouteRequest();
    }

    /**
     * Create an instance of {@link RouteResponse }
     * 
     */
    public RouteResponse createRouteResponse() {
        return new RouteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.samples.blog.com", name = "RouteRequest")
    public JAXBElement<RouteRequest> createRouteRequest(RouteRequest value) {
        return new JAXBElement<RouteRequest>(_RouteRequest_QNAME, RouteRequest.class, null, value);
    }

}
