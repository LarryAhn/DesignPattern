package com.zuperztar.designpattern.factorymethod;

public class Owner {

    public static void main(String[] args) {

        Car myPorsche911 = CarFactory.getCar("911");
        Car myBoxter = CarFactory.getCar("boxter");

    }



}
