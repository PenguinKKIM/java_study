package exc;

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		float avg = (float)getTotal()/3;
		return Math.round(avg*10)/10.f;
	}
	
	String info() {
		return 
		String.format("%s, %d, %d, %d, %d, %d, %d, %f ", name, ban, no, kor, eng, math, getTotal(), getAverage());
	}
	
}

public class Ex2 {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "홍길동";
		s.ban =1;
		s.no =1;
		s.kor =100;
		s.eng =60;
		s.math =76;
		
		String str = s.info();
		System.out.println(str); //1번문제
		
		System.out.println("이름: "+s.name);
		System.out.println("총점: "+s.getTotal());
		System.out.println("평균: "+s.getAverage()); //2번문제
		
	}
}
