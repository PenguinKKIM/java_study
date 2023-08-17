package arr_exc;

public class Exc9 {
	public static void main(String[] args) {
		char[][] star = { 	{ '*', '*', ' ', ' ', ' ' },
							{ '*', '*', ' ', ' ', ' ' }, 
							{ '*', '*', '*', '*', '*' },
							{ '*', '*', '*', '*', '*' }  };
		
		char[][] result = new char[star[0].length][star.length];
		
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				result[j][star.length-1-i] =star[i][j]; //배열의 크기가 바뀔수 있으므로 숫자로쓰지 않는다
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}

//패턴을 찾아내는게 중요하다 -하나하나 뒤져보고 찾아보기
//0,0 > 0,3
//0,1 > 1,3
// ...
//1,0 > 0,2
//1,1 > 1,2
//1,2 > 2,3

