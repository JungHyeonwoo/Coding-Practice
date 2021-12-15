package Programmers.Complete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mockExam {
  public int[] solution(int[] answers) {
    int[] answer = {};
    int[] check1 = {1,2,3,4,5};
    int[] check2 = {2,1,2,3,2,4,2,5};
    int[] check3 = {3,3,1,1,2,2,4,4,5,5};
    int count1 = 0;int count2 = 0;int count3 = 0;
    for(int i =0; i<answers.length; i++){
      if(answers[i] == check1[i%check1.length])  count1++;
      if(answers[i] == check2[i%check2.length])  count2++;
      if(answers[i] == check3[i%check3.length])  count3++;
    }
    int max = Math.max(Math.max(count1,count2),count3);
    ArrayList<Integer> maxList = new ArrayList<Integer>();
    if(max == count1) maxList.add(1);
    if(max == count2) maxList.add(2);
    if(max == count3) maxList.add(3);
    answer = new int[maxList.size()];
    for(int i=0; i< maxList.size();i++){
      answer[i] = maxList.get(i);
    }
    return answer;
  }
}
