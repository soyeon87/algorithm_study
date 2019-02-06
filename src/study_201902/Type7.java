/*
���� ����
�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
n�� 1000 ������ �ڿ����Դϴ�.

����� ��
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8]
*/

package study_201902;

public class Type7 {

	public static void main(String[] args) {
		long[] result =  solution(-4, 2);
		for(int i=0; i < result.length; i++){
			System.out.print(result[i]+" ");
		}
	}

	public static long[] solution(long x, int n) {
		long[] answer = new long[n];
		for(int i = 0; i < n ; i++){
			answer[i] = x + x*i;
		}
		return answer;
	}
}
