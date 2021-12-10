// 3진법 뒤집기

import java.sql.SQLOutput;
import java.util.*;
public class reverse_ternary {
  public static void main(String[] agrs){

   int n= 45;
   int answer = 0;
    ArrayList<Integer> temp = new ArrayList<>();
    while(n/3!=0){
      temp.add(n%3);// 0  0 2 1
      n = n/3;//15   5 1 0
    }
    temp.add(n);
    System.out.println("temp = " + temp);
    System.out.println("temp.size() = " + temp.size());
    for(int i=0;i<temp.size();i++){ // 0 1 2 3 4
      answer+= temp.get(i) * Math.pow(3,(temp.size()-i-1)); //5 4 3 2 1
    }

   System.out.println("answer = " + answer);
  }
}
