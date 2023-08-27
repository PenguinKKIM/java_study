package study;

import java.util.Scanner;

public class LoginTest1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); //입력할수있는 클래스 Scanner에 불러온다
		String id = sc.nextLine();
		if(id.equals("Penguin")) { //문자열을 비교할때는 equals를 쓴다
			System.out.println("That's your ID");
		} else {
			System.out.println("아이디가 틀립니다");
		}
	}
}
