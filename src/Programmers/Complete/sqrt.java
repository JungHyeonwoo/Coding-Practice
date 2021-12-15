package Programmers.Complete;

// 정수 제곱근 판별
public class sqrt {
  public static void main(String[] args){

    long n = 333;
    double answer =0;
    double sqrt = Math.sqrt(n) ; //11
    if(sqrt*10%10==0){
      answer = Math.pow(sqrt+1,2);
    }
    else {answer = -1;}

    System.out.println("answer = " + (long)answer);
  }

}
