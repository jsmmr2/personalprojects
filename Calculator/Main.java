package Calculator;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    /*
    Coded by Justin Sommer 2022
    All I ask is you don't copy paste my code
    I worked hard on this :)
    */
    try (Scanner myMath = new Scanner(System.in)) {
      // Choose mode
      System.out.println("");
      System.out.println("Please enter:");
      System.out.println("1 for Addition");
      System.out.println("2 for Subtraction");
      System.out.println("3 for Multiplication");
      System.out.println("4 for Division");
      System.out.println("5 for Square Root");
 
     // User input - mode
      System.out.println("");
      System.out.println("Input:");
      int z = myMath.nextInt();
      System.out.println("");

      // Determine mode, Add
      if (z == 1) {
        System.out.println("How many numbers would you like to add? (Integers only - You'll get an error if u dont)");
        int e = myMath.nextInt();
        Double w = 0.0;
        for (int r = e; r>0 ; r-=1) {
          Double x = 0.0;
          System.out.println("Number:");
          x = myMath.nextDouble();
          w+=x;
        }
        System.out.println(w);
      } if (z == 2) {
        System.out.println("How may numbers would you like to subtract?");
        int e = myMath.nextInt();
        System.out.println("First number:");
        Double f = myMath.nextDouble();
        Double c = 0.0;
        for ( ; e>0; e-=1) {
          c = 0.0;
          System.out.println("Number:");
          c = myMath.nextDouble();
        }
        System.out.println("Output:");
        System.out.println(f-c);
      } if (z == 3) {
        System.out.println("Number 1:");
        Double x = myMath.nextDouble();
        System.out.println("Number 2:");
        Double y = myMath.nextDouble();
        System.out.println("Output:");
        System.out.println(x*y);
      } if (z == 4) {
        System.out.println("Number 1:");
        Double x = myMath.nextDouble();
        System.out.println("Number 2:");
        Double y = myMath.nextDouble();
        System.out.println("Output:");
        System.out.println(x/y);
      } if (z == 5) {
        System.out.println("Input:");
        Double x = myMath.nextDouble();
        System.out.println("Output:");
        System.out.println(Math.sqrt(x));
      } if (z>5){
        System.out.print("Not an option lol");
      } if (z<1) {
        System.out.print("Not an option lol");
      }
    }
  }
}