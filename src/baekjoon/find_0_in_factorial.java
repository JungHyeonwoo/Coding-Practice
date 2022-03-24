package baekjoon;

import java.util.Scanner;

public class find_0_in_factorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    while (n >= 5) {
      count += n / 5;
      n /= 5;
    }
    System.out.println(count);
  }
//    int result = factorial(n);
//    System.out.println("result = " + result);
//    String stResult = String.valueOf(result);
//    String[] str = stResult.split("");
//    int length = stResult.length();
//    for (int a = length - 1; a > 0; a--) {
//      if (str[a].equals("0")) {
//        count++;
//      } else {
//        break;
//      }
//    }
//    System.out.println(count);

  public static int factorial(int n) {
    int result;
    if (n == 0) {
      result = 0;
    } else {
      result = 1;
    }
    for (int i = n; i > 0; i--) {
      result *= i;
    }
    return result;
  }

}
