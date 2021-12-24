package Programmers.fail;

// 시저 암호
public class caesar_cipher {
  public static void main(String[] args){
    String s = "AB";
    int n = 1;
    String answer = "";
    String[] a = s.split("");// A B
    for(int i=0; i<a.length;i++){
      a[i] = String.valueOf(a[i].charAt(i) + n);

    }
  }
}
