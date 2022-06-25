import java.util.*;
import java.io.*;

public class hansu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = hansu(n);
        System.out.println(n);
    }
    public static int hansu(int n){
        int cnt = 0;
        if(n < 100){
            return n;
        }
        else {
            cnt = 99;
            for(int i = 100; i <= n; i++){
            int hundred = i/100;
            int ten = (i/10)%10;
            int one = i%10;
            
            if((hundred-ten) == (ten-one)){
                cnt++;
                }
            }
        }
        return cnt;
    }
}
