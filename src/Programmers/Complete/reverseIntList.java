package Programmers.Complete;

import java.util.*;

public class reverseIntList {

  public static void main(String[] ar) {
    long n = 12345;
    String temp = Long.toString(n);
    StringBuffer tempans = new StringBuffer(temp);
    String tempres = tempans.reverse().toString();
    System.out.println("tempans : " + tempres);
    String[] b = tempres.split("");
    int[] answer = new int[b.length];
    for(int i =0; i<tempans.length();i++){
      answer[i] = Integer.parseInt(b[i]);
    }

  }

}
