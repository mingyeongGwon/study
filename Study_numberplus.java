package study;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 정수 배열 numbers가 주어집니다. 
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 * numbers의 길이는 2 이상 100 이하입니다.
	numbers의 모든 수는 0 이상 100 이하입니다
 */

public class Study_numberplus {

	public static void main(String[] args) {
		
		int[] numbers = {2,1,3,4,1};
		
		Solution sol = new Solution();
		int answerNum[] = sol.solution(numbers);
		
		
		System.out.println(Arrays.toString(answerNum));
		
	}
	
	static class Solution {
	    public int[] solution(int[] numbers) {
	       
	    	int[] answer ;
	    	ArrayList<Integer> list = new ArrayList<Integer>();
	    	
	    	for (int i = 0; i < numbers.length; i++) {
				for (int j = i+1; j < numbers.length; j++) {
					int tmp = numbers[i] + numbers[j];
					if(!list.contains(tmp)) {
						list.add(tmp);
					}
				}
			}
	    	
	    	int num = 0;
	    	answer = new int[list.size()];
	    	for (int lnum : list) {
				answer[num++] = lnum;
			}
	    	
	    	Arrays.sort(answer);

	        return answer;
	    }
	}
	
}
