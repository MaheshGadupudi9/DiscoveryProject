package com.discovery.routes.boimpl;

import com.discovery.algorithm.calculate.AlgorithmCalculation;
import com.discovery.algorithm.calculate.DBConnetionJDBC;
import com.discovery.route.xsdgenerated.RouteRequest;
import com.discovery.route.xsdgenerated.RouteResponse;
import com.discovery.routes.bo.RouteRequestInterface;
import java.util.Arrays;
import java.util.List;

public class RouteRequestImpl implements RouteRequestInterface {

    public RouteResponse getRouteResponse(RouteRequest request) {
        // RouteResponse response=new RouteResponse();
        DBConnetionJDBC dbConnection=new DBConnetionJDBC();
        AlgorithmCalculation m = new AlgorithmCalculation();
        String zxc = m.calculateDistance(request.getPlanetOrigin(), request.getPlanetDestination());
        System.out.println("Returned String");
        System.out.println(zxc);
        String[] parts = zxc.split("->");
        List<String> sList = Arrays.asList(parts);
        System.out.println("As list"+sList);

        RouteResponse response = new RouteResponse();
        String s=null;
        for (String values : sList) {
            System.out.println("length :"+values.length());
            if(values.length()>1){
               
                System.out.println("Entered");
            String getName = values.substring(0, values.indexOf("("));
s=values;
            RouteResponse.Route route = new RouteResponse.Route();
          s = s.substring(s.indexOf("(") + 1);
        s = s.substring(0, s.indexOf(")"));

            route.setDistance(new Float(s));

          //  route.setPlanetName(dbConnection.getPlanetNameBynode(getName));
            route.setPlanetNode(getName);
            response.getRoute().add(route);
            }
        }

     
        return response;

    }

}
