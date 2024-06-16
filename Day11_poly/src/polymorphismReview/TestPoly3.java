package polymorphismReview;

public class TestPoly3 {

	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Child();
		
		System.out.println(c.x);
		System.out.println(p.x);
		
		c.method();
		p.method();
	}

}

class Parent{
	int x = 100;
	void method() {
		System.out.println("parent method");
	}
}

class Child extends Parent{
	int x = 200;
	
	void method() {
		System.out.println("child method");
	}
}
