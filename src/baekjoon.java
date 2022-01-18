import java.io.*;
import java.util.*;

public class baekjoon {

  public static void main(String[] ar) throws IOException {
    Scanner sc = new Scanner(System.in);
    int i  = sc.nextInt();
    int result = 0;
    if(i==0)
    while(i>1){
      result *=i;
      i--;
    }
    System.out.println(result);
    System.out.println(factorial(i));
  }
  public static int factorial(int i){
    int result = 0;
    while(i>1){
      result = result*i;
      i--;
    }
    return result;
  }

}
//0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
// 다음 예를 보자.
//26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
//위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//
//N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
// 26 - 4 55 -3 1 - 60 0 - 1

//
//  public static boolean IsDecimal(int a) {
//    if (a == 1)
//      return false;
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

//Stringtokenizer

//  public static boolean checkPrime(int Number) {
//    boolean answer = false;
//    if (Number == 1) {
//      return false;
//    }
//    int cnt = 0;
//    for (int j = 2; j <= Number; j++) {
//      if (Number % j == 0) {
//        answer = true;
//      }
//    }
//    if (cnt == 2) {
//      answer = true;
//    }
//    else {
//      answer =  false;
//    }
//    return answer;
//  }
//
//  String a = br.readLine();
//  int b = Integer.parseInt(a.split(" ")[0]);
//  int c = Integer.parseInt(a.split(" ")[1]);