/*
���� ����
0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.
���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ���� ���� ū ���� 6210�Դϴ�.
0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
numbers�� ���̴� 1 �̻� 100,000 �����Դϴ�.
numbers�� ���Ҵ� 0 �̻� 1,000 �����Դϴ�.
������ �ʹ� Ŭ �� ������ ���ڿ��� �ٲپ� return �մϴ�.

����� ��
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
