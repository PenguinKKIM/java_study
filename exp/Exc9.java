package exc;

public class Exc9 {

//	숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
//	드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 한다. 
//	(1)에 알맞은 코드를 넣으시오

	public static void main(String[] args) {
		//null : 사실은 0,타입이있다 String 이 저장될때 null로된다 문자 = 문자열 +null
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch); //1, 2, 3, 4, 5 출력 , String 을 charAt 로 나무었다
			sum += ch-'0'; // 특정 숫자 char 를 숫자로 바꾸는 방법 : 아스키코드에서뺌
		}
		System.out.println("sum="+sum);


	}

}
