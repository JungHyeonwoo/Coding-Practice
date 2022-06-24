import java.util.Scanner;

public class fibonacci1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = fib(n);
    int b = fibonacci(n);
    System.out.println(a + " " + b);
  }

  public static int fib(int n) {
    if (n == 1 || n == 2) {
      return 1;
    } else {
      return (fib(n - 1) + fib(n - 2));
    }
  }

  public static int fibonacci(int n) {
    int[] f = new int[n + 1];
    f[1] = 1;
    f[2] = 1;
    if (n >= 3) {
      for (int i = 3; i <= n; i++) {
        f[i] = f[i-1] + f[i-2];
      }
    }
    return f[n];
  }
}
