package no.webstep;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimePOJO {

    private String id;

    private String time;

    public TimePOJO(String id, String time) {
        this.id = id;
        this.time = time;
    }

    @JsonProperty
    public String getId() {
        return id;
    }

    @JsonProperty
    public String getTime() {
        return time;
    }
}