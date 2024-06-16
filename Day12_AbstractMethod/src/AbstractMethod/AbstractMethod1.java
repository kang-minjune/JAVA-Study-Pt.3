package AbstractMethod;

public class AbstractMethod1 {
   public static void main(String[] args) {
	   
   }
}

abstract class Unit{
	int x, y;
	abstract public void move();
	void stop(){}
}



class Marine extends Unit{
	int x, y;
	void stop() {}
	void steamPack() {}
	
	@Override
	public void move() {
	    System.out.println(x + ", " + y);
	}
}



class Tank extends Unit{
	int x, y;
	void stop() {}
	void changMode() {}
	
	@Override
	public void move() {
		
	}
}



class DropShip extends Unit{
	int x, y;
	void stop() {}
	void unload() {}
	
	@Override
	public void move() {
		
	}
}

