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

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str;
    ArrayList<entry> _entryList = new ArrayList<entry>();

    while(!(str = sc.nextLine()).equals("Quit")){

      String[] splited = str.split("\\s+");

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
      _entry.displayEntry();
    }

  }
}
