package Programmers.fail;

public class 영어끝말잇기 {
  public static void main(String[] ar){
    int n = 3;
    String[] words = {"tank","kick","know","wheel","land","dream","mother","robot","tank"};
//    String[] words = {"hello", "observe", "effect", "take", "either","recognize","encourage","ensure","establish","hang","gather","refer","reference","estimate","executive"};
//    String[] words = {"hello", "one", "even", "never","now","world","draw"};
    // 1 같은 단어가 나왔는지 체크 | 1글자 단어 체크 끝말이이어졋느지 체크
    // 2 틀린 단어의 위치 % 3 해서 몇 번째 사람이 틀렷는지  찾기
    //
    int[] answer =new int[2];
    String temp = "";
    for(int i=0; i<words.length;i++){
      temp = words[i];
      if(temp.length()==1){
        System.out.println(i);
      }
    }
    System.out.println(answer);

  }
}
