package Programmers.fail;

import java.util.*;
// 아직 해결 X
public class knum {
    public int[] solution(int[] array, int[][] commands) {
        // 변수 선언
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        int temp, i = 0, j = 0, k = 0;
        int[] array1 = null;
        for(int a =0; i<commands.length;i++){
             i = commands[i][0];
             j = commands[i][1];
             k = commands[i][2];
             for (int n = i; n<j;n++){
                arr.add(array[n]);

            }
            Collections.sort(arr);
             array1[i] = arr.get(k);
        }
        return array1;
    }
}
