package Interface;

public class InterfaceMission {

}

class Button{
	int w;
	int h;
	String text;
	
	Button(int w, int h){
		this.w = w;
		this.h = h;
	}

	public void onClick() {
		
	}
}

interface OnClickListener{
     static void onClick(){}
      
}

class Button_Ok  extends Button implements OnClickListener{

	Button_Ok(int w, int h) {
		super(w, h);
		text = "Ok";
	}
	
	@Override
	public void onClick() {
		
	}
}

class Bitton_Cancel extends Button implements OnClickListener{

	Bitton_Cancel(int w, int h) {
		super(w, h);
		text = "Cancel";
	}
	
	@Override
	public void onClick() {
		
	}

}