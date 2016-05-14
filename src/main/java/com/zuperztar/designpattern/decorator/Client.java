package com.zuperztar.designpattern.decorator;

public class Client {

    public static void main(String[] args) {
        IService decorator = new Decorator();
        System.out.println(decorator.runService());
    }

}
