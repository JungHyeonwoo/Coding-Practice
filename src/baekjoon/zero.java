package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class zero {

  public static void main(String[] args) throws IOException {
    Stack<Integer> stack = new Stack<>();
    int sum = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());

    for(int i=0 ;i<a; i++){
      int b = Integer.parseInt(br.readLine());

      if(b!=0){
        stack.push(b);
      }
      else if(b==0){
        stack.pop();
      }
    }
    for(int j=0; j<stack.size();j++){
      sum += stack.get(j);
    }
    System.out.println(sum);
  }

}