package com.discovery.routes.bo;


import com.discovery.route.xsdgenerated.RouteRequest;
import com.discovery.route.xsdgenerated.RouteResponse;


public interface RouteRequestInterface{

	RouteResponse getRouteResponse(RouteRequest request);
	
}