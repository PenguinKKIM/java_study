package study;

import java.util.Scanner;

public class LoginTest2 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		String id1 = sc1.nextLine();
		String password1 = sc1.nextLine();
		
		if(id1.equals("Penguin")) {
			if(password1.equals("890124")) {
				System.out.println("로그인");
			}else {
				System.out.println("비밀번호가 다릅니다");
			}
		} else {
			System.out.println("아이디가 다릅니다");
		}

	}

}
