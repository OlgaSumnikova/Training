package com.company;

public enum Days {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");


    private String value;


    private Days(String value) {

        this.value = value;
    }

    public String getValue() {
        return this.value;
    }


}