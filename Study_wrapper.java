package study;

public class Study_wrapper {

	public static void main(String[] args) {
		int number = 12345; 
		String floatNum = "123.456";
		
		System.out.println(number + 1);  // 정수
		
		String numberString = number+"";
		System.out.println(numberString + 111);  //문자열
		
		String ft = "123.45666";
		double dnum = Double.parseDouble(ft);
		System.out.println("실수:" + (dnum+1.0));
		
		Integer check = 50;		//int대신 wrapper 클래스인 integer 사용가능 
		System.out.println(check + 10);
		
		
		//구구단
		for (int i = 2; i < 10; i++) {
			System.out.println();
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
			}
		}
		
	}

}
