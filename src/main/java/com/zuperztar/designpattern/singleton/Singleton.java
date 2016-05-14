package com.zuperztar.designpattern.singleton;

public class Singleton {

    static Singleton singletonObj;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singletonObj == null) {
            singletonObj = new Singleton();
        }
        return singletonObj;
    }

}
