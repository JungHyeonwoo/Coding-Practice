//package Programmers.fail;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//
//public class ParkingFee {
//
//  public static void main(String[] ar) {
//    int[] fees = {180, 5000, 10, 600};
//    String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT",
//        "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
//    int[] hour = new int[records.length];
//    int[] minute = new int[records.length];
//    List<String> carList = new LinkedList<>();
//    for(int i=0; i<records.length;i++) {
//      carList.add(records[i].split(" ")[1]);
//    }
//    carList = carList.stream().distinct().toList();
//    Collections.sort(carList);
//    for(int i=0;i<carList.size();i++){
//      List<String> inout = new ArrayList<>();
//      for(int j=0; j<records.length;j++){
//        if(records[j].contains(carList.get(i))){
//          inout.add(records[j]);
//        }
//      }
//      if(inout.size() %2 == 0){
//        for(int k=0; k<inout.size();k+=2){
//
//        }
//      }
//      else{
//
//      }
//      System.out.println(inout);
//    }
//    int[] answer = new int[carList.size()];
//    System.out.println(carList);
//
//
//    for(int j=0; j<carList.size();j++){
//
//    }
//  }
//
//}
