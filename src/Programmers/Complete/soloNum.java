package Programmers.Complete;

import java.util.*;
// 같은 숫자는 싫어

public class soloNum{
  public static void main(String[] args) {
    int[] arr = {1, 1, 3, 3, 0, 1, 1};
//    int[] arr = {4,4,4,3,3};
    LinkedList<Integer> aL = new LinkedList<>();
    aL.add(arr[0]);
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]!=aL.getLast()){
          aL.add(arr[i]);
        }
      }
    System.out.println("aL = " + aL);
    Integer[] listing = aL.toArray(new Integer[aL.size()]);
    int[] answer = Arrays.stream(listing).mapToInt(Integer::intValue).toArray();
    }
  }
