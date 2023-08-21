public class ClassTest1 {

	public static void main(String[] args) {
		Student stu1 = new Student(); //stu1 에 주소가 담겨있음. 래퍼런스 변수 int[] arr 와 같다.
		Student stu2; // 객체가 생성된것이 아니다 new 하지않고 쓰면 에러가 난다.
		
		stu1.name = "홍길동";
		stu1.address ="서울시 금천구";
		stu1.grade = 4;
		stu1.num = 1001;
		System.out.println(stu1.info()); // 메소드를 호출해옴
		
		
	}

} //main 이 들어가있는 class는 public 이 어야한다 (두개다 들어가야한다)
