package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class rightbigNum {

  public static void main(String[] args) throws Exception{
//    Scanner sc = new Scanner(System.in);
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    int a = sc.nextInt();
//    int[] b =new int[a];
//    int max = 0;
//    String answer = "";
//    for(int i=0; i<a;i++){
//      b[i] = sc.nextInt();
//    }
//    List<String> list = new ArrayList<>();
//    for(int s =0; s<a;s++){
//      int count = 0;
//      Stack<Integer> stack = new Stack<>();
//      for(int j=s+1 ;j<a;j++) {
//          stack.push(b[j]);
//          if(b[s] < stack.peek()){
//             max = stack.peek();
//            count++;
//          }
//          if(count==1){
//            break;
//          }
//      }
//
//      if(count==0){
//        list.add(String.valueOf(-1));
//      }
//      else{
//        list.add(String.valueOf(max));
//      }
//      answer = String.join(" ",  list);
//
//
//    }
//    bw.write(answer);
//    bw.flush();
//    bw.close();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stack = new Stack<Integer>();

    int N = Integer.parseInt(br.readLine());
    int[] seq = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    for(int i=0; i<N; i++){
      seq[i] = Integer.parseInt(st.nextToken());
    }

    for(int i=0; i< N; i++){
      while(!stack.isEmpty() && seq[stack.peek()] < seq[i]){
        seq[stack.pop()] = seq[i];
      }

      stack.push(i);
    }

    while(!stack.isEmpty()){
      seq[stack.pop()] = -1;
    }
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<N; i++){
      sb.append(seq[i]).append(' ');
    }
    System.out.println(sb);
  }
}
