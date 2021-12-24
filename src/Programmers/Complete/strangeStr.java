package Programmers.Complete;// 이상한 문자 만들기

import java.util.*;

public class strangeStr {

  public static void main(String[] args) {
    String s = "try hello world";
    String answer = "";
    String[] a = s.split("\\s");
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
      String[] Sarr = a[i].split("");
      for (int j = 0; j < Sarr.length; j++) {
        if (j % 2 == 1) {
          Sarr[j] = Sarr[j].toLowerCase();
        } else {
          Sarr[j] = Sarr[j].toUpperCase();
        }
        answer += Sarr[j];
      }
      answer += " ";
    }
    answer = answer.substring(0,answer.length()-1);
    System.out.println("\n" + "answer = " + answer);
  }
}
