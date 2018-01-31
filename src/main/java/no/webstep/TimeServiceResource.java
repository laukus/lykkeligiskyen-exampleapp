package no.webstep;

import com.codahale.metrics.annotation.Timed;
import org.joda.time.DateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/time")
@Produces(MediaType.APPLICATION_JSON)
public class TimeServiceResource {

    @GET
    @Timed
    public TimePOJO getTime() {
        DateTime dateTime = new DateTime();
        return new TimePOJO(TimeServiceApplication.getUniqueId(), dateTime.toString());
    }
}