/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javamethods;

/**
 *
 * @author prasad
 */
public class JavaMethods {

    public static void main(String[] args) {
        
        int highScore = calculateScore(true, 10, 10, 100);
        System.out.println("The high score is " +highScore);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalscore=score;
        if (gameOver) {
            finalscore += (levelCompleted * bonus);
        }
       return finalscore;
    }
}
