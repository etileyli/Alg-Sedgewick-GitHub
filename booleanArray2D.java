/*
  Solutions to 1.1.11 & 1.1.13
  Create a random 2D boolean array.
  Program should be called with two positive integer inputs
  representing the dimensions of the array.
*/
public class booleanArray2D
{
  public int _row = 0;
  public int _column = 0;
  public boolean[][] boolArray;

  public booleanArray2D(int row, int column){
      _row = row;
      _column = column;
      boolArray = createRandomBoolArray(_row, _column);
  }

  private boolean[][] createRandomBoolArray(int row, int column){

    boolean[][] boolArray = new boolean[row][column];

    for (int i = 0; i < row; i++ )
      for (int j = 0; j < column; j++)
        if (Math.random() < 0.5 )
          boolArray[i][j] = false;
        else
          boolArray[i][j] = true;
    return boolArray;
  }

  public void printBooleanArrayWithCharacters(char firstChar, char secondChar){

    for (int i = 0; i < _row; i++ ){
        for (int j = 0; j < _column; j++)
          if ( boolArray[i][j] == false)
            System.out.print(firstChar + " ");
          else
            System.out.print(secondChar + " ");
    System.out.print("\n");
   }
  }

  public void printBooleanArrayWithCharacters(char firstChar, char secondChar, boolean isTransposed){

    if (!isTransposed)
      printBooleanArrayWithCharacters(firstChar, secondChar);
    else{
      for (int i = 0; i < _column; i++){
        for (int j = 0; j < _row; j++)
          if ( boolArray[j][i] == false)
            System.out.print(firstChar + " ");
          else
            System.out.print(secondChar + " ");
      System.out.print("\n");
      }
    }
  }

  // Test program for the class
  public static void main(String[] args) {

    if (args.length != 2){
      System.out.println("Please enter two number as arguments!");
      System.exit(1);
    }

    int row = Integer.parseInt(args[0]);
    int column = Integer.parseInt(args[1]);

    booleanArray2D temp = new booleanArray2D(row, column);

    temp.printBooleanArrayWithCharacters('-', '+');
    System.out.println();
    temp.printBooleanArrayWithCharacters('-', '+', true);
  }
}
