package Interface;

public class Interface1 {

}

class Unit {
	int x;
	int y;
	void stop(){}
}

interface Fightable{
	void move(int x, int y);
	void attack();
}

class Fighter_A extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {}

	@Override
	public void attack() {
		System.out.println("A가 싸웁니다.");
		
	}
	
}

class Fighter_B extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {}

	@Override
	public void attack() {
		System.out.println("B가 싸웁니다.");
		
	}
	
}


