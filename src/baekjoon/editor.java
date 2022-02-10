package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class editor {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    Stack<Character> lStack = new Stack<>();
    Stack<Character> rStack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      lStack.push(str.charAt(i));
    }

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      String cmd = br.readLine();
      switch (cmd.charAt(0)) {
        case 'L':
          if (lStack.empty()) {
            break;
          }
          rStack.push(lStack.pop());
          break;
        case 'D':
          if (rStack.empty()) {
            break;
          }
          lStack.push(rStack.pop());
          break;
        case 'B':
          if (lStack.empty()) {
            break;
          }
          lStack.pop();
          break;
        case 'P':
          lStack.push(cmd.charAt(2));
          break;
      }
    }

    while (!lStack.empty()) {
      rStack.push(lStack.pop());
    }
    StringBuilder sb = new StringBuilder();
    while (!rStack.empty()) {
      sb.append(rStack.pop());
    }

    System.out.println(sb);
  }

//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//      String str = br.readLine();
//      Stack<Character> leftStack = new Stack<>();
//      Stack<Character> rightStack = new Stack<>();
//
//      for(int i = 0; i < str.length(); i++){
//        leftStack.push(str.charAt(i));
//      }
//
//      int N  = Integer.parseInt(br.readLine());
//
//      for(int i = 0; i < N; i++){
//        String cmd = br.readLine();
//        switch (cmd.charAt(0)){
//          case 'L':
//            if(leftStack.empty()) break;
//            rightStack.push(leftStack.pop());
//            break;
//          case 'D':
//            if(rightStack.empty()) break;
//            leftStack.push(rightStack.pop());
//            break;
//          case 'B':
//            if(leftStack.empty()) break;
//            leftStack.pop();
//            break;
//          case 'P':
//            leftStack.push(cmd.charAt(2));
//            break;
//        }
//      }
//      while(!leftStack.empty()){
//        rightStack.push(leftStack.pop());
//      }
//      StringBuilder sb = new StringBuilder();
//      while (!rightStack.empty()){
//        sb.append(rightStack.pop());
//      }
//      System.out.println(sb.toString());
//    }


}
