package com.avinashsinha.AAP10_PayloadManagement.ByTool_02;

    /*
        JSON Body:

            {
                "firstname" : "Praveen",
                "lastname" : "Verma",
                "totalprice" : 111,
                "depositpaid" : true,
                "bookingdates" : {
                    "checkin" : "2025-09-01",
                    "checkout" : "2025-09-03"
                },
                "additionalneeds" : "Breakfast"
            }
    */

// Tool (Website) : https://www.jsonschema2pojo.org/

import java.util.LinkedHashMap;
import java.util.Map;

public class BookingDates {

    private String checkin;
    private String checkout;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}