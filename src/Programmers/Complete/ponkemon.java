package Programmers.Complete;

import java.util.HashSet;
//폰켓몬
public class ponkemon {

    public int solution(int[] nums) {
        int answer = 0;
        int numlength = nums.length/2;
        HashSet<Integer> num = new HashSet<Integer>();
        for(int i=0; i<nums.length;i++){
            num.add(nums[i]);
        }
        if(numlength < num.size()) answer =2;
        else answer = num.size();
        return answer;
    }
    }


