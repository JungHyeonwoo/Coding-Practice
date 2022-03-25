package baekjoon;

import java.util.Scanner;

public class cute {

  public static void main(String[] args) {
    int count0 =0;
    int count1 = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n;i++){
      int a = sc.nextInt();
      if(a==0) count0++;
      if(a==1) count1++;
    }
    if (count0 > count1) {
      System.out.println("Junhee is not cute!");
    }
    else{
      System.out.println("Junhee is cute!");
    }
  }
}
