package Programmers.fail;

import java.util.*;
import java.util.Random;

public class choose_two_plus {
  public static void main(String[] ar) {
    int[] numbers = {5, 0,2,7};
    Set<Integer> set = new HashSet<Integer>();
    for(int i=0; i<numbers.length;i++){
      for(int j=i+1;j<numbers.length;j++){
        set.add(numbers[i] + numbers[j]);
      }
    }
    int[] answer = new int[set.size()];
    int j=0;
    for(int i : set){
      answer[j++] = i;
    }
    for(int i=0; i<answer.length-1;i++){
      if(answer[i] > answer[i+1]){
        int temp = answer[i];
        answer[i] = answer[i+1];
        answer[i+1] = temp;
      }
    }
    Arrays.sort(answer);
  }
}
