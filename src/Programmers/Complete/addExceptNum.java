package Programmers.Complete;

// 없는 숫자 더하기
public class addExceptNum {
  public int solution(int[] numbers) {
    int answer = 45;
    for(int i=0; i<numbers.length;i++){
      answer -= numbers[i];
    }
    return answer;
  }
}
