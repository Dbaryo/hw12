package com.david.model;


import java.time.LocalDate;


public class DriversLicense {
    public DriversLicense(String driverName, int day, int month, int year) {
        this.driverName = driverName;
        this.day = day;
        this.month = month;
        this.year = year;

    }

    final private String driverName;
    private int day;
    private int month;
    private int year;
    private boolean isSuspended = false;


    public boolean isExpired (){
        LocalDate expiryDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        if (expiryDate.isBefore(today)) {
            return true;
        } else return false;
    }
}
