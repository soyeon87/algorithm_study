/*
���� ����
������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. 
��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.

���� ����
arr�� ���� 1 �̻��� �迭�Դϴ�.
�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.

����� ��
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]
*/

package study_201901;

import java.util.ArrayList;
import java.util.Arrays;

public class Type18 {

	public static void main(String[] args) {
		int arr[] = new int[]{4,3,2,1};
		int result[] = solution(arr);
		for(int i = 0 ;i < result.length; i++){
			System.out.println(result[i]);
		}
	}

	public static int[] solution(int[] arr) {
		
		if(arr.length == 1){
			return new int[]{-1};
		}else{
			ArrayList list = new ArrayList<>();
			for(int i = 0; i < arr.length; i++){
				list.add(arr[i]);
			}
			list.remove(list.indexOf(Arrays.stream(arr).min().getAsInt()));
			//list.remove(Collections.min(list));
			return list.stream().mapToInt(x -> (int)x).toArray();
		}
	}
}