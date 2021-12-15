package Programmers.fail;// 이상한 문자 만들기
import java.util.*;
public class strangeStr {
  public static void main(String[] args){
    String s = "try hello world";
    String answer ="";
    String[] a = s.split("");
    List<String[]> sArr = new ArrayList<>();
    sArr = Collections.singletonList(s.split(" "));

    for(int i=0;i<a.length;i++) {
      System.out.print(a[i]);
      if(a.length%2==0){
        a[i] = a[i].toUpperCase();
      }
      else {
        a[i] = a[i].toLowerCase();
      }
      answer+=a[i];
    }
    System.out.println("\n" + "answer = " + answer);
  }
}
