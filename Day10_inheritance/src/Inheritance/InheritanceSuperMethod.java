package Inheritance;

public class InheritanceSuperMethod {
      public static void main(String[] args) {
    	  Child c = new Child();
    	  c.method();
      }
}

class Parent{
	int x = 10;
}

class Child extends Parent{
	int x = 20;
	
	void method() {
	    int x = 30; //메소드 안에 x가 존재할 수 있다. 그러나 자손과 조상클래스의 변동은 없기에 this.x와 super.x의 값은 변화 없다.
		System.out.println("x = " + x); //해당 클래스의 x를 불러온다.
		System.out.println("this.x = " + this.x); //자손 class의 x값을 불러오는 this()		
		System.out.println("super.x = " + super.x); //조상 class의 x값을 불러오는 super()		
	}
}
