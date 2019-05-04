/*
  Solution to 1.1.20
  Recursive ln(N!).
*/

public class lnNFactorial{

  public static double logFactorial(int N){

    if (N == 1)
      return 0;
    else
      return Math.log(N) + logFactorial(N-1);
  }

  public static void main(String[] args) {

    System.out.println(logFactorial(Integer.parseInt(args[0])));
  }
}
