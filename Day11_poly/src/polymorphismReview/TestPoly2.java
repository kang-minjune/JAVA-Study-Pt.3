package polymorphismReview;

public class TestPoly2 {

	public static void main(String[] args) {
		testPoly2_1();
	}
	
	static void testPoly(){
		Car c;
		FireEngine f ;
		Ambulance a = new Ambulance();
		
//		f = (FireEngine)a; // 두 클래스 사이에는 상속 관계가 성립하지 않기 때문에 형변환이 불가

		c = a;				// 자동 형변환
		a = (Ambulance) c; 	// 형변환연산을 적용
	}
	
	static void testPoly1() {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; 
//		car.water();  
		
		fe2 = (FireEngine)car;
		fe2.water();
		
	}
	
	static void testInstanceOf() {
		
		FireEngine f = new FireEngine();
		Car c = new Car();
		Ambulance a = new Ambulance();
		
		if ( f instanceof FireEngine)		{
			System.out.println("FireEngine");
			
		}

		if( f instanceof Car) {
			System.out.println("Car");
			
		}
		
		if( f instanceof Object) {
			System.out.println("Object");
			
		}
		
	}
	
	static void testPoly2_1() {
		Car[] arr = new Car[5];
		
		arr[0] = new Ambulance();
		arr[1] = new FireEngine();
		arr[2] = new FireEngine();
		arr[3] = new Ambulance();
		arr[4] = new FireEngine();
		
//		arr[0].drive();
//		arr[0].stop();
//		((Ambulance)arr[0]).siren();
		
		//미션
		for(int i = 0 ;i <arr.length ; i++) {
			
			if(arr[i] instanceof FireEngine) {
				((FireEngine)arr[i]).water();
			}else {
				((Ambulance)arr[i]).siren();
			}
		}
	}
	
	static void testPoly2_2() {
		Car[] arr = new Car[5];
		
		arr[0] = new Ambulance();
		arr[1] = new FireEngine();
		arr[2] = new FireEngine();
		arr[3] = new Ambulance();
		arr[4] = new FireEngine();
		
		for(int i = 0 ;i < arr.length ;i++) {
			Car c = arr[i];
			
			if(c instanceof Ambulance) {
				((Ambulance)c).siren();
			}else if(c instanceof FireEngine) {
				((FireEngine)c).water();
			}
		}
	}
}

class Car{
	String color;
	int door;
	
	void drive() {	}
	void stop() {	}
}
class FireEngine extends Car{
	void water() { 
		System.out.println("water");
	}
}
class Ambulance extends Car{
	void siren() {
		System.out.println("siren");
	}
}