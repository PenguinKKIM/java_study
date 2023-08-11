//패키지 - 클래스 끼리 묶어놓은 폴더 같은것 (물리적으로)
package exc; //패키지 없으면 에러남

public class Exc1 {

	public static void main(String[] args) {
		// int 형 변수X 가 10보다 크고 20보다 작을때 true 인 조건식
		int x = 10;
		if (x > 10 && x < 20) {

		}
		// char형 변수 ch 공백이나 탭이 아닐때 true
		char ch = 'A';
		if (ch == ' ' && ch != '\t') {}

		// char형 변수 ch 'x' 이거나 'X' 일때 true
		if (ch == 'x' || ch == 'X') {}
		
		// char 형 변수가 숫자 0~9 일때 true
		if(ch >= '0' && ch <='9') {}
		
		// char 형 변수가 영문자(대문자나 소문자) 일때 true
		if((ch >= 97 && ch <= 122) || (ch > 65 && ch < 90)) {} //&& 보다 || 이 우선순위가 낮아서 안써줘도됨
		
		// int 형 변수 year이 400으로 나누어 떨어지거나/ 또는 (4로 나누어 떨어지고 100 으로 나누어 떨어지지 않을때) true
		int year=0;
		if((year%400 == 0) || (year%4 == 0 && year%100!=0) ) {}
		
		//boolean 형 변수 powerOn 이 false 일때 true 인 조건식
		boolean powerOn = false;
		if (powerOn == false) {}
		if (!powerOn) {} //!을 붙여준다
		
		//문자열 참조변수 str 이 yes 일때 true 인 조건식
		String str ="yes"; //String 은 클래스 타입이라 참조변수라고한다
		if (str.equals("yes")) {}//문자열 비교할때는 equals 라고쓴다 == 도 되긴 하지만 equals 를 써야한다
		
		
	}
	

}
