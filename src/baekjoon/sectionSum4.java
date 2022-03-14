package baekjoon;

import java.util.Scanner;

public class sectionSum4 {

  public static void main(String[] ar) throws Exception {
    Scanner sc = new Scanner(System.in);
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String a = br.readLine();
//    StringTokenizer st1 = new StringTokenizer(a, " ");
//    int N = Integer.parseInt(st1.nextToken());
//    int M = Integer.parseInt(st1.nextToken());
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] index = new int[N + 1];
//    String b = br.readLine();
//    StringTokenizer st2 = new StringTokenizer(b, " ");
    index[0] = 0;

    for (int i = 1; i <= N; i++) {
//      index[i] = index[i - 1] + Integer.parseInt(st2.nextToken());
      index[i] = index[i-1] + sc.nextInt();
    }
    for (int i = 0; i < M; i++) {
//      String c = br.readLine();
//      StringTokenizer st3 = new StringTokenizer(c, " ");
//      int firstIndex = Integer.parseInt(st3.nextToken());
//      int lastIndex = Integer.parseInt(st3.nextToken());
      int firstIndex = sc.nextInt();
      int lastIndex = sc.nextInt();
      System.out.println(index[lastIndex] - index[firstIndex - 1]);
    }

  }

}
