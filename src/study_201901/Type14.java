/*
���� ����
�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

���ѻ���
N�� ���� : 100,000,000 ������ �ڿ���

����� ��
N	answer
123	6
987	24

����� �� ����
����� �� #1
������ ���ÿ� �����ϴ�.
����� �� #2
9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.
*/

package study_201901;

public class Type14 {

	public static void main(String[] args) {
		System.out.println(solution(987));
	}

	public static int solution(int n) {
		int answer = 0;
		String value = String.valueOf(n);
		for(int i = 0 ; i < value.length(); i++){
			answer += Integer.parseInt(value.substring(i,i+1));
		}
		return answer;
		
		/*
		while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
		*/
	}
}
