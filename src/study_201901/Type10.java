/*
���� ����
���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
s�� ���̴� 1 �̻� 5�����Դϴ�.
s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
s�� 0���� �������� �ʽ��ϴ�.

����� ��
������� str�� 1234�̸� 1234�� ��ȯ�ϰ�, -1234�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�.
*/

package study_201901;

public class Type10 {

	public static void main(String[] args) {
		System.out.println(solution("-1234"));
	}

	public static int solution(String s) {
		int answer = 0;
		if(s.substring(0,1).equals("-")){
			answer = -Integer.parseInt(s.substring(1,s.length()));
		}else if(s.substring(0,1).equals("+")){
			answer = Integer.parseInt(s.substring(1,s.length()));
		}else{
			answer = Integer.parseInt(s.substring(0,s.length()));
		}
		return answer;
		
		//return Integer.parseInt(s);
	}
}
