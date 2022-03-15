package baekjoon;

import java.util.Scanner;

public class Ring {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int firstRing = sc.nextInt();
    for(int i=0; i<n-1; i++){
      int a = sc.nextInt();
      int gcd  =eunclidean(firstRing,a);
      int b = firstRing/gcd;
      int c = a/gcd;
      System.out.println(b + "/" + c);
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
