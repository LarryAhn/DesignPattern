package com.zuperztar.designpattern.strategy;

public class Fighter {

    public void fight(WeaponStrategy weaponStrategy) {
        weaponStrategy.useWeapon();
    }

}
