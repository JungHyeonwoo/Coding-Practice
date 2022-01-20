package Programmers.Complete;

public class new_id {
  public static void main(String[] ar){
    String new_id = "z-+.^.";
    new_id = new_id.toLowerCase();
    System.out.println("level1" + new_id);
    new_id = new_id.replaceAll("[^-_a-z0-9.]", "");
    System.out.println("level2" + new_id);
    new_id = new_id.replaceAll("\\.{2,}",".");
    System.out.println("level3" + new_id);
    new_id = new_id.replaceAll("(^\\.)","");
    new_id = new_id.replaceAll("\\.$", "");
    System.out.println("level4" + new_id);
    if(new_id.equals("")){
      new_id+="a";
    }
    new_id = new_id.replaceAll("\"^.{0,15}\"","");
    System.out.println("level5" + new_id);
    new_id = new_id.replaceAll("(\\.$)","");
    System.out.println("level6" + new_id);
    if (new_id.length() >= 16) {
      new_id = new_id.substring(0, 15);
    }
    if(new_id.endsWith(".")){
      new_id = new_id.substring(0,14);
    }
    if(new_id.length() <= 2) {
      for(int i = new_id.length(); i < 3; i++){
        new_id += new_id.substring(new_id.length()-1);
      }
    }
    System.out.println("level7" + new_id);
  }
 // "...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
  //예2	"z-+.^."	"z--"
  //예3	"=.="	"aaa"
  //예4	"123_.def"	"123_.def"
  //예5	"abcdefghijklmn.p" abcdefghijklmn
}
