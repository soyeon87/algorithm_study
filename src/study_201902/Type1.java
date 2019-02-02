/*
���� ����
�� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������. 
�迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. 
���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.

���� ����
�� ���� 1�̻� 1000000������ �ڿ����Դϴ�.
����� ��
n	m	return
3	12	[3, 12]
2	5	[1, 10]

����� �� ����
����� �� #1
���� ����� �����ϴ�.
����� �� #2
�ڿ��� 2�� 5�� �ִ������� 1, �ּҰ������ 10�̹Ƿ� [1, 10]�� �����ؾ� �մϴ�.
*/

package study_201902;

public class Type1 {

	public static void main(String[] args) {
		int[] result = solution(3, 12);
		System.out.println(result[0]+"/"+result[1]);	
	}

	public static int[] solution(int n, int m) {
		
		int min = Math.min(n, m);
		int max = Math.max(n, m);
		int check  = 0;
		for(int i = 1; i <= min; i++){
			if(min % i == 0){
				if(max % i == 0){
					check = i;
				}
			}
		}
		return new int[]{check, check*(min/check)*(max/check)};
	}
}
