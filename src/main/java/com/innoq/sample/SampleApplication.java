package com.innoq.sample;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import java.util.Collections;
import java.util.Set;


@ApplicationPath("/")
public class SampleApplication extends ResourceConfig {
    public SampleApplication() {
	packages("com.innoq.sample");
    }
}
