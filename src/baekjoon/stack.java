package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack {

  public static void main(String [] ar)throws IOException {
    Stack<Integer> stack = new Stack<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    for(int i=0; i<a; i++){
      String b = br.readLine();
      if(b.contains("push")){
        int pushNum = Integer.parseInt(b.split(" ")[1]);
        stack.push(pushNum);
      }
      if(b.contains("pop")){
        if (stack.isEmpty()) {
          System.out.println(-1);
        }
        else {
          System.out.println(stack.pop());
        }
      }
      if(b.contains("size")){
        System.out.println(stack.size());
      }
      if(b.contains("top")) {
        if (stack.isEmpty()) {
          System.out.println(-1);
        } else {
          System.out.println(stack.peek());
        }
      }
      if(b.contains("empty")){
        if (stack.isEmpty()) {
          System.out.println(1);
        } else {
          System.out.println(0);
        }
      }
    }

  }

}
