package Programmers.Complete;

public class hasshadNum {
  public boolean solution(int x) {
    int nod = 0;
    while(x!=0){
      nod = x%=10;
      x/=10;
    }
    boolean answer = true;
    if(x%nod != 0) answer = false;
    return answer;
  }
}
