package com.tekwill.learning.trivia;

import java.util.Scanner;

public class AstronomyGame {
    public static void main(String[] args) {
        int scoreTotal = 0;
        int correctAnswer;
        boolean nextLevel = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wellcome to the best game about astronomy, if you want to play press YES, or NO to exit.");
        String startGame= scanner.nextLine();
        while (startGame.toUpperCase().equals("YES")){
            System.out.println("To select a question, please enter a number between 1-6");
            int questionNumber = scanner.nextInt();
            switch (questionNumber){
                case 1:
                    System.out.println(Questions.LEVEL_1_QUESTION_1);
                    System.out.println("1) " + Questions.LEVEL_1_QUESTION_1_ANSWER_1);
                    System.out.println("2) " + Questions.LEVEL_1_QUESTION_1_ANSWER_2);
                    System.out.println("3) " + Questions.LEVEL_1_QUESTION_1_ANSWER_3);
                    System.out.println("4) " + Questions.LEVEL_1_QUESTION_1_ANSWER_4);
                    correctAnswer = scanner.nextInt();
                    if (correctAnswer == 3) {
                        scoreTotal += Questions.LEVEL_1_QUESTION_3_SCORE;
                    }
                    else {
                        startGame = "NO";
                        nextLevel = false;
                    }
                    break;
                case 2:
                    System.out.println(Questions.LEVEL_1_QUESTION_2);
                    System.out.println("1) " + Questions.LEVEL_1_QUESTION_2_ANSWER_1);
                    System.out.println("2) " + Questions.LEVEL_1_QUESTION_2_ANSWER_2);
                    System.out.println("3) " + Questions.LEVEL_1_QUESTION_2_ANSWER_3);
                    System.out.println("4) " + Questions.LEVEL_1_QUESTION_2_ANSWER_4);
                    correctAnswer = scanner.nextInt();
                    if (correctAnswer == 04) {
                        scoreTotal += Questions.LEVEL_1_QUESTION_4_SCORE;
                    }
                    else {
                        startGame = "NO";
                        nextLevel = false;
                    }
                    break;
                case 3:
                    System.out.println(Questions.LEVEL_2_QUESTION_1);
                    System.out.println("1) " + Questions.LEVEL_2_QUESTION_1_ANSWER_1);
                    System.out.println("2)" + Questions.LEVEL_2_QUESTION_1_ANSWER_2);
                    System.out.println("3) " + Questions.LEVEL_2_QUESTION_1_ANSWER_3);
                    System.out.println("4) " + Questions.LEVEL_2_QUESTION_1_ANSWER_4);
                    correctAnswer = scanner.nextInt();
                    if (correctAnswer == 1) {
                        scoreTotal += Questions.LEVEL_2_QUESTION_1_SCORE;
                    }
                    else {
                        startGame = "NO";
                        nextLevel = false;
                    }
                    break;
                case 4:
                    System.out.println(Questions.LEVEL_2_QUESTION_2);
                    System.out.println("1) " + Questions.LEVEL_2_QUESTION_2_ANSWER_1);
                    System.out.println("2) " + Questions.LEVEL_2_QUESTION_2_ANSWER_2);
                    System.out.println("3) " + Questions.LEVEL_2_QUESTION_2_ANSWER_3);
                    System.out.println("4) " + Questions.LEVEL_2_QUESTION_2_ANSWER_4);
                    correctAnswer = scanner.nextInt();
                    if (correctAnswer == 2) {
                        scoreTotal += Questions.LEVEL_2_QUESTION_2_SCORE;
                    }
                    else {
                        startGame = "NO";
                        nextLevel = false;
                    }
                    break;
                case 5:
                    System.out.println(Questions.LEVEL_3_QUESTION_1);
                    System.out.println("1) " + Questions.LEVEL_3_QUESTION_1_ANSWER_1);
                    System.out.println("2) " + Questions.LEVEL_3_QUESTION_1_ANSWER_2);
                    System.out.println("3) " + Questions.LEVEL_3_QUESTION_1_ANSWER_3);
                    System.out.println("4) " + Questions.LEVEL_3_QUESTION_1_ANSWER_4);
                    correctAnswer = scanner.nextInt();
                    if (correctAnswer == 3) {
                        scoreTotal += Questions.LEVEL_3_QUESTION_3_SCORE;
                    }
                    else {
                        startGame = "NO";
                        nextLevel = false;
                    }
                    break;
                case 6:
                    System.out.println(Questions.LEVEL_3_QUESTION_2);
                    System.out.println("1) " + Questions.LEVEL_3_QUESTION_2_ANSWER_1);
                    System.out.println("2) " + Questions.LEVEL_3_QUESTION_2_ANSWER_2);
                    System.out.println("3) " + Questions.LEVEL_3_QUESTION_2_ANSWER_3);
                    System.out.println("4) " + Questions.LEVEL_3_QUESTION_2_ANSWER_4);
                    correctAnswer = scanner.nextInt();
                    if (correctAnswer == 1) {
                        scoreTotal += Questions.LEVEL_3_QUESTION_1_SCORE;
                    }
                    else {
                        startGame = "NO";
                        nextLevel = false;
                    }
                    break;
            }
        }
        System.out.println("You have " + scoreTotal + " points. Thank you!");
    }
}
