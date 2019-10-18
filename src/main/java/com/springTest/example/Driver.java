package com.springTest.example;

import org.springframework.stereotype.Component;

@Component
public class Driver {
    private int driverId;
    private String driveName;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriveName() {
        return driveName;
    }

    public void setDriveName(String driveName) {
        this.driveName = driveName;
    }

    public void showDriverInformation(){
        System.out.println("This is the driver of this car.");
    }
}
