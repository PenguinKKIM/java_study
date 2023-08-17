package exc;

public class Exc15 {
	public static void main(String[] args) {
//		다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽
//		어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한
//		다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오. [Hint] 나머지 연산자를 이용하시오.
		
		int number = 12322;
		int tmp = number;
		int result =0; // 변수 number를 거꾸로 변환해서 담을 변수 처음에 10을 곱할때 0이어야 하므로 0으로 초기화 
		
		int sqr = 0;
		while(tmp !=0) {
			
//			result += tmp%10*(int)(Math.pow(10, sqr));
//			tmp /= 10;
//			sqr++;
			
			result = result*10 + tmp %10;
			tmp /= 10;
		}
		System.out.println("뒤집어본 숫자 " + result);
		if(number == result)
		System.out.println( number + "는 회문수 입니다.");
		else
		System.out.println( number + "는 회문수가 아닙니다."); 
	}
	//스트링으로 뒤집어서 답이나와도 됨 (코딩이란게 답만 같으면되나까..) 비교해서 더 보기좋고 쓰기좋은 코드로 하기
}
