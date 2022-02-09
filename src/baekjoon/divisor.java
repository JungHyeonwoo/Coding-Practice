package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class divisor {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int max =1,min=10000000;
    for(int i=0; i<a;i++){
      int b = sc.nextInt();
      if(b > max){
        max = b;
      }
      if(b< min){
        min = b;
      }
    }
    System.out.println(max*min);

  }

}