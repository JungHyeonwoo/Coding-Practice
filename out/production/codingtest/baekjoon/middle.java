package baekjoon;

import java.util.Scanner;

public class middle{
  public static void main(String[] ar){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int sum = a + b + c;
    int max = Math.max(a,Math.max(b,c));
    int min = Math.min(a,Math.min(b,c));
    System.out.println(sum-max-min);
  }
}