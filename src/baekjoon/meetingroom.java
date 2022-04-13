package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class meetingroom {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] arr = new int[N][2];
    int count = 0;
    for(int i=0; i< N; i++){
      arr[i][0] = sc.nextInt();
      arr[i][1] = sc.nextInt();
    }
    Arrays.sort(arr, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[1] == o2[1]){ // 끝나는 시간이 같을 때
          return o1[0] - o2[0]; // // 시작시간을 정렬?
        }
        return o1[1] - o2[1]; // 끝나는 시간이 다르면 끝나는 시간별로 정렬
      }
    });
    for(int i = 0;i<N;i++)
    System.out.println(Arrays.toString(arr[i]));

    int prev_end_time = 0; // 끝나는 시간
    for(int i=0; i<N; i++){
      if(prev_end_time <= arr[i][0]){ // 끝나는 시간이 시작시간보다 작거나 같을 때
        prev_end_time = arr[i][1]; // 끝나는 시간을 그 시작의 끝나는 시간으로 바꾼 뒤
        count++; // count 증가
      }
    }
    System.out.println(count);
  }

}
