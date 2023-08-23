package exc;

public class ex5 {
	public static void change(String str) {
		str += "456";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		String str1 = "ABC123";
		System.out.println(str == str1);
		
		// ==로 String 비교해도 참이나오는 경우 : 메모리가 많이남음. 없으면 바로 false가된다
		
		String str2 = new String ("ABC123"); //참조형 처럼쓰고싶지만...
		String str3 = new String ("ABC123"); //클래스 형태로 만들어서 메소드를 많이많이쓰기위함
		System.out.println(str2 == str3);
		
		}

}
