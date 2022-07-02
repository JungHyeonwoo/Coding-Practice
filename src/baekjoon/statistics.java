package baekjoon;

import java.io.*;
import java.util.*;
// baekjoon 2108 - silver3 통계학
// https://www.acmicpc.net/problem/2108
public class statistics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        double sum = 0;
        for(int i = 0; i<n; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        Arrays.sort(nums);
        int count = 0;
        int max = -1;
        int mod = nums[0];
        boolean check = false;
        for(int i = 0 ; i < n-1; i++) {
            if(nums[i] == nums[i+1]) {
                count++;
            } else {
                count = 0;
            }
            if(max < count) {
                max = count;
                mod = nums[i];
                check = true;
            } else if(max == count && check ==true) {
                mod = nums[i];
                check = false;
            }
        }

        System.out.println(Math.round(sum/n)); // 산술평균
        System.out.println(nums[(n-1)/2]); // 중앙값
        System.out.println(mod); // 최빈값
        System.out.println(nums[n-1] - nums[0]); // 최댓값 - 최솟값

    }
}
