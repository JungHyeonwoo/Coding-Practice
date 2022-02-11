package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class stack_sequence {

  public static void main(String[] args)  {
//    Stack<Integer> stack = new Stack<>();
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String answer="";
//    int a = Integer.parseInt(br.readLine());
//    int m = 0;
//    for(int i=0; i<a; i++){
//      int b = Integer.parseInt(br.readLine());
//      if(b>m){
//        while (b >  m){
//          stack.push(++m);
//          answer += "+";
//        }
//        stack.pop();
//        answer += "-";
//      }
//      else{
//        boolean found = false;
//        if (!stack.empty()){
//          int top = stack.peek();
//          stack.pop();
//          answer += "-";
//          if(m==top){
//            found = true;
//          }
//        }
//        if(!found){
//          System.out.println("NO");
//        }
//      }
//    }
//    for(int c=0; c<answer.length();c++){
//      System.out.println(answer.charAt(c));
//    }
//  }

    Scanner sc = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();
    ArrayList<String> ans = new ArrayList<>();
    int n =sc.nextInt();
    int[] a = new int[n+1];
    int m = 1;
    for (int i=1 ;i<=n; i++){
      a[i] = sc.nextInt();
    }

    for(int i=1; i<=n; i++){
      st.push(i);
      ans.add("+");
      while(!st.empty() && st.peek() == a[m]){
        st.pop();
        ans.add("-");
        m++;
      }
    }
    if(st.empty()){
      for(String s: ans){
        System.out.println(s);
      }
    }
    else {
      System.out.println("NO");
    }
  }
}
