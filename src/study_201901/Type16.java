/*
���� ����
�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. 
n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

���� ����
n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.

����� ��
n	return
118372	873211
*/

package study_201901;

import java.util.Arrays;

public class Type16 {

	public static void main(String[] args) {
		System.out.println(solution(118372));
	}

	public static long solution(long n) {
		
		char[] list = String.valueOf(n).toCharArray();
		Arrays.sort(list);
		return Long.valueOf(new StringBuffer(new String(list)).reverse().toString());
	}
}
