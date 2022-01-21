
package baekjoon;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    int result = 1;
    for(int a=i;a>0;a--){
      result *=a;
    }
    System.out.println(result);
  }

}
