package baekjoon;

import java.io.*;
import java.util.*;

public class rightEqualBigNum {

  public static void main(String[] args) throws IOException{
    final int MAX = 1_000_001;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stack = new Stack<Integer>();

    int N = Integer.parseInt(br.readLine());

    int[] ans = new int[N];
    int[] count = new int[MAX];
    int[] index = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    for(int i=0; i<N; i++){
      index[i] = Integer.parseInt(st.nextToken());
      count[index[i]]++;
    }


    for(int i=0; i< N; i++){
      while(!stack.isEmpty() && count[index[i]]>count[index[stack.peek()]]){
        ans[stack.pop()] = index[i];
      }
      stack.push(i);
    }

    while(!stack.isEmpty()){
      ans[stack.pop()] = -1;
    }
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<N; i++){
      sb.append(ans[i]).append(" ");
    }
    System.out.println(sb);
  }
}

