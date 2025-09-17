package com.avinashsinha.AAP10_PayloadManagement.Jackson;

/*
    JACKSON: It is a popular Java library used in Rest Assured to convert Java objects to JSON and JSON to Java objects.
    JSON: It is a plain text in key and value pair to transfer from client to server.
*/

// Tool (Website) : https://www.jsonschema2pojo.org/

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "bookingid",
        "booking"
})

public class BookingResponse {

    @JsonProperty("bookingid")
    private Integer bookingid;
    @JsonProperty("booking")
    private Booking booking;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("bookingid")
    public Integer getBookingid() {
        return bookingid;
    }

    @JsonProperty("bookingid")
    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    @JsonProperty("booking")
    public Booking getBooking() {
        return booking;
    }

    @JsonProperty("booking")
    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}