package baekjoon;

import java.util.Scanner;

public class Dice3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int count = 0;
    int result = 0;
    int equalNum = 0;
    int bigNum = Math.max(a,Math.max(b,c));
    if(a==b){
      count+=1;
      equalNum = a;
    }
    if(a==c){
      count+=1;
      equalNum = a;
    }
    if(b==c){
      count+=1;
      equalNum=b;
    }
    if(count==0){
      result = bigNum * 100;
    }
    else if(count==1){

    }
  }

}
