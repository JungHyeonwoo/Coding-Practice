package Programmers.Complete;

public class countPY2 {
  boolean solution(String s) {
    boolean answer = true;
    int count = 0;
    for(char c: s.toCharArray()){
      if(c=='P' || c == 'p') count++;
      if(c =='Y' || c == 'y') count--;
    }
    if(count!=0) answer=false;
    return answer;
  }
}
