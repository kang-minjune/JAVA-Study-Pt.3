//다형성 개념 2

package polymorphism;

public class polymorphism2 {
    public static void main(String[] args) {
    	testpoly3();
    }
    
    static void testPoly() {
    	Car c;
    	FireEngine f;
    	Ambulance a = new Ambulance();
    	
//		f = (FireEngine)a; // 두 클래스 사이에는 상속 관계가 성립하지 않기 때문에 형변환이 불가

		c = a;				// 자동 형변환
		a = (Ambulance) c; 	// 형변환연산을 적용
    }
    
    static void testPoly2() {
    	Car car = null;
    	FireEngine fe = new FireEngine();
    	FireEngine fe2 = null;
    	
    	if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance");
		}
		if(fe instanceof Object) {
			System.out.println("This is a Object instance");
		}
		
		
    	fe.water();
    	car = fe;
    	// car.water();  <- 컴파일 오류가 난다. car는 조상 객체이기 때문에 water()를 불러올 수 없다 .

        fe = (FireEngine)car;
        fe2.water();
    }
    
    static void testpoly3() { //매개 변수의 다형성 
    	Car[] arr = new Car[5];
    	
    	arr[0] = new Ambulance();
    	arr[1] = new FireEngine();
    	arr[2] = new FireEngine();
    	arr[3] = new Ambulance();
    	arr[4] = new FireEngine();
    	
//    	arr[0].drive();
//    	arr[0].stop();
//    	((Ambulance)arr[0]).siren(); //형변환 하면 오류가 나지 않는다. (Car 클래스가 들어가있기 때문에 형 변환 해줘야한다.
    	
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] instanceof FireEngine) {
    			((FireEngine)arr[i]).water();
    		}
    		else ((Ambulance)arr[i]).siren();
    	} //instanceof를 사용하여 배열에 저장된 요소 자동 출력
    	
    }
}

class Car{
	String color;
	int door;
	
	void drive() {}
    void stop() {}

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
