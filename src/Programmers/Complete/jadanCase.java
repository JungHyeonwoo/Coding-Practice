package Programmers.Complete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jadanCase {

  public static void main(String[] args) {
//    String s = " 3people  unFollowed me";
    String s = " aaaaa  aaa   ";
    s = s.toLowerCase();
    Pattern pattern = Pattern.compile(" *(\\w+) *");
    Matcher matcher = pattern.matcher(s);
    String answer = "";
    int cnt = 0;
    while (matcher.find()) {
      String b = matcher.group();
      String word = matcher.group(1);
      word = word.substring(0,1).toUpperCase()+word.substring(1);
      b = b.replace(matcher.group(1),word);
      answer += b;
    }
    System.out.println(answer);
  }
}
