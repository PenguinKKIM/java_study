package com.test03;

public class TestMain03 {
	public static void main(String[] args) {
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		//StringTokenizer 이용하여 List에 저장한다.
		//List에 저장된 데이터의 합과 평균을 구한다.

		double sum =0;
		double avg = 0;
		int count = 0;
		
		String[] strArr = str.split(",");
	
		for(int i =0; i <strArr.length; i++) {
			sum +=  (double)strArr[i].length();
			avg = sum/strArr[i].length();
		}
	
//		합계와 평균은 모두 소수점 4자리에서 반올림하여 소수점 3자리까지 표현한다.
//		합 계: 29.320
//		평 균: 5.864
		
		System.out.println(String.format("%.3f", sum));
		System.out.println(String.format("%.3f", avg));
	}

}
