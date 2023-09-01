package com.test02;

public class TestStudent {

//	홍길동 20 177 74 201301 체육
//	이순신 44 178 77 201302 체육
//	유관순 18 155 45 201303 컴퓨터
	
	
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 20, 177, 74, "201301", "체육");
		Student s2= new Student("이순신", 44, 178, 77, "201302", "체육");
		Student s3 = new Student("유관순", 18, 155, 45, "201303", "컴퓨터");
		
		System.out.println(" 이름 나이 신장 체중  학번  전공");
		System.out.println("=========================");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}

}
