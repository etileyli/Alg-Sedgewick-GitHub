/*
  Solution to 1.1.21
  Recursive ln(N!).
*/

import java.util.*;

public class createTable{

    static class entry{
    int _num1, _num2;
    String _text;
    String[] splited;

    public entry(String str){
       splited = str.split("\\s+");

      _text = splited[0];
      _num1 = Integer.parseInt(splited[1]);
      _num2 = Integer.parseInt(splited[2]);
    }

    public void displayEntry(){
      for (int i = 0; i < splited.length; i++)
        System.out.println(splited[i]);
    }
  }

  static void printTable(ArrayList<entry> entryList){

    for (int i = 0; i < entryList.size(); i++){
      Double div = Double.valueOf(entryList.get(i)._num1)/Double.valueOf(entryList.get(i)._num2);
      System.out.println(entryList.get(i)._text + "\t" + entryList.get(i)._num1 + "\t" + entryList.get(i)._num2 + "\t" + String.format("%.3f", div));
    }
  }

  public static void main(String[] args) {
    System.out.println("Enter \"Quit\" to exit, \"Print\" to print the table.");

    Scanner sc = new Scanner(System.in);
    String str;
    ArrayList<entry> _entryList = new ArrayList<entry>();

    while(!(str = sc.nextLine()).equals("Quit")){

      String[] splited = str.split("\\s+");

      if (str.equals("Print"))
        break;

      if ((splited.length != 3)){
        System.out.println("Three arguments should be entered.");
        continue;
      }

      if ((splited[0].matches(".*\\d.*")) || (!splited[1].matches(".*\\d.*")) || (!splited[2].matches(".*\\d.*")) ){
        System.out.println("Arguments are not correctly entered. 1st should be Name, 2nd and 3rd should be integers.");
        continue;
      }

      entry _entry = new entry(str);
      _entryList.add(_entry);
      // _entry.displayEntry();
    }

    if (_entryList.size() > 0)
      printTable(_entryList);
    else{
      System.out.println("Empty table. Exitting the program.");
    }


  }
}
