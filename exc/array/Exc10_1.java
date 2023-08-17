package arr_exc;

public class Exc10_1 {

	public static void main(String[] args) {
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
							// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String result = "`~!wer";
		String src = ""; // abc123
		for (int i = 0; i < result.length(); i++) {
			char ch = result.charAt(i);

			for (int j = 0; j < abcCode.length; j++) {
				if (ch == abcCode[j]) {
					src += (char)(j+'a');
				}
			}

			for (int j = 0; j < numCode.length; j++) {
				if (ch == numCode[j]) {
					src += (int)j;
				}
			}
		}
		
		System.out.println("result:" + result);
		System.out.println("src:" + src);

	}
}
