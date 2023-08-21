public class Student {// 하나의 파일당 클래스 하나씩
	String name;
	String address;
	int grade;
	int num;
	
	String info(){ //메소드(함수, 기능, function)
		return String.format("이름 : %s, 주소 : %s, 학년 : %d, 학번 : %d"
				,name,address,grade,num);
	}
}