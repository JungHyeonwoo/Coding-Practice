package Programmers.fail;

import java.util.*;

public class reverseIntList {

  public static void main(String[] ar) {
    long n = 12345;
    int[] answer = {};
    String temp = Long.toString(n);
    String[] tmp = temp.split("");
    for (int i = tmp.length; i > 0; --i) {
      answer[tmp.length - i - 1] = Integer.parseInt(tmp[i]);
    }
    System.out.println("answer = " + answer);
  }

}
