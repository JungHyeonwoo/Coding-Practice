package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
  public static void main(String[] ar) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = 0, c=1;
    int fibonacci = 0;
    int n=1;
    while(n!=a){
      n++;
      fibonacci = b+c; // 1 2 3 5
      b = c; // 1 1 2 3
      c = fibonacci; // 1 2 3
    }
    System.out.println(c);
  }
}
