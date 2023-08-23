package exc;

class SutdaCard {
	int num = 1;
	boolean isKwang =true;

	String info() {
		return num + (isKwang? "K":"");
	}

}

public class Ex1 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard();
		SutdaCard card2 = new SutdaCard();

//		card1.num = 3;
//		card1.isKwang = false;

		System.out.println(card1.info()); //문자열
		System.out.println(card2.info());

	}

}
