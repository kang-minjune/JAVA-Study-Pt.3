//상속 - overriding(오버라이딩)에 대해

package Inheritance;

public class Inheritance2_Day10{
	public static void main(String[] args) {
		
	}
	
	static void test1() {
//		Point p1 = new Point(1, 2);
	    
	}
	
}

//클래스명 : Point
//멤버변수 : 데이터타입-변수명-용도
//int - x - x좌표
//int - y - y좌표
//생성자
//매개변수가 2개인 생성자 - x, y 좌표를 전달받아 멤버변수에 저장
//메서드 : 메서드명-반환타입-기능-전달인자
//getLocation - String - xy 좌표값을 문자열로 반환 - 없음
//테스트 코드 : x,y좌표가 10, 20인 Point 인스턴스를 생성하고 화면에 좌표값을 출력

class Point {
	int x;
	int y;
	
	Point(){
		super();
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		
		return "x: "  + x + ",   y: " + y;
	}
}

class Point3D extends Point{
	
	int z ;
	 
	Point3D(int x, int y, int z) {
		
//		this.x = x;
//		this.y = y;
		
		super(x, y); //이렇게 쓰면 위처럼 안써도 된다.
		this.z = z;
	}
	
	@Override 
	String getLocation(){
		return super.getLocation() +", " + z;
	}
}
	