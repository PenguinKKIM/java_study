package exc;

public class Exc4 {
	public static void main(String[] args) {
		int sum =0, i;
		for (i =1;; i++) {
//			if(i%2==0) {sum += 1;}
//			else sum+= 1;{
			sum += (i%2==0)? -i:i;
			//max = (a:b)? a:b
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("sum" +sum + ", i:" + i ); //반복문 안에들어있어서 계속 반복해서 출력했음 ^ㅅ^;;;;;
	}
}
