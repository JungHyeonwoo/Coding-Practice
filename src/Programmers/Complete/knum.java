package Programmers.Complete;

import java.util.*;
public class knum {
    public static void main(String[] ar){
        // 변수 선언
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[commands.length];
        for(int i =0; i<commands.length;i++){
          int a,b,c;
          a = commands[i][0];
             b = commands[i][1];
             c = commands[i][2];
             int[] temp = Arrays.copyOfRange(array,a-1,b);
             Arrays.sort(temp);
             answer[i]=temp[c-1];
        }
      System.out.println(answer);
    }
}
