/*
���� ����
String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. 
seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

���� ����
seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
Kim�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.

����� ��
seoul	return
[Jane, Kim]	�輭���� 1�� �ִ�
*/

package study_201901;

import java.util.Arrays;

public class Type7 {

	public static void main(String[] args) {
		String[] seoul = new String[]{"Jane","Kim"};
		System.out.println(solution(seoul));
	}
	
	public static String solution(String[] seoul) {
		return "�輭���� "+Arrays.asList(seoul).indexOf("Kim")+"�� �ִ�";
	}
}
