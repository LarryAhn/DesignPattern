package com.zuperztar.designpattern.templatemethod;

public class Lamborghini extends Car {

    @Override
    public void performance() {
        System.out.println("람보르기니 슈퍼카가 퍼포먼스 짱!");
    }

    @Override
    public void review() {
        System.out.println("람보르기니 정말 좋습니다!");
    }
}
