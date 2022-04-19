package baekjoon;

public class ipcheck {

  public static void main(String[] args) {
    for(int i=1; i<=4; i++){
      for(int j=1;j<=250;j++){
        String ip = "10.9";
        ip =  ip +  "." + String.valueOf(i);
        ip = ip + "." + String.valueOf(j);
        System.out.println(ip);
      }
    }
  }

}
