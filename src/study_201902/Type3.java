/*
���� ����
������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.

���ѻ���
arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.
����� ��
arr	return
[1,2,3,4]	2.5
[5,5]	5
*/

package study_201902;

import java.util.Arrays;

public class Type3 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{5,5}));
	}
	public static double solution(int[] arr) {
		return (double)Arrays.stream(arr).sum()/arr.length;
		// return (int) Arrays.stream(array).average().orElse(0);
	}

}
