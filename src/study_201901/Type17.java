/*
���� ����
������ ���� n�� ����, n�� � ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
n�� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.

���� ����
n�� 1�̻�, 50000000000000 ������ �����Դϴ�.

����� ��
n	return
121	144
3	-1

����� �� ����
����� ��#1
121�� ���� 11�� �����̹Ƿ�, (11+1)�� ������ 144�� �����մϴ�.

����� ��#2
3�� ������ ������ �ƴϹǷ�, -1�� �����մϴ�.
*/

package study_201901;

public class Type17 {

	public static void main(String[] args) {
		System.out.println(solution(3));
	}

	public static long solution(long n) {
		long value = (long)Math.sqrt(n);
		if(Math.pow(value, 2) == n){
			return (long)Math.pow(value+1, 2);
		}else{
			return -1;
		}
	}
}
