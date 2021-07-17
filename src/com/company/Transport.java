package com.company;

public class Transport {
    private String type;
    private int charge;

    public Transport(String type, int charge){
        this.type = type;
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }

    public String getType() {
        return type;
    }

    public void useTransport(Person person){
        System.out.println(person.getName() + "의 소지금은 " + person.getMoney() + "원 입니다.");
        person.setMoney(person.getMoney() - getCharge());
        System.out.println(person.getName() + "가 " + getType() + "을 이용했습니다");
        System.out.println(person.getName() + "의 남은 금액은 " + person.getMoney() + "원 입니다.");
    }
}
