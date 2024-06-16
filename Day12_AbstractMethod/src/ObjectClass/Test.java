//2024.04.09(화)
package ObjectClass;

public class Test {
   public static void main(String[] args) {
	test3();
   }
   
   
   //equals() 메소드 이해하기.
   static void test1() {
	   Product p1 = new Product(1);
	   System.out.println("제품의 아이디는: " + p1.getId());
	   
	   Product p2 = new Product(1);
	   System.out.println("제품의 아이디는: " + p2.getId());
	   
	   if(p1.equals(p2)) {
		   System.out.println("같습니다.");
	   }
	   else System.out.println("다릅니다.");
   }
   
   //equals()에서 같은 값임에도 왜 다른것일까?
   static void test2() {
		Member m1 = new Member("이지연", 123);
		Member m2 = new Member("이지연", 123);
		
	    if(m1.equals(m2)) {
	    	System.out.println("같습니다.");
	    }
	    else {
	    	System.out.println("다릅니다.");
	    } //위 객체에 불러온 값은 같지만 다릅니다.가 출력되는 이유는 m1과 m2에 저장된 주소값이 다르기 때문이다. 
	      //(현실세계에서는 같지만 단순 비교이기 때문에 프로그램상 다른것이다.) - 이때 필요한 것은 오버라이딩이다. Member 클래스로 이동
	    
	    String str = m1.toString();
	    System.out.println(str);
   }
   
   //단순 비교와 equals() 메서드의 결과비교 
   static void test3() {
	   String s1 = "abc";
	   String s2 = "abc";
	   String s3 = new String("abc");
	   String s4 = new String("abc");
	   
	   System.out.println(s1==s2);
	   System.out.println(s3==s4);
	   System.out.println(s1.equals(s2));
	   System.out.println(s3.equals(s4)); //오버라이딩 하면 문자열만 같으면 true 
   
   }
   
   static void test4() {
	   //초기화
	   String s = "";
	   char ch = ' ';
	   
	   
	   System.out.println(s);
	   System.out.println(ch);
	   
	   //정수를 문자열로 
	   int i = 100;
	   String str1 = i + "";
	   String str2 = String.valueOf("100");
	   
	   System.out.println(i);

	   //문자열을 정수로
	   int i2 = Integer.parseInt("100");
	   int i3 = Integer.valueOf("100");
	   char c = "A".charAt(0);
   }

}


class Product{
	int id;
	
	Product(int id){
		this.id = id;		
	}
	
	int getId() {
		return id;
	}
}

class Member{
	String name;
	int id;
	
	Member(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	//위 오버라이딩 부분 
	@Override
	public boolean equals(Object obj) {
		int id = ((Member)obj).id;
		if(this.id == id) {
			return true;
		}
		return false;
	}
	
	@Override 
	public String toString() {
	    return name + ", " + id;
	}
}
