package Programmers.Complete;

//x만큼 간격이 있는 n개의 숫자
public class interval_x {
  public long[] solution(int x, int n) {
    long[] answer = new long[n];
    long temp = x;
    for(int i=0; i<n;i++){
      answer[i] = temp*(i+1);
    }
    return answer;
  }
}