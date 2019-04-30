/*
  Solution to 1.1.14
  This program calculates the largest integer not larger
  than the base-2 logarithm of input argument.
  Program should be called with one positive integer input.
*/

public class closestIntOfLogN
{
  public static int lg(int N){

    int largestInt = 0;
    int power = 1;  // 2^0 = 1

    while (N >= (power *= 2) ){
        largestInt ++;
      }

    return largestInt;
  }

  public static void main(String[] args){
    // System.out.println("This program calculates the largest integer not larger than the base-2 logarithm of input argument.");

    if (args.length != 1){
      System.out.println("Please enter one integer argument");
      System.exit(1);
    }

    System.out.println("The largest integer not larger than the base-2 logarithm of input argument is: " + Integer.toString(lg(Integer.parseInt(args[0]))));
  }

}
