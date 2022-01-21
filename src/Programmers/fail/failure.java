package Programmers.fail;

public class failure {
  public static void main(String[] ar) {
    int n = 5;
    int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
    int[] count = new int[n];
    int allP = stages.length;
    int[] result = new int[n];
    for(int i=0; i<stages.length;i++){
      for(int j=1; j<=n; j++){
        if(stages[i] == j){
          count[j-1]++;
          allP--;
        }

        if(n < stages[i]){

        }
      }

    }
    for(int i=0;i<count.length;i++){
      System.out.println(count[i]);
    }

  }


}
