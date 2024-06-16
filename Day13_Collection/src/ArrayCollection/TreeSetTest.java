package ArrayCollection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class TreeSetTest {
      public static void main(String[] args) {
    	  func2();
      }
      
      //HashSet을 이용한 출력과 랜덤숫자(로또번호) 뽑기
      static void func1() {
    	  HashSet<Integer> myset = new HashSet<Integer>();
    	  myset.add(1);
    	  myset.add(3);
    	  myset.add(5);
    	  myset.add(1);
    	  System.out.println(myset.size());
    	  
    	  Random rand = new Random();
    	  
    	  HashSet<Integer> lotSet = new HashSet<Integer>();
    	  
    	  while(lotSet.size() < 6) {
    		  int n = rand.nextInt(45) + 1;
    		  lotSet.add(n);
    	  }
    	  
    	  System.out.println(lotSet);
      }
      
      //HashMap 예제 
      static void func2() {
    	  HashMap<String, String> hm = new HashMap<>();
    	  hm.put("apple", "사과");
    	  hm.put("banana", "바나나");
    	  hm.put("orange", "오렌지");
    	  
//    	  System.out.println(hm.get("apple"));
    
      }
}



