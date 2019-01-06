/*
���� ����
array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.

���ѻ���
arr�� �ڿ����� ���� �迭�Դϴ�.
���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
divisor�� �ڿ����Դϴ�.
array�� ���� 1 �̻��� �迭�Դϴ�.

����� ��
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]

����� �� ����
����� ��#1
arr�� ���� �� 5�� ������ �������� ���Ҵ� 5�� 10�Դϴ�. ���� [5, 10]�� �����մϴ�.
����� ��#2
arr�� ��� ���Ҵ� 1���� ������ �������ϴ�. ���Ҹ� ������������ ������ [1, 2, 3, 36]�� �����մϴ�.
����� ��#3
3, 2, 6�� 10���� ������ �������� �ʽ��ϴ�. ������ �������� ���Ұ� �����Ƿ� [-1]�� �����մϴ�.
*/

package study_201901;

import java.util.ArrayList;
import java.util.Arrays;

public class Type1 {

	public static void main(String[] args) {
		int[] arr = new int[]{5,9,7,10};
		int divisor = 5;
		int[] result = solution(arr, divisor);
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}

	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}

		if(list.size() > 0){
			answer = new int[list.size()];
			for(int i = 0; i < list.size(); i++){
				answer[i] = (int) list.get(i);
			}
			Arrays.sort(answer);
		}else{
			answer = new int[]{-1};
		}
        
		return answer;
		
		/*
		int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).sorted().toArray();
	    if(answer.length == 0) answer = new int[] {-1};
	    //java.util.Arrays.sort(answer);
	    return answer;
	    */
	}
}
