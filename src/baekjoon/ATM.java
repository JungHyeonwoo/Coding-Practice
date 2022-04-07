package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n];
    for(int i=0; i<n;i++){
      ar[i] = sc.nextInt();
    }
    Arrays.sort(ar);
    int wait_time = 0;
    int total_time = 0;
    for(int i=0; i<n;i++){
      wait_time += ar[i];
      total_time += wait_time;
    }
    System.out.println(total_time);
  }

}
