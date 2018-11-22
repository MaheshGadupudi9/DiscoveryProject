
package com.dg.controller;

import com.dg.model.VertexModel;
import com.dg.services.VertexService;
import com.dg.util.VertexUrlUtil;
import java.util.LinkedHashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mahesh
 */
@Controller
public class VertexController {

    @Autowired
    private VertexService vertexService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getHome() {
        System.out.println("Control came here");
        return "index";
    }

    @RequestMapping(value = VertexUrlUtil.CREATE, method = RequestMethod.GET)
    public @ResponseBody
    String saveVertex(@PathVariable("node") String node, @PathVariable("name") String name) {
        return vertexService.save(new VertexModel(node, name)) != null ? "sucess" : "failure";

    }

    @RequestMapping(value = VertexUrlUtil.UPDATE, method = RequestMethod.POST)
    public @ResponseBody
    String updateVertex(@PathVariable String node, @PathVariable String name) {
        return vertexService.update(new VertexModel(node, name)) ? "sucess" : "failure";
    }

    @RequestMapping(value = VertexUrlUtil.DELETE, method = RequestMethod.POST)
    public @ResponseBody
    String deleteVertex(@PathVariable String node) {
        VertexModel model = new VertexModel();
        model.setPlanet(node);
        return vertexService.delete(model) ? "sucess" : "failure";
    }

    @RequestMapping(value = VertexUrlUtil.LIST, method = RequestMethod.GET)
    public @ResponseBody
    List<VertexModel> getList() {
        return vertexService.getVetices();
    }

    @RequestMapping("/listUsers")

    public ModelAndView listUsers() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/MySpringProject/getList";
        List<LinkedHashMap> users = restTemplate.getForObject(url, List.class);

        return new ModelAndView("main", "users", users);

    }

}
