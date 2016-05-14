package com.zuperztar.designpattern.templatemethod;

public abstract class Car {

    public void drive() {
        System.out.println("차 시동을 걸고.");
        System.out.println("운전한다");
        performance();
        review();
        System.out.println("차 시동을 끄고 주차한다.");
    }

    public abstract void performance();

    public void review() {
        System.out.println("차 정말 좋다!");
    }
}
