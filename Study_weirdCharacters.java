package study;

import java.util.Date;
import java.util.Scanner;

public class Study_weirdCharacters {

	public static void main(String[] args) {
	
		/*
		 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
		 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수
		 */
		
		String s = "hello world java";
		String result = solution(s);
		
		System.out.println("결과값은?" + result);
		
	}

		private static String solution(String s) {
			
		char tmp;
		String output = "";
	    	
			for(int i=0; i<s.length(); i++) {
				tmp = s.charAt(i);
				if(i%2 == 0) {
					output += s.valueOf(tmp).toUpperCase();
				}
				else {
					output += s.valueOf(tmp).toLowerCase();
				}
			}
			
	        return output;
	}

}
