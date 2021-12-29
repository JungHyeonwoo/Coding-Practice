package Programmers.Complete;

import java.util.regex.Pattern;

public class String_basic {
  public static void main(String[] ar){
    String s = "123F";
    boolean answer = false;
    Pattern pattern = Pattern.compile("(\\d*)");
    if(s.length()==4||s.length()==6){
      answer = s.matches(String.valueOf(pattern));
    }
    System.out.println("answer = " + answer);
  }

}
