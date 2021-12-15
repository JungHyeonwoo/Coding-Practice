package Programmers.Complete;

import java.util.*;
public class descending_char {
  public static void main(String[] ar){
    String s = "Zbcdefg";
    String ansstr = "";
    char[] a = new char[s.length()];
    for(int i=0;i<s.length();i++){
      a[i] = s.charAt(i);
    }
    Arrays.sort(a);
    for( int i = a.length-1; i>=0;i--){
      ansstr += a[i];
    }
    String answer = ansstr;
    System.out.println("answer = " + answer); // "gfedcbZ"
  }
}
