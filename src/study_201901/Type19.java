/*
���� ����
���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
num�� int ������ �����Դϴ�.
0�� ¦���Դϴ�.

����� ��
num	return
3	Odd
4	Even
*/

package study_201901;

public class Type19 {

	public static void main(String[] args) {
		System.out.println(solution(3));
	}

	public static String solution(int num) {
		return num %2 == 0 ? "Even" : "Odd";
	}
}
