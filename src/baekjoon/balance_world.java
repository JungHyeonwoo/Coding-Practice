package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class balance_world {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a;
    while (true) {
      a = br.readLine();

      if (a.equals(".")) {
        break;
      }
      System.out.println(solve(a));
    }
  }

  public static String solve(String s) {
    int length = s.length();
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < length; i++) {
      if (s.charAt(i) == '[' || s.charAt(i) == '(') {
        st.push(s.charAt(i));
      } else if (s.charAt(i) == ']') {
        if (st.isEmpty() || st.peek() != '[') {
          return "no";
        } else if (!st.isEmpty()) {
          st.pop();
        }
      } else if (s.charAt(i) == ')') {
        if (st.isEmpty() || st.peek() != '(') {
          return "no";
        } else if (!st.isEmpty()) {
          st.pop();
        }
      }
    }
    if (st.isEmpty()) {
      return "yes";
    } else {
      return "no";
    }
  }

}
