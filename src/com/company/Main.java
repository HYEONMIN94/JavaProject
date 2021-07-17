package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person tom = new Person("tom", 10000);
        Person min = new Person("min", 20000);

        Transport bus = new Transport("bus", 1000);
        Transport train = new Transport("train", 2000);

        bus.useTransport(tom);
        train.useTransport(min);

    }
}
