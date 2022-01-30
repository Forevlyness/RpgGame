package com.company;

public class Boss extends GameEntity {
    public Boss(int health, int damage) {
        super(health, damage);
    }
    Weapon Weapon = new Weapon(99, "AK-47");

    public com.company.Weapon getWeapon() {
        return Weapon;
    }

    public void setWeapon(com.company.Weapon weapon) {
        Weapon = weapon;
    }

}
