public class countPY {
  boolean solution(String s) {
    boolean answer = true;

    int cnt = 0;
    for(char c : s.toCharArray()){
      if(c == 'p' || c=='P') cnt++;
      if(c == 'y' || c=='Y') cnt--;
    }
    if(cnt !=0) answer = false;
    return answer;
  }
}
