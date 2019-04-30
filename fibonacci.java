/*
  Solution to 1.1.19
  Non-recursive Fibonacci.
*/

import edu.princeton.cs.algs4.StdOut;

public class fibonacci
{
  public static long F(int N){
    if (N == 0) return 0;
    if (N == 1) return 1;
      return F(N-1) + F(N-2);
  }

  public static long[] enhancedF(long[] a){
    int N = a.length;

    a[0] = 0;
    a[1] = 1;

    for (int i = 2; i < N; i++)
      a[i] = a[i-1] + a[i-2];

    return a;
  }

  public static void main(String[] args){

    if (args.length != 1){
      System.out.println("Please enter one integer argument.");
      System.exit(1);
    }

    int fibNo = Integer.parseInt(args[0]);

    long[] a = new long[fibNo + 1];

    enhancedF(a);
    for(int i = 0; i <= fibNo; i++ )
        System.out.printf("Fibonacci of %d: %d\n", i, a[i]);
  }
}
