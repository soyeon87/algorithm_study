/*
���� ����
���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, 
��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.

����� ��
phone_number	return
01033334444	*******4444
027778888	*****8888
*/

package study_201902;

public class Type5 {

	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
	}

	public static String solution(String phone_number) {
		String answer = "";
		for(int i = 0 ; i < phone_number.length()-4; i++){
			answer += "*";
		}
		answer += phone_number.substring(phone_number.length()-4);
		return answer;
	}

}
