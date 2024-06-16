package Inheritance;

public class InheritanceTv {
	//클래스명 : Tv
	//멤버변수 : 데이터타입-변수명-용도 
	// boolean-power-전원on/off
	// int-channel-채널
	// int-volumn-음량
	//생성자
	//기본 생성자 : 채널은 0, 음량은 0
	//매개변수가 2개인 생성자 : 채널과 음량을 전달받아 멤버변수를 초기화
	//메서드 메서드명-반환타입-기능-전달인자
	//setChannel - 없음 - 정수값을 입력받아 채널 멤버변수에 저장 - int
	//getChannel - int - 멤버변수에 저장된 채널 값을 반환 - 없음
	//setVolumn - 없음 - 정수값을 입력받아 음량 멤버변수에 저장 - int
	//getVolumn - int - 멤버변수에 저장된 음량 값을 반환 - 없음
	//powerOnOff - 없음 - 호출할 때 마다 전원 멤버변수 값을 반전 - 없음
}

class Tv {
	
	boolean power ;
	int channel;
	int volumn;
	
	Tv(){
		this(0, 0);
	}
	
	Tv(int channel, int volumn){
		this.channel = channel;
		this.volumn = volumn;
	}
	
	void setChannel(int channel) {
		this.channel = channel;
	}
	
	void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	int getChannel() {
		return channel;
	}
	
	int getVolumn() {
		return volumn;
	}
	
	void powerOnOff() {
		power = !power;
	}

}
