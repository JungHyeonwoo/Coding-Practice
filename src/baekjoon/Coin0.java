package baekjoon;

import java.util.Scanner;

public class Coin0 {

  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int count = 0;
    int[] unit = new int[n];
    for(int i=0;i<n;i++){
      unit[i] = sc.nextInt();
    }
    for(int i=n-1;i>0;i--){
      if(unit[i] <= k){
        count += k/=unit[i];
        k = k % unit[i];
      }
    }
    System.out.println(count);
  }

}
