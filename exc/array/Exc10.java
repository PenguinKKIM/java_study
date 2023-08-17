package arr_exc;

public class Exc10 {

	public static void main(String[] args) {
		char[] abcCode = { 	'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', 
							'(', ')', '-', '_', '+', '=', '|', '[',']', '{',
							'}', ';', ':', ',', '.', '/'
						};
							// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i); //String을 charAt 으로 char 배열로 바꾼다.
			 //문자열 이므로 아스키코드 값이 들어감
			if(ch>= 'a' && ch<= 'z') {
				//'a' >'`'> abcCode['a'-'a'] a = 97, z = 122
				//'p' > abcCoad['p'-'a'] > 112 - 97 = 15 인덱스의 요소 '='
				//result = result + abcCode[ 4-'0']; 
				result += abcCode[ch-'a'];
			} else {
				//'3' > numCode[-'0'] > 4 > r
				//result = result + numCode[ch -'0'];
				result += numCode[ch-'0'];
			}
			
//			if(ch >= 48 && ch<= 57) {
//				result = result + numCode[ch -'0'];
//			} else {
//				result += abcCode[ch-'a'];
//			}
			
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);

	}

}
