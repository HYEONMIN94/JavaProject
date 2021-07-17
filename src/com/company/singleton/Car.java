package com.company.singleton;

public class Car {
    private String carName;
    private int carNumber;

    public Car(String carName, int carNumber){
        this.carName = carName;
        this.carNumber = carNumber;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void info(){
        System.out.println("이 차의 이름은 " + getCarName());
        System.out.println("이 차의 번호는 " + getCarNumber());
    }
}
