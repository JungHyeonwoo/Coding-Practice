package baekjoon;

import java.util.*;

public class baseball {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 0 ; i < n; i++){
      int yScore = 0;
      int gScore = 0;
      for(int j = 0; j < 9; j++){
        yScore += sc.nextInt();
        gScore += sc.nextInt();
      }
      if(yScore > gScore) System.out.println("Yonsei");
      else if(yScore == gScore) System.out.println("Draw");
      else System.out.println("Korea");
    }

  }
}
