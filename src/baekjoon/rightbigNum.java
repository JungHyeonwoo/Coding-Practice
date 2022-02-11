package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class rightbigNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] b =new int[a];
    int bigNum = 0;
    String answer = "";
    for(int i=0; i<a;i++){
      b[i] = sc.nextInt();
    }
    int[] q = new int[a];
    for(int s =0; s<a;s++){
      int count = 0;
      Stack<Integer> stack = new Stack<>();
      for(int j=s+1 ;j<a;j++) {
          stack.push(b[j]);
          if(b[s] < stack.peek()){
            count++;

            bigNum = stack.peek();
          }
      }
      if(count==0){
        answer += " -1";
      }
      else if(count==1){
        answer += String.valueOf(bigNum);
      }
    }
    answer += "-1";
    System.out.println(answer);
  }
}
