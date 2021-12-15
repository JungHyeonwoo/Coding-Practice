package Programmers.Complete;

// 가운데 글자 가져오기
public class middleString {
  public static void main(String[] ar){
    String s = "abcde";
    int a = s.length()%2;
    String answer = "";
    System.out.println(s);
    if(a==0){
      answer = s.substring(s.length()/2-1,s.length()/2+1);
    }
    else{
      answer = s.substring(s.length()/2,s.length()/2+1);
    }
    System.out.println(answer);
  }
}
