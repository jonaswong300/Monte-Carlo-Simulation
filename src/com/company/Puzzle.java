package com.company;

import java.util.Random;

public class Puzzle {
    public int value;
    public boolean isSolved = false;

    public Puzzle(int length) {
        int upperBound = (int) Math.pow(2, length);
        value = new Random().nextInt(upperBound) + 1;
        //System.out.println("The value is " + value);
    }
}
