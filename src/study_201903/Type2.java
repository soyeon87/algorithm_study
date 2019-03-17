/*
문제 설명
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.

입출력 예
numbers	return
[6, 10, 2]	6210
[3, 30, 34, 5, 9]	9534330
*/

package study_201903;

import java.util.Arrays;

public class Type2 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {0,0,1000,0,0}));
		//3, 30, 34, 5, 9
		//21, 212
		//12, 121
	}
	
	public static String solution(int[] numbers) {
		String answer = "";
		
		String[] list = new String[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			list[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(list);
		
		for(int i = list.length-1 ; i >=0; i--) {
			if(i > 0) {
				if(list[i].length() > list[i-1].length()) {
					if(list[i].substring(0, list[i-1].length()).equals(list[i-1])) {
							String one = list[i]+""+list[i-1];
							String two = list[i-1]+""+list[i];
							for(int k = list[i-1].length(); k < one.length(); k++) {
								if(one.charAt(k) < two.charAt(k)) {
									String temp=list[i];
									list[i] = list[i-1];
									list[i-1] = temp;
									break;
								}else if(one.charAt(k) > two.charAt(k)) {
									break;
								}
							}
					}
				}
			}
			answer += list[i];
		}
		
		
		long count = answer.chars().filter(a -> a == '0').count();
		if(count == answer.length()) {
			answer = "0";
		}
		
		return answer;
	}

	
}
