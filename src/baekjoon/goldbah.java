package baekjoon;

import java.io.*;
import java.util.*;

public class goldbah {

  public static void main(String[] ar) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      int a = 0, b = 0, max = 0;
      ArrayList<Integer> Prime = new ArrayList<>();
      int Num = Integer.parseInt(br.readLine());
      for (int j = 1; j <= Num / 2; j++) {
        if (IsDecimal(j)) {
          if (IsDecimal(Num - j)) {
            Prime.add(j);
          }
        }
      }
      bw.write(Prime.get(Prime.size()-1)+" " + (Num-Prime.get(Prime.size()-1)) + "\n");

    }
    bw.flush();
  }

  public static boolean IsDecimal(int a) {
    if (a == 1) {
      return false;
    }
    for (int i = 1; i < 500; i++) {
      if (i > a) {
        return true;
      } else {
        if (a % i == 0) {
          if (i != 1 && i != a) {
            return false;
          }
        }
      }

    }
    return true;
  }
}
