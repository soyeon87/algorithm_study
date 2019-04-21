/*
���� ����
�ڿ��� n�� �־����� ��, n�� ���� ū ���ڴ� ������ ���� ���� �մϴ�.
���� 1. n�� ���� ū ���ڴ� n���� ū �ڿ��� �Դϴ�.
���� 2. n�� ���� ū ���ڿ� n�� 2������ ��ȯ���� �� 1�� ������ �����ϴ�.
���� 3. n�� ���� ū ���ڴ� ���� 1, 2�� �����ϴ� �� �� ���� ���� �� �Դϴ�.
���� �� 78(1001110)�� ���� ū ���ڴ� 83(1010011)�Դϴ�.
�ڿ��� n�� �Ű������� �־��� ��, n�� ���� ū ���ڸ� return �ϴ� solution �Լ��� �ϼ����ּ���.

���� ����
n�� 1,000,000 ������ �ڿ��� �Դϴ�.

����� ��
n	result
78	83
15	23

����� �� ����
����� ��#1
���� ���ÿ� �����ϴ�.
����� ��#2
15(1111)�� ���� ū ���ڴ� 23(10111)�Դϴ�
*/

package study_201904;

public class Type4 {

	public static void main(String[] args) {
		System.out.println(solution(15));
	}
	
	public static int solution(int n) {
		int count1 = getCount(n);
		while(true){
			n++;
			if(count1 == getCount(n)){
				return n;
			}
		}
		
		/*
		int cnt = Integer.bitCount(n);
      	while(Integer.bitCount(++n) != cnt) {}
      	return n;
		*/
	}
	
	public static int getCount(int n){
		//2������ 1�� ���� ���ϱ�
		int count = 0;
		while(n > 0){
			if(n%2 == 1){
				count++;
			}
			n/=2;
		}
		return count;
	} 

}
