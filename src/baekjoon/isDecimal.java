package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class isDecimal {

  public static void main(String[] ar) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int t = sc.nextInt();
    int sum=0;
    ArrayList<Integer> a = new ArrayList<>();
    int min = -1;
    for(int i=T;i<=t;i++){
      if(checkPrime(i)){
        a.add(i);
        min = T;
        sum+= i;
        min = a.get(0);
      }
    }
    if(sum>0) {
      System.out.println(sum);
    }
    System.out.println(min);
  }

  public static boolean checkPrime(int Number) {
    boolean answer = false;
    if (Number == 1) {
      return false;
     }
    int cnt = 0;
    for (int j = 1; j <= Number; j++) {
      if (Number % j == 0) {
        cnt++;
      }
    }
    if (cnt == 2) {
      answer = true;
    }
    else {
      answer =  false;
    }
    return answer;
  }
}