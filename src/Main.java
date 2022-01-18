import java.io.IOException;
import java.util.Scanner;

public class Main {


  public static void main(String[] ar) throws IOException {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int result = 0;
    for (int a = 0; a < i; a++) {
      int cnt = 0;
      int x = sc.nextInt();
      int y = sc.nextInt();
      int apartment[][] = new int[15][15];
      for(int b=0;b<15;b++) {
        apartment[0][b] = b;
        apartment[b][1] = 1;
      }
      for(int c=1;c<15;c++){
        for(int d=1;d<15;d++){
         apartment[c][d] = apartment[c-1][d] + apartment[c][d-1];
        }
      }
      System.out.println(apartment[x][y]);
    }
  }



  public static long sum(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum;
  }
}