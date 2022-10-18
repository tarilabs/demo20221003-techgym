package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bmi")
public class BMIResource {

    @GET
    @Path("/{mass}/{height}")
    @Produces(MediaType.APPLICATION_JSON)
    public Number hello(String mass, String height) {
        return Double.parseDouble(mass) / Math.pow( Double.parseDouble(height) , 2);
    }
}