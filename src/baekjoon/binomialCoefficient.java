package baekjoon;
import java.io.*;
import java.util.*;
public class binomialCoefficient {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    System.out.println(factorial(m) / (factorial(m-n) * factorial(n)));
  }
  static int factorial(int N){
    if(N <=1){
      return 1;
    }
    return N * factorial(N-1);
  }
}
