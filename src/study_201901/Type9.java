/*
���� ����
���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.

���� ����
n�� ���� 10,000������ �ڿ����Դϴ�.

����� ��
n	return
3	���ڼ�
4	���ڼ���
*/

package study_201901;

public class Type9 {

	public static void main(String[] args) {
		System.out.println(solution(4));
	}

	public static String solution(int n) {
		String answer = "";
		String[] list = new String[]{"��","��"};
		for(int i = 1; i <= n ; i++) answer += list[i%2];
		return answer;
		
		//return new String(new char [n/2+1]).replace("\0", "����").substring(0,n);
	}
}
