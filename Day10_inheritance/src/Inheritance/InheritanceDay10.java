//2024.04.02(화) 상속(inheritance)

/*
 
package Inheritance;

public class InheritanceDay10 {
	  public static void main(String[] args) {
		 test1();
	  
	  }
	  
	 //상속의 개념
	 static void func1() {
		 Car c1 = new Car(4, "red");
		   System.out.println(c1);
		   
		   SmartCar sc1 = new SmartCar();
		   System.out.println(sc1);
	 }
	 
	 
	 static void test1() {
		Point[] p = { new Point(100,100),
				      new Point(140,50),
				      new Point(200,100)};
				
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150), 50);
		
		t.draw(); //삼각형을 그린다.
		c.draw();//원을 그린다.
		
		
		
	 }  
}

//클래스명 : SmartCar
//멤버변수 : 데이터타입-변수명-용도
//boolean - autoMode - 자동 운전 여
//int-door-문의개수, String-color-차의색상
//생성자
//매개변수를 2개 갖는 생성자 - 문의개수,색상을 전달받아 멤버변수 초기화
//기본생성자 - 문의갯수는 4, 색상은 white  멤버변수 초기화
//메서드 
//toStirng()을 오버라이드 - 모든 멤버 변수를 문자열로 반환
//테스트 코드 : 문의 갯수와 색상이 다음과 같은
//        2개의 Car 인스턴스를 생성하고 정보를 출력
//        1번 인스턴스 - 4, white
//        2번 인스턴스 - 3, red

//상속의 개념

class Car{
	int door;
	String color;
	
	public Car(int d, String c) {
		door = d;
		color = c;
	}
	
	
	
}

class SmartCar extends Car{ //extends를 이용해 Car를 상속받는다.
	boolean autoMode = true;

}




//상속에 클래스간의 관계보기 
class Shape{
	String color = "black";
	void draw() {
		System.out.printf("[color = %s]\n", color);
	}
	
}

class Point{
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Point(){
		this(0,0);
	}
	
	String getXY() {
		return "(" + x + "," + y + ")"; 
	}
}

class Circle extends Shape{
	Point center;
	int r;
	
	Circle(){
		this(new Point(0,0), 100);
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	void draw() {
		System.out.printf("[center = (%d,%d, r=%d, color.y, r, color");
	}
}

class Triangle extends Shape{
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]\n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}

*/