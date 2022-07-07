import java.util.*;

public class 배열중복값제거 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    Stack<Integer> stack = new Stack<>();
    Arrays.sort(arr); // 1 2 3 3 4 5
    for(int i = 0; i < n; i++){ // 1 3 4 5
      System.out.println("arr[i] = " + arr[i]);
      if(stack.contains(arr[i])) {
        System.out.println(stack.pop());
      }
      else{
        stack.add(arr[i]);
      }
//      if(arr[i] == arr[i+1]){
//        System.out.println("pop value = " + stack.pop());
//      }
//      if(sta)
//      else if(arr[i] != arr[i+1]){
//        System.out.println("add value = " + stack.add(arr[i]));
//      }
    }
    int[] arr2 = new int[stack.size()];
//    for(int i= 0; i < stack.size(); i++){
//      arr2[i] = stack.pop();
//    }
    int i = 0;
    while(!stack.isEmpty()){
      arr2[i] = stack.pop();
      i++;
    }
    for(int j = arr2.length-1;  j >= 0; j--){
      System.out.println(arr2[j]);
    }
  }
}
