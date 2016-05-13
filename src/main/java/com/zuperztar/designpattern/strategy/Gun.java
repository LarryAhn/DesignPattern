package com.zuperztar.designpattern.strategy;

public class Gun implements WeaponStrategy {
    public void useWeapon() {
        System.out.println("Gun!");
    }
}
