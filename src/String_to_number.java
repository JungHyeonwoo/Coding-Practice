// 숫자 문자열과 영단어
public class String_to_number {

  public int solution(String s) {
    String[] numArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
        "nine"};
    for (int i = 0; i < numArray.length; i++) {
      if (s.contains(numArray[i])) {
        s = s.replace(numArray[i], Integer.toString(i));
      }
    }
    return Integer.parseInt(s);
  }
}
