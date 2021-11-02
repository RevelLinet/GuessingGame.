/* 
Revel Linet
November 1, 2021
period 4
A4 Guessing game

This program makes the user guess
1-100 and tells them if their guess 
is too high, too low or correct.
Then gives overall results.
*/

import java.util.Scanner;
import java.util.Random;


class GuessingGame {

 static int totalGames;
 static int totalGuesses;
 static int guessesGame;
 static int bestGame;


  public static void main(String[] args) {
     totalGames   = 0;
     totalGuesses = 0;
     guessesGame  = 0;
     bestGame     = 0;
     runGame();  

  }
  public static boolean userWantsToPlay(Scanner scn){
    System.out.println("Do you want to play again?");
    System.out.println();
    String userInput = scn.next().toLowerCase();
    return userInput.substring(0, 1).equals("y");

  }

 public static void runGame(){
   System.out.println("I'm thinking of a number between 1 and 100...");
   totalGames++;

    Scanner user    = new Scanner(System.in);
    int rightAnswer = new Random().nextInt(100);
    int attempts    = 0;

    boolean playing = true;
    while(playing){
      if(guessingAnswer(user,rightAnswer)){
        playing = false;

      }
      attempts++;

    }
     totalGuesses = totalGuesses + attempts;
     guessesGame  = totalGuesses / totalGames;

    System.out.println("You got it right in " + attempts + " guesses!");

    if (attempts < bestGame || bestGame == 0){
      bestGame = attempts;
    }

    if(userWantsToPlay(user)){
      runGame();

    } else {
      System.out.println();
      System.out.println("Overall Results:");
      System.out.println("Total games   = " + totalGames );
      System.out.println("Total guesses = " + totalGuesses);
      System.out.println("Guesses/game  = " + guessesGame);
      System.out.println("Best game     = " + bestGame);


    }
  }


  public static boolean guessingAnswer(Scanner scn, int answer){
    int userAnswer = scn.nextInt();
    if(userAnswer < answer){
      System.out.println("It's higher.");
    }else if(userAnswer > answer){
      System.out.println("It's lower.");
    }
    if (userAnswer == answer){
      return true;
    }
   
    System.out.println("Your guess?");

    return false ;

  }

}