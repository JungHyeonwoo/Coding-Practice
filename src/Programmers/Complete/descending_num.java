package Programmers.Complete;

import java.util.*;
public class descending_num {
  public static void main(String[] ar){
    long n  = 118372;
    String ansnum = "";
    long answer = 0;
    String temp = String.valueOf(n);
    char [] arr = new char[temp.length()];
    for(int i=0;i<temp.length();i++) {
      arr[i]+= temp.charAt(i);
    }
    Arrays.sort(arr);
    for( int i = arr.length-1; i>=0;i--){
      ansnum += arr[i];
    }
    answer = Long.parseLong(ansnum);
    System.out.println("answer = " + answer);
  }
}