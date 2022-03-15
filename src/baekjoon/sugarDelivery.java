package baekjoon;

import java.util.Scanner;

public class sugarDelivery {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int count = 0;
    int sugar = sc.nextInt();
    if(sugar % 5 >0){
      count += sugar/5;

    }
  }
}
