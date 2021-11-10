package study;

import java.util.Scanner;
import java.util.*;

public class Study_newid {
	
	신규아이디추천
	/* 아이디의 길이는 3자 이상 15자 이하여야 합니다.
	아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
	단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다
	 */
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("새로운 아이디 입력: ");
		String id = scn.next();
	
		Solution check = new Solution();
		String result = check.solution(id);
		
		System.out.println("최종답:" + result );
		
	}
}

class Solution {
    public String solution(String new_id) {
    
        String answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^-_.a-z0-9]","");
        
        //System.out.println(answer);
        
        
        String plus = String.valueOf(answer.charAt(answer.length()-1));
        //id길이가 2이하일때
        if(answer.length() <= 2) {
        	answer += answer.concat(plus);
        }
        
        //아이디 길이체크
        if(answer.length() >= 16) {
        	answer = answer.substring(0, 16);
        }
        
        //빈문자열이면 "aaa"로 변경	
	    if(answer == "") {
	       answer += "aaa";
	        	
	     }
	        
	    //앞과 끝 '.' -> 빈값으로 바꾸기
	    if(answer.charAt(0)=='.' || answer.charAt(answer.length()-1) =='.') {
	      answer = answer.replace(".", "");
	        	
	    }
	          
        
        return answer;
    }
}
