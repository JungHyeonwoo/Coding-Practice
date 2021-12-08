import java.util.Arrays;

public class marathon {
  public String solution(String[] participant, String[] completion) {
    String answer = "";
    Arrays.sort(participant);
    Arrays.sort(completion);
    participant.
    int i;
    for(i=0; i< completion.length;i++){
          if(!participant[i].equals(completion[i])) {
            answer = participant[i];
        }
    }
    return answer;
  }

}
