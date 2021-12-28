package Programmers.Complete;

import java.util.regex.Pattern;

public class String_boolean {
  public boolean solution(String s) {
    boolean answer = true;
    Pattern pattern = Pattern.compile("(\\d)");
    if(s.length()==4||s.length()==6){
      return s.matches(String.valueOf(pattern));
    }
      return answer;
  }
}
