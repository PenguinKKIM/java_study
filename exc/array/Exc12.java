package arr_exc;

public class Exc12 {
	public static void main(String[] args) {
		// 3미터짜리 우물 바닥에 달팽이가있다 
		// 달팽이는 낮 동안 55cm 를 올라올수 있다. 
		// 밤이되면 잠을 자야한다 자는 동안 3cm를 미끄러져 내려온다.
		// 달팽이가 우물을 밖으로 나오는데 몇일이 걸릴까 ?
		// 반복문과 조건문을 이용하여 프로그램을 작성하시오
		// 올라오는게 하루? 몇시간을 잘까
		
		
		int well = 300;
		int ground = 0;
		
		int snailUp = 55;
		int snailDown = 3;
		
		int day = 1;
		
		while(well>ground) {
			well = well-snailUp; 
			if(well<= ground)
			break;
			well = well + snailDown; 
			day++; 
		}
		System.out.println(day);
	}
}
