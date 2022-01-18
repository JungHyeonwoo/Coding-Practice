package Programmers.Complete;

public class make_primeNum {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};
    int result = 0;
    for(int i=0; i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        for(int k=j+1;k<nums.length;k++){
          if(isPrime(nums[i] + nums[j] + nums[k])){
            result++;
          }
        }
      }
    }
    System.out.println(result);
  }
  public static boolean isPrime(int num){
    boolean isPrime = true;
    for(int i=2;i<num;i++){
      if(num%i==0){
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }
}
