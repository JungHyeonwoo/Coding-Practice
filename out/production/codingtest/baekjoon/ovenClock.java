import java.util.Scanner;
public class ovenClock {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int hour = sc.nextInt();
      int min = sc.nextInt();
      int plusMin = sc.nextInt();
      min += plusMin;
      if(min >=60){
        hour += min/60;
        while(min >= 60){
          min -=60;
        }
      }
      if(hour >=24){
        hour -=24;
      }
      String result = hour + " " + min;
      System.out.println(result);
  }
}
