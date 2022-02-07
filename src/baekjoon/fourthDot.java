package baekjoon;

import java.util.Scanner;

public class fourthDot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x[] = new int[3];
    int y[] = new int[3];
    int fx = 0 , fy= 0;
    for(int i=0;i<3;i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    if(x[1] == x[2]){
      fx = x[0];
    }
    else if(x[0] == x[2])
    {
      fx =x[1];
    }
    else if(x[0] == x[1]){
      fx= x[2];
    }
    if(y[1] == y[2]){
      fy = y[0];
    }
    else if(y[0] == y[2])
    {
      fy =y[1];
    }
    else if(y[0] == y[1]){
      fy= y[2];
    }
    System.out.println(fx + " " + fy);
  }
}
