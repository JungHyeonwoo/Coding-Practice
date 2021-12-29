package Programmers.Complete;

public class count_primeNum {
  public static void main(String[] ar){
    int n = 100000;
    int answer = 0;
    int prime[] = new int[n+1];
    prime[0] = 1; prime[1] = 1;
    for(int i=2; i<=n; i++){
      if(prime[i] == 0 ){
        answer++;
        for(int j=i;j<=n;j+=i){
          prime[j] = 1;
        }
      }
    }
    System.out.println(answer);
  }
}
