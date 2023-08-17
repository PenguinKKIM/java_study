package arr_study2;

//배열의 활용

public class ArrayTest1 {

	public static void main(String[] args) {
		char[] hex = new char[] { 'C', 'A', 'F', 'E', '2', '0', '2', '3' };
		String[] binary = { "0000", "0001", "0010", "0011", //0 1 2 3  
							"0100", "0101", "0110", "0111", // 4 5 6 7 
							"1000", "1001", "1010",	"1011", //8 9 A(10) B(11)
							"1100", "1101", "1110", "1111" // C(12) D(13) E(14) F(15)
							};
		//'0'  => 0000 binary[0];
		//'1'  => 0001 binary[1];
		// ....
		//'9'  => 1001 binary[9]; 
		//'A'  => 1010 binary[10]; A 부터는 10번째 이후로 있으니까(0 1 2 3 4 5 6 7 8 9 ) 9 + 'A' - 'A' + 1 =>10 아스키 코드 65
		//'B'  => 1011 binary[11]; 9 + 'B' - 'A' + 1 =>11 
		// ....
		//'F'  => 1011 binary[15]; 'F' - 'A' = (69 -64 = 4) +1 = 5;
		
		
		String result = ""; //빈 String
		
			for(int i=0; i < hex.length; i++) {
				char ch = hex[i];
				 if(ch >='0' && ch <='9') {
					 result += binary[ch-'0'];
				 }else {
					 result += binary[9 + ch - 'A'+1];
				 }
			} //for 끝
			
			System.out.println("hex: " + new String(hex)); //new String(hex)> hex 를 String 으로 형변환함.
			System.out.println("binary: " + result);
			//출력결과
			//hex: CAFE2023
			//binary : 1100 1010 1111 1110 0010 0000 0010 0011
	
	} //main 끝
	
}
