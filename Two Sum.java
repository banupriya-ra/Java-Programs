import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] num = {2, 7, 9, 11};
      int target = 9;

      HashMap <Integer, Integer> hm = new HashMap<> ();
      for(int i=0; i<num.length; i++){
        int sum = target - num[i];
        if(hm.containsKey(sum)){
          System.out.println("Indexes:" + sum + "," + num[i]);
          return;
        }
        hm.put(num[i], i);
      }
      System.out.println("No pairs found");  
    }
}