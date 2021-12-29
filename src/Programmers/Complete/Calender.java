package Programmers.Complete;

public class Calender {
  public static void main(String[] args){
    int a = 5;
    int b = 24;
    String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
    String answer = "";
    int date = 0;
    int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
    for(int i=0; i<a-1; i++){
      date += month[i];
    }
    date += b-1;
    System.out.println(a+"월"+b+"일은"+day[date%7]+"니다.");
  }
}
