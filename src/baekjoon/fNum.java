package baekjoon;

import java.io.*;
import java.util.*;

public class fNum {
    public static void main(String[] args) {
        boolean what = true;
        Scanner sc = new Scanner(System.in);
        while(what == true){
            int fNum = sc.nextInt();
            int sNum = sc.nextInt();
            if(fNum==0 && sNum==0) break;
            if(fNum > sNum) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
