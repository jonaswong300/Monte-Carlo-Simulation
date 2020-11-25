package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        simulate(4,2);
    }

    public static void simulate(int m, int k){
        int[] results = new int[m * (int)Math.pow(2, k)];
        Arrays.fill(results, 0);
        for (int i = 0; i < 100000; i++) {
            int numberOfHashes = 0;
            // Generate m puzzles
            for (int j = 0; j < m; j++) {
                Puzzle puzzle = new Puzzle(k);
                int bruteForce = 1;
                numberOfHashes++;
                while (!puzzle.isSolved){
                    if (bruteForce == puzzle.value){
                        break;
                    } else {
                        bruteForce++;
                        numberOfHashes++;
                    }
                }
            }
           // System.out.println("Number of hashes: " + numberOfHashes);
            results[--numberOfHashes]++;
        }
        for (int i = 0; i < results.length; i++) {
            System.out.println( (i + 1) + " hashes needed:" + results[i]);
        }
    }


}
