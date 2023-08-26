package study;

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop () {
		System.out.println("STOP");
	}
}

interface Fightable {
	void move (int x, int y);
	void attack (Fightable f);
}

class Fighter extends Unit implements Fightable {
	public void move (int x, int y){
		System.out.println(String.format("[ %d, %d ] 로 이동", x, y));
	};
	public void attack (Fightable f){
		System.out.println(f+" 을()를 공격하기");
	};
	
	Fightable getFightable() {
		Fightable f = new Fighter(); //Fighter 를 생성해서 반환
		return f;
	}
	
}

public class FighterTest1 {

	public static void main(String[] args) {
//		Fighter f = new Fighter();
//		Unit f = new Fighter(); //Unit 에는 attack없으므로 사용불가
	
		Fightable f = new Fighter();
		f.move(100, 20);
		f.attack(new Fighter());
	}

}
