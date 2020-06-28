package pers.lls.controller;

import com.alibaba.dubbo.config.annotation.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Service(protocol = "rest")
@Path("v2/agents")
public class HelloController {

    @GET
    public String sayHello(){

        return "hello";
    }
}