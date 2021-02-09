/*
Mini Project 1
Group #_: Adam James, Anthony Hale, Grady Lipp, Najee Robinson
Date: 2/9/2021
*/

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random r = new Random();

    int userNum;

    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number:");

    userNum = s.nextInt();
    int randomNum = r.nextInt(userNum);

    System.out.println("A random number to guess has been generated");

    playGame(userNum, randomNum);
  }


  public static void playGame(int userNumber, int guessNum){
      System.out.println("Please guess a number between 0 and " + userNumber);
      Scanner s = new Scanner(System.in);
      int userGuess = s.nextInt();
      int numTries;
      numTries = 1;

      while (userGuess != guessNum) {

        if (userGuess > guessNum)
        System.out.println("Guess a lower number");
        else if (userGuess < guessNum)
        System.out.println("Guess a higher number");

        numTries++;

        System.out.println("Enter your new guess:");
        userGuess = s.nextInt();
      }

      System.out.println("Great, you win! It took you " + numTries + " tries");


    }


  
}