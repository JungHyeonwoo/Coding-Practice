package baekjoon;

import java.util.Scanner;

public class LCM_Eunclidean {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int eunclidean = eunclidean(a , b);
      System.out.println((a * b) / eunclidean);
    }
  }

  static int eunclidean(int a, int b) {
    int mod = a % b;
    if (mod == 0) {
      return b;
    }
    return eunclidean(b, mod);
  }
}
