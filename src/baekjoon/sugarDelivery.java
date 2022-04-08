package baekjoon;

import java.util.*;

public class sugarDelivery{
  public static void main(String[] ar){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 0;
    while(true){
      if(N%5==0){
        count += N/5;
        System.out.println(count);
        break;
      }
      else {
        N = N-3;
        count++;
      }
      if(N<0){
        System.out.println("-1");
        break;
      }
    }
  }
}