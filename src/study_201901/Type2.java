/*
���� ����
�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

���� ����
a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.

����� ��
a	b	return
3	5	12
3	3	3
5	3	12
*/


package study_201901;

public class Type2 {

	public static void main(String[] args) {
		System.out.println(solution(6, 5));
	}

	public static long solution(int a, int b) {
		long answer = 0;

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			answer += i;
		}

		// for(int i=Math.min(a,b);i<=Math.max(a,b);i++){ answer+=i; }

		return answer;

	}
}
