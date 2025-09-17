package com.avinashsinha.AAP10_PayloadManagement.ByAI_03;

/*
    Prompt:  Create a POJO class of this payload <JSON Body paste> and
             give the classes of this package <package name paste>
*/

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

public class BookingDates {

    private String checkin;
    private String checkout;

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
}