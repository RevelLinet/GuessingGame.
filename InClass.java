import java.util.Random;
import java.util.Scanner;

class InClass{
  
  public static void main(String[] args){

    // what do I need         // how do I get it
    Random randy              = new Random();
    int num                   = randy.nextInt(10);
    Scanner bMan              = new Scanner(System.in);

    boolean isCorrect         = getIsCorrect(num,bMan);


    System.out.println(num);
    System.out.println("I AM IN CLASS!!!!");


    bMan.close();

  }
  public static boolean getIsCorrect(int compChoice, Scanner user){
    return true;

  }

}