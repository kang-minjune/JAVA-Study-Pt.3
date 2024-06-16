//다형성 개념 1

package polymorphism;

public class polymorphism1 {
     public static void main(String[] args) {
    	 CaptionTv ctv = new CaptionTv();
    	 ctv.channel = 10;
    	 ctv.power();
    	 
    	 Tv t = new CaptionTv();
     }
}

class CaptionTv extends Tv{
	String text;
	void caption() {
		System.out.println("캡션가능");
	}
}

class Tv{
	int channel;
	boolean power;
	
	void power() {power =! power;}
	void channelUp(){channel++;}
	void channelDown() {channel++;}	
}
