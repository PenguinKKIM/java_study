
public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = ""; //빈문자열은 에러가안난다.
		int[] arr = new int[5];
		try {
			System.out.println(str.toString()); //null 자체는 toString 못함
			for(int i =0; i<= arr.length; i++) {
				arr[i] = i*10;
			}
		} catch(NullPointerException e) {
//			System.out.println("null 입니다"); //Exception일때 실행되는 것
//			e.printStackTrace(); //콘솔에 에러났을때 뜨는 창 출력
			System.out.println(e.getMessage()); //무엇이 에러인지 글로설명
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}//t,c 끝
		System.out.println("종료");
	}
}
