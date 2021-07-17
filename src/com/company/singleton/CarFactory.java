package com.company.singleton;

public class CarFactory {
    private static CarFactory Instance = new CarFactory();
    private int carNumber = 1000;

    private CarFactory(){
    }

    public static CarFactory getInstance(){
        if (Instance == null){
            Instance = new CarFactory();
        }
        return Instance;
    }

    public Car createCar(String carName){
        return new Car(carName, carNumber++);
    }



}
