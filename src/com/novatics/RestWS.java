package com.novatics;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/novaquotes")
public class RestWS {
    @GET
    @Produces("text/plain")
    public String showHelloWorld() {
        return "Olá mundo!";
    }
}
