package Programmers.Complete;

// 음양 더하기
public class plus {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for(int i = 0; i <absolutes.length;i++){
                if(signs[i] == false) absolutes[i] = -1 * absolutes[i];
                else absolutes[i] = 1 * absolutes[i];
                answer = answer + absolutes[i];
            }
            return answer;
        }
}
