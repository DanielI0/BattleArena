package com.company;

import java.util.Random;

public class Main {
    public final static int NUMBER_OF_UNITS = 10;

    public static void main(String[] args) {

        Unit[] unit = new Unit[NUMBER_OF_UNITS];
        for (int i = 0; i < unit.length; i++) {
            Random r = new Random();
            unit[i] = new Mage(r.nextInt(13), r.nextInt(13), r.nextInt(13), randomName());
            if (unit[i].getMaxCp() > unit[i].maxCP) {
                System.err.println(unit[i].getName() + " cheat0r!");
                unit[i] = new Mage();
            }
            System.out.println(unit[i].toString());
        }

    }

    public static String randomName() {
        String[] syllable = new String[]
                        {"ka", "ki", "ku", "ro", "ra", "ri", "pu",
                                "po", "pa", "na", "ni", "ne", "k"};
        return syllable[(int)(Math.random() * syllable.length)] +
                syllable[(int)(Math.random() * syllable.length)];
    }
}
