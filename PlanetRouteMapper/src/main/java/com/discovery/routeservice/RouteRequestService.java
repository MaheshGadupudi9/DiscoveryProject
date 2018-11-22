package com.discovery.routeservice;

import com.discovery.route.xsdgenerated.RouteRequest;
import com.discovery.route.xsdgenerated.RouteResponse;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.discovery.routes.bo.RouteRequestInterface;
import com.discovery.routes.model.RouteRequestModel;

import javax.jws.WebParam;

@WebService
public class RouteRequestService {

    //DI via Spring
    RouteRequestInterface routeRequest;

    @WebMethod(exclude = true)

    public void setRouteRequest(@WebParam(name = "RouteRequest") RouteRequestInterface routeRequest) {
        this.routeRequest = routeRequest;
    }

    @WebMethod(operationName = "getRouteRequest")
    public RouteResponse getRouteRequest(@WebParam(name = "RouteRequest") RouteRequest request) {
        System.out.println("request :"+ request.getPlanetOrigin());
            System.out.println("request B:"+ request.getPlanetDestination());
        return routeRequest.getRouteResponse(request);

    }

}
