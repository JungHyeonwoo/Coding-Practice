package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class palindrome {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      String a = br.readLine();
      StringBuilder sb = new StringBuilder();
      sb.append(a);
      StringBuilder rsb = new StringBuilder();
      String d = rsb.append(a).reverse().toString();
      if(a.equals(String.valueOf(0))) {
        break;
      }
      if(a.equals(d)){
        System.out.println("yes");
      }
      else{
        System.out.println("no");
      }
    }
  }

}
