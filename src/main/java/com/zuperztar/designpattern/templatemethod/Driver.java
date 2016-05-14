package com.zuperztar.designpattern.templatemethod;

public class Driver {

    public static void main(String[] args) {

        Car gallardo = new Lamborghini();
        Car porsche911 = new Porsche();

        gallardo.drive();
        System.out.println();
        porsche911.drive();

    }

}
