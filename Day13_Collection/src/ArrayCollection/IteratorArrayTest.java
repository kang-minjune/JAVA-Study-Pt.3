package ArrayCollection;

import java.util.ArrayList;
import java.util.Iterator;

// Iterator 사용 예 
public class IteratorArrayTest {
     public static void main(String[] args) {
    	 ArrayList<Integer> al = new ArrayList<Integer>();
    	 
    	 for(int i = 0; i<10; i++) {
    		 al.add(i+1);
    	 }
    	 
    	 //Iterator를 사용하여 ArrayList의 모든 원소를 순회
    	 Iterator<Integer> iterator = al.iterator();
    	 
    	 while(iterator.hasNext()) {
    		 int element = iterator.next();
    		 System.out.println("Element: " + element);
    	 }
     }
}
