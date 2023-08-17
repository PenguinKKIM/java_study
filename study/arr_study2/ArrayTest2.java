package arr_study2;

public class ArrayTest2 {

	public static void main(String[] args) {
		String hex = "13A0C";
		String[] binary = { "0000", "0001", "0010", "0011", //0 1 2 3  
							"0100", "0101", "0110", "0111", // 4 5 6 7 
							"1000", "1001", "1010",	"1011", //8 9 A(10) B(11)
							"1100", "1101", "1110", "1111" // C(12) D(13) E(14) F(15)
				};
		
		String result = "";
		
		for (int i = 0; i < hex.length(); i++) {
			char ch = hex.charAt(i);
			// hex를 배열로 쪼개서 > char 에 넣고 비교 ? charAt();?
			// 밖에서 하지 않아도 for 문으로 나누어 비교할수있다.
			if (ch >= '0' && ch <= '9') {
				result += binary[ch - '0'];
			} else {
				result += binary[9 + ch - 'A' + 1];
			}
		} // for 끝

		System.out.println("hex: " + new String(hex)); // new String(hex)> hex 를 String 으로 형변환함.
		System.out.println("binary: " + result);
		
	}

}
// 출력결과
//hex: 13A0C
//binary: 0001 0011 1010 0000 1100