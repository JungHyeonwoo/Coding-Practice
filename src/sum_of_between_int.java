// 두 정수 사이의 합
public class sum_of_between_int {
  public long solution(int a, int b) {
    long answer = 0;
    if(a<b){
      for(int i = a; i <=b; a++){
        answer +=i;
      }
    }
    else{
      for(int i=b;i<=a;i++){
        answer+=i;
      }
    }
    return answer;
  }
}
