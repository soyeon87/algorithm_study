/*
���� ����
���ڿ� s���� �������� ���е� ���ڵ��� ����Ǿ� �ֽ��ϴ�. str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� �̸� (�ּҰ�) (�ִ밪)������ ���ڿ��� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
������� s�� 1 2 3 4��� 1 4�� �����ϰ�, -1 -2 -3 -4��� -4 -1�� �����ϸ� �˴ϴ�.

���� ����
s���� �� �̻��� ������ �������� ���еǾ� �ֽ��ϴ�.

����� ��
s	return
1 2 3 4	1 4
-1 -2 -3 -4	-4 -1
-1 -1	-1 -1
*/

package study_201905;

import java.util.Arrays;

public class Type2 {

	public static void main(String[] args) {
		System.out.println(solution("-1 -1"));
	}

	public static String solution(String s) {
		
		String[] get = s.split(" ");
		int[] list = new int[get.length];
		for(int i = 0; i < list.length; i++){
			list[i] = Integer.parseInt(get[i]);
		}
		Arrays.sort(list);
		
		return list[0]+" "+list[list.length-1];
	}
}
