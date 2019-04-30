/*
  Solution to 1.1.15
  This program is called with one integer parameter as the size of input array.  
  Program should be called with one positive integer input.
*/
import edu.princeton.cs.algs4.StdRandom;

public class histogramClass{

  public static int[] histogram(int[] a, int M){

    int[] result = new int[M];

    for (int i = 0; i < M; i++)
      for (int j = 0; j < a.length; j++)
        if (i == a[j])
          result[i]++;

    return result;
  }

  public static void main(String[] args){

    if (args.length != 1){
      System.out.println("Please enter one integer argument as the size of input array.");
      System.exit(1);
    }

    int resultArrayBound = 7; // random value
    int upperbound = resultArrayBound;
    int[] input = new int[Integer.parseInt(args[0])];
    int[] result = new int[resultArrayBound];

    for (int i = 0; i < input.length; i++){
      input[i] = StdRandom.uniform(upperbound);
    }

    result = histogram(input, resultArrayBound);

    System.out.println("Input array:");
    for (int i = 0; i < input.length; i++)
      System.out.println(Integer.toString(input[i]));

    System.out.println("\nResult array:");
    for (int i = 0; i < result.length; i++)
      System.out.println(Integer.toString(result[i]));
  }
}
