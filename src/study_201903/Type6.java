/*
���� ����
���ε��� ���� ������� ����Ʈ�� �̿��Ͽ� �����Ϸ��� �մϴ�. ����Ʈ�� �۾Ƽ� �� ���� �ִ� 2�� �ۿ� Ż �� ����, ���� ���ѵ� �ֽ��ϴ�.
���� ���, ������� �����԰� [70kg, 50kg, 80kg, 50kg]�̰� ����Ʈ�� ���� ������ 100kg�̶��,
2��° ����� 4��° ����� ���� Ż �� ������ 1��° ����� 3��° ����� ������ ���� 150kg�̹Ƿ� ����Ʈ�� ���� ������ �ʰ��Ͽ� ���� Ż �� �����ϴ�.
����Ʈ�� �ִ��� ���� ����Ͽ� ��� ����� �����Ϸ��� �մϴ�.
������� �����Ը� ���� �迭 people�� ����Ʈ�� ���� ���� limit�� �Ű������� �־��� ��, 
��� ����� �����ϱ� ���� �ʿ��� ����Ʈ ������ �ּڰ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
���ε��� ���� ����� 1�� �̻� 50,000�� �����Դϴ�.
�� ����� �����Դ� 40kg �̻� 240kg �����Դϴ�.
����Ʈ�� ���� ������ 40kg �̻� 240kg �����Դϴ�.
����Ʈ�� ���� ������ �׻� ������� ������ �� �ִ񰪺��� ũ�� �־����Ƿ� ������� ������ �� ���� ���� �����ϴ�.
����� ��
people	limit	return
[70, 50, 80, 50]	100	3
[70, 80, 50]	100	3
*/

package study_201903;

import java.util.Arrays;

public class Type6 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{70,80,50}, 100));
	}

	public static int solution(int[] people, int limit) {
		int answer = 0;
		
		int left = 0;
		int right = people.length-1;
		
		Arrays.sort(people);
		
		while(true){
			
			if(people[left]+people[right] > limit){
				answer++;
				right--;
			}else if(people[left]+people[right] <= limit){
				answer++;
				right--;
				left++;
			}
			
			if(left > right){
				break;
			}else if(left == right){
				answer++;
				break;
			}
		}
		
		return answer;
	}
}
