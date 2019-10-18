package com.springTest.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private int carId;
    private String carModel;
    @Autowired
    private Driver driver;

    public Car() {
        System.out.println("Object car was created.");
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void showInformation(){
        System.out.println("This is a car.");
        driver.showDriverInformation();
    }
}
