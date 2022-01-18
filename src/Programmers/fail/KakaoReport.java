package Programmers.fail;

import java.util.*;

public class KakaoReport {
  public static void main(String[] ar){
//    String[] id_list = {"muzi","frodo","apeach","neo"};
    String[] id_list = {"con","ryan"};
//    String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
    String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
    int k = 3;
//    int k = 2;
    int cnt=0;
    String[] newreport = Arrays.stream(report).distinct().toArray(String[]::new);
    String[] reported = new String[report.length];
    String[] reporter = new String[report.length];
    List<String> blockedMember = new ArrayList<>();
    int[] answer = new int[id_list.length];
    int[] counting = new int[id_list.length];
    List<String> asdf = new ArrayList<>();
    for(int i=0; i<newreport.length;i++){
      reported[i] = newreport[i].split(" ")[1];
      reporter[i] = newreport[i].split(" ")[0];
    }
    for(int i=0;i<reporter.length;i++){
      System.out.println("reporter[i] = " + reporter[i]);
      System.out.println(reported[i]);
    }
    for(int i=0; i<id_list.length;i++) { // reported 횟수 세서 counting에 넣기
      for (int j = 0; j < reported.length; j++) {
        if (id_list[i].equals(reported[j])) {
          counting[i]++;
        }
      }
      System.out.println(counting[i]); // k이상만크 counting된 Reported를 Report한 reporter의 answer값을 올리기
      if (counting[i] >= k) { //blockedMember : Frodo neo , Reporter muzi apeach frodo muzi appeach
        blockedMember.add(id_list[i]);
      }
      cnt++;
    }
    for(int h=0; h<reporter.length;h++){
      for(int m=0; m<blockedMember.size();m++){
        if(blockedMember.get(m).equals(reported[h])){
          asdf.add(reporter[h]);
        }
      }
    }
    for(int o=0; o< id_list.length;o++){
      for(int p=0; p<asdf.size();p++){
        if(id_list[o].equals(asdf.get(p))){
          answer[o]++;
        }
      }
    }
    System.out.println("asdf = " + asdf);
    System.out.println(blockedMember);
    System.out.println(Arrays.toString(answer));
  }
}



// id_list	report	k	result
//["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
//["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]