package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bmi")
public class BMIResource {

    @Inject
    BMIBean bmiCalc;

    @GET
    @Path("/{mass}/{height}")
    @Produces(MediaType.APPLICATION_JSON)
    public Number hello(String mass, String height) {
        return bmiCalc.bmi(Double.valueOf(height), Double.valueOf(mass));
    }
}