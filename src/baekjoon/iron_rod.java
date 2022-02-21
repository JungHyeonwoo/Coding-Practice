package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class iron_rod {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int result = 0;
    Stack<Character> stack = new Stack<>();
    for(int i=0; i<input.length();i++){
      if (input.charAt(i) == '(') {
        stack.push('(');
      }
      else{
        stack.pop();
        if (input.charAt(i - 1) == '(') {
          result += stack.size();
        }
        else{
          // ()(((()())(())()))(())
          result+=1;
        }
      }
    }
    System.out.println(result);
  }
}
