import java.io.IOException;
import java.util.*;

public class jsonpath {

  public static void main(String[] ar) throws IOException {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int w = sc.nextInt();
    int h = sc.nextInt();
    sc.close();
    int xm0, ym0, wmx, hmy;
    xm0 = minus(x, 0);
    ym0 = minus(y, 0);
    wmx = minus(w, x);
    hmy = minus(h, y);
    int minx = Math.min(xm0, wmx);
    int miny = Math.min(ym0, hmy);
    int result = Math.min(minx, miny);
    System.out.println(result);


  }



  public static int minus(int a, int b) {
    return a - b;
  }

}
//  public static boolean IsDecimal(int a) {
//    if (a == 1) {
//      return false;
//    }
//    for (int i = 1; i < 1000; i++) {
//      if (i > a) {
//        return true;
//      } else {
//        if (a % i == 0) {
//          if (i != 1 && i != a) {
//            return false;
//          }
//        }
//      }
//
//    }
//    return true;
//  }
//}
//String.format("%.6f",v);