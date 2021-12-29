package Programmers.Complete;

public class GCD_LCM {
  public static void main(String[] ar){
    int n = 20;
    int m = 30;
    int gcd = 1;
    int lcm = 0;
    int[] answer = new int[2];
    for(int i = 1; i<=n;i++) {
      if(m%i==0&&n%i==0){
        gcd = i;
      }
    }
    lcm = n*m/gcd;
    System.out.println("gcd = " + gcd);
    System.out.println("lcm = " + lcm);
    answer[0] = gcd;
    answer[1] = lcm;
    System.out.println("answer = " + answer);
  }
}
