package com.company;

/**
 * Created by TEACHER on 29.10.2018.
 */
public class Unit {
    protected int hp;
    protected int damage;
    protected int armor;
    protected final int maxCP = 30;

    public String getName() {
        return name;
    }

    protected String name = "Player1";

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }

    public Unit() {
        hp = 10;
        damage = 10;
        armor = 10;
    }

    @Override
    public String toString() {
        return name + " (" + hp + ", " + damage + ", " + armor + ")";
    }


    public int getMaxCp() {
        return hp + damage + armor;
    }

    public void defend(Unit opponent) {
        hp = hp  - ((maxCP - armor) / maxCP) * opponent.getDamage();
    }

}
