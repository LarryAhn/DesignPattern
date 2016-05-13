package com.zuperztar.designpattern.strategy;

public class Gamer {

    public static void main(String[] args) {
        WeaponStrategy weaponStrategy = null;
        Fighter fighter = new Fighter();

        weaponStrategy = new Sword();
        fighter.fight(weaponStrategy);

        weaponStrategy = new Bow();
        fighter.fight(weaponStrategy);

        weaponStrategy = new Gun();
        fighter.fight(weaponStrategy);
    }

}
