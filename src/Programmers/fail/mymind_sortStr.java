package Programmers.fail;

import java.util.Arrays;

public class mymind_sortStr {

  public static void main(String[] args) {

    String[] strings = {"sun", "bed", "car"};
    Arrays.sort(strings);
    int n = 1;
    String temp = "";
    char[] tempa = new char[strings.length];
    for(int i=0; i<strings.length;i++){

      temp = strings[i];
      tempa[i] = strings[i].charAt(1);
    }
    Arrays.sort(tempa);


  }
}
