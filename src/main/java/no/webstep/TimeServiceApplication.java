package no.webstep;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.util.UUID;

public class TimeServiceApplication extends Application<TimeServiceConfiguration>{

    private static String uniqueId;

    public static void main(String[] args) throws Exception {
        new TimeServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "timeservice";
    }

    @Override
    public void initialize(Bootstrap<TimeServiceConfiguration> bootstrap) {
        UUID uuid = UUID.randomUUID();
        uniqueId = uuid.toString();

    }

    @Override
    public void run(TimeServiceConfiguration configuration,
                    Environment environment) {
        final TimeServiceResource resource = new TimeServiceResource();
        environment.jersey().register(resource);
    }

    public static String getUniqueId() {
        return uniqueId;
    }
}