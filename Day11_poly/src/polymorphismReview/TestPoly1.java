package polymorphismReview;
public class TestPoly1 {
	
	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.power();
		ctv.caption();
		
		Tv t = new CaptionTv();
		t.channel = 5;
		t.power();
//		t.caption();
		
	}

}

class CaptionTv extends Tv{
	String text;
	void caption() {
		System.out.println("캡션기능");
	}
}

class Tv{
	int channel;
	boolean power;
	
	void power() {	power = !power;}
	void channelUp() {	channel++;}
	void channelDown() { channel--;	}
	
}
