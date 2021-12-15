package Programmers.Complete;

// 김서방찾기
public class findKim {
  public String solution(String[] seoul) {
    String answer = null;
    for(int i=0; i<seoul.length;i++){
      if(seoul[i].equals("Kim")) {
        answer = "김서방은 "+i + "에 있다";
        break;
      }
    }
    return answer;
  }
}
