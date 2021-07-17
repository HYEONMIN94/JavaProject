package com.company.singleton;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = CarFactory.getInstance();
        Car hyundaiCar = carFactory.createCar("hyundai");
        Car samsungCar = carFactory.createCar("samsung");
        Car kiaCar = carFactory.createCar("kia");

        hyundaiCar.info();
        samsungCar.info();
        kiaCar.info();
    }
}
