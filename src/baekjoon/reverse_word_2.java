package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class reverse_word_2 {

  public static void main(String[] args) throws Exception {

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String a = br.readLine();
//    String[] b = a.split("");
//    StringBuilder sb = new StringBuilder();
//    Stack<String> stack = new Stack<>();
//    int flag = 0;
//    for (int i = 0; i < b.length; i++) {
//      if (b[i].equals("<")) {
//        if(!stack.isEmpty()){
//          for(int j=0; j<stack.size();j++){
//            sb.append(stack.pop());
//          }
//        }
//        flag = 1;
//      } else if (b[i].equals(">")) {
//        flag = 0;
//        sb.append(b[i]);
//      }
//      if (flag == 0) {
//        stack.push(b[i]);
//        if (b[i].equals(" ") && !stack.isEmpty()) {
//          for(int j=0; j<stack.size();j++){
//            sb.append(stack.pop());
//          }
//        }
//      } else if (flag == 1) {
//        sb.append(b[i]);
//      }
//
//    }
//    System.out.println(sb);
    Scanner sc = new Scanner(System.in);
    String s= sc.nextLine();
    Stack<Character> stk = new Stack<>();

    boolean inout = false;

    for(int i= 0; i<s.length(); i++){
      if(s.charAt(i) =='<'){
        inout = true;

        while(!stk.isEmpty()){
          System.out.print(stk.pop());
        }

        System.out.print(s.charAt(i));
      }
      else if(s.charAt(i)=='>'){
        inout = false;
        System.out.print(s.charAt(i));
      }
      else if(inout){
        System.out.print(s.charAt(i));
      }
      else if(!inout){
        if(s.charAt(i)==' ') {
          while(!stk.isEmpty()){
            System.out.print(stk.pop());
          }

          System.out.print(s.charAt(i));
        }
        else{
          stk.push(s.charAt(i));
        }
      }

    }
    while(!stk.isEmpty()){
      System.out.print(stk.pop());
    }
  }

}

