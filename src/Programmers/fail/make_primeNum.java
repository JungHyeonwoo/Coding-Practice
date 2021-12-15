package Programmers.fail;

import java.util.ArrayList;
import java.util.List;

public class make_primeNum {
  public int solution(int[] nums) {
    int answer = 0;
    int sum=0;
    ArrayList<Integer> sums = new ArrayList<Integer>();
    int count =0;
      for(int i=0; i<nums.length;i++){
        //sums.add(sum);
        count = 0;
        for(int j =0; j<sums.get(i);j++){
          if(sums.get(i) % j == 0) count +=1;
        }
        if(count==2) answer +=1;
      }
    return answer;
  }
}
