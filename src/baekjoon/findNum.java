package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class findNum {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    int A[] = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    int M = Integer.parseInt(br.readLine());
    int[] b = new int[M];
    StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < M; i++) {
      int find = 0;
      b[i] = Integer.parseInt(st1.nextToken());
      for (int j = 0; j < A.length; j++) {
        if (b[i] == A[j]) {
          find++;
        }
      }
      if (find == 0) {
        bw.write(0 + "\n");
      } else {
        bw.write(1 + "\n");
      }
    }
    bw.flush();
  }
}
