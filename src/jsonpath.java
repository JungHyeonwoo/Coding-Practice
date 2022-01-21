import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jsonpath {

  public static void main(String[] ar) throws IOException {
    List<Integer> asdf = new ArrayList<>();
    int[] a = {3,2,4,5,1};
    for(int i=0; i<a.length;i++){
      asdf.add(a[i]);
    }
    Collections.sort(asdf);
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