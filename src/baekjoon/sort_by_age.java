package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sort_by_age {

  public static void main(String[] args)throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[][] peo = new String[N][2];
    for(int i=0; i<N; i++){
      peo[i][0] = String.valueOf(sc.nextInt());
      peo[i][1] = sc.next();
    }
    Arrays.sort(peo, new Comparator<String[]>() {
      @Override
      public int compare(String[] o1, String[] o2) {
        if (Integer.parseInt(o1[0]) < Integer.parseInt(o2[0])) {
          return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
        }
        else if (Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])) {
          return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
        }
        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
      }
    });
    for(int i=0; i<N;i++) {
      System.out.println(Arrays.toString(peo[i]));
    }
  }
}
// 100 Sunyoung
//21 Junkyu
//21 Dohyun