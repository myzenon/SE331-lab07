package camt.cbsd.config;

import camt.cbsd.controller.StudentController;
import camt.cbsd.entity.Student;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JerseyConfig extends ResourceConfig{
    public JerseyConfig(){
        register(StudentController.class);
        register(MultiPartFeature.class);
    }
}
