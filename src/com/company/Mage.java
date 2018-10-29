package com.company;

public class Mage extends Unit {

    public Mage() {
        super();
        hp = 10;
        damage = 20;
        armor = 0;
    }

    public Mage(int hp, int damage, int armor, String name) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
        this.name = name;
    }

}
