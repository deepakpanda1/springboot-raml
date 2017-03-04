package de.janosch.springbootraml;


import de.janosch.springbootraml.rest.ProfileREST;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(ProfileREST.class);
    }

}