package Programmers.Complete;

import java.util.ArrayList;

public class secretMap {
  public static void main(String[] ar){
    int n=5;
    int[] arr1 = {9,20,28,18,11};
    int[] arr2 = {30,1,21,17,28};
    String[] two1 = new String[arr1.length];
    String[] answer = new String[arr1.length];
    String[] two2 = new String[arr2.length];
    for(int i=0; i<arr1.length;i++) {
      two1[i] = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i])));
      System.out.println("two1[" + i + "] = " + two1[i]);
    }
    for(int i=0; i<arr2.length;i++){
      two2[i] = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr2[i])));
      System.out.println("two2[" + i + "] = " + two2[i]);
    }
    for(int i=0; i<arr1.length;i++){
      String ans = ""; // #
      for(int j=0; j<arr2.length;j++){
        if(two1[i].charAt(j) =='1' || two2[i].charAt(j) == '1'){
          ans +="#";
      }
        else{
          ans +=" ";
        }
      }answer[i] = ans;

    }
  }
}
