package com.rakotoson.dsalgo.chapter1.exercices.reinforcement;

import com.rakotoson.dsalgo.chapter1.models.GameEntry;

/**
 * Suppose that we create an array A of GameEntry objects, which has an integer scores field,
 * and we clone A and store the result in an array B. If we then immediately set A[4].score equal to 550,
 * what is the score value of the GameEntry object referenced by B[4]?
 *
 * @author Avotra Rakotoson
 *
 */

public class R2 {
    public static void main(String[] args) {
        GameEntry[] gameEntryA = new GameEntry[5];
        gameEntryA[0] = new GameEntry(200);
        gameEntryA[1] = new GameEntry(250);
        gameEntryA[2] = new GameEntry(100);
        gameEntryA[3] = new GameEntry(120);
        gameEntryA[4] = new GameEntry(200);

        GameEntry[] gameEntryB;
        gameEntryB = gameEntryA.clone();

        gameEntryA[4].score = 550;

        System.out.println("Game entry A: " + gameEntryA[4].score);
        System.out.println("Game entry B: " + gameEntryB[4].score);
    }
}
