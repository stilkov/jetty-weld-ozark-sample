package com.innoq.sample;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("mvc")
public class SampleController {

    @Inject
    SampleBean bean;

    @GET
    @Controller
    @Produces("text/html")
    @Path("view1")
    public String view1(@PathParam("id") String id) {
	System.out.println("Bean injection has worked; the message is " + bean.getMessage());
        return "view1.jsp";
    }
}
