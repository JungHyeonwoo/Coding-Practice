package Programmers.fail;

public class reverseIntList {
  public static void main(String[] ar){
    long n = 12345;
    int[] answer ={};

    String temp = Long.toString(n);
    String[] tmp = temp.split("");
    for(int i=tmp.length;i>0;i--){
      int j = tmp.length-i;
      answer[j] = Integer.parseInt(tmp[i]);
    }
    System.out.println("answer = " + answer);
  }

}
