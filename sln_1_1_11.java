
public class sln_1_1_11
{
  public static void main(String[] args) {
    int row = Integer.parseInt(args[0]);
    int column = Integer.parseInt(args[1]);

    if (args.length != 2){
      System.out.println("Please enter two number as arguments!");
      System.exit(1);
    }

    boolean[][] boolArray = new boolean[row][column];

    for (int i = 0; i < row; i++ )
      for (int j = 0; j < column; j++)
        if (Math.random() < 0.5 )
          boolArray[i][j] = false;
        else
          boolArray[i][j] = true;

    for (int i = 0; i < row; i++ ){      
        for (int j = 0; j < column; j++)
          if ( boolArray[i][j] == false)
            System.out.print("- ");
          else
            System.out.print("+ ");
    System.out.print("\n");
    }
  }
}
