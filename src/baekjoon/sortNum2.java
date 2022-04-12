package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sortNum2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<N;i++){
      list.add(sc.nextInt());
    }
    Collections.sort(list);
    for(int i=0; i<N;i++){
      sb.append(list.get(i)).append("\n");
    }
    System.out.println(sb);
  }

}
