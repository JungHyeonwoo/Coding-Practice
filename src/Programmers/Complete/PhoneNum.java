package Programmers.Complete;

public class PhoneNum {
  public static void main(String[] ar){
    String Phone_number = "01033334444";
    String answer = "";
    for(int i=0; i<Phone_number.length()-4;i++){
      answer += '*';
    }
    for(int i=Phone_number.length()-4;i<Phone_number.length();i++){
      answer += Phone_number.charAt(i);
    }
    System.out.println(answer);
  }
}
