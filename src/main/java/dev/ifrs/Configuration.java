package dev.ifrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class Configuration {

    @ConfigProperty(name = "pw2.messageyaml", defaultValue = "Oi")
    String message;

    @ConfigProperty(name = "pw2.name", defaultValue = "Oi")
    String name;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return message + " " + name;
    }
}