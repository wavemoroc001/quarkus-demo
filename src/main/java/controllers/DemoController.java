package controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Path("/demo")
public class DemoController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello(){
        return "Hello at" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm"));
    }
}
