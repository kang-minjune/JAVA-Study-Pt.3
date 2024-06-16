package ArrayCollection;

//2024.04.16(화) 
//ArrayList 사용 예 p.37
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCollectionTest {
    public static void main(String[] args) {
    	func3();
    	
    }
    
    static void func1() {
    	ArrayList<Integer> numbers = new ArrayList<>();
    	Scanner scanner = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print("정수를 입력하세요 (0 입력 시 종료): ");
    		int num = scanner.nextInt();
    		
    		if(num == 0) {
    			break;
    		}
    		
            numbers.add(num);
    	}
    	
    	int sum = 0;
    	for(int n : numbers) {
    		 sum += n;
    	}
    	
    	System.out.println("입력한 숫자들: " + numbers);
    	System.out.println("총합: " + sum);
    }
    
    static void func2() {
    	//번외 
    	//메서드 하나 추가해서 1~10까지 저장하기 
    	
    }
    
    static void func3() {
    	//for-each 반복문을 사용하여 1부터 10까지 출력
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < 10; i++) {
        	al.add(i+1);
        }
        
        for(int n : al) {
        	System.out.println(n);
        }
    }
}
