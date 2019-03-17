package study_201902;
/*
���� ����
�ſ� ���� �����ϴ� Leo�� ��� ������ ���ں� ������ K �̻����� ����� �ͽ��ϴ�. 
��� ������ ���ں� ������ K �̻����� ����� ���� Leo�� ���ں� ������ ���� ���� �� ���� ������ �Ʒ��� ���� Ư���� ������� ���� ���ο� ������ ����ϴ�.
���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)
Leo�� ��� ������ ���ں� ������ K �̻��� �� ������ �ݺ��Ͽ� �����ϴ�.
Leo�� ���� ������ ���ں� ������ ���� �迭 scoville�� ���ϴ� ���ں� ���� K�� �־��� ��, 
��� ������ ���ں� ������ K �̻����� ����� ���� ����� �ϴ� �ּ� Ƚ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
scoville�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
K�� 0 �̻� 1,000,000,000 �����Դϴ�.
scoville�� ���Ҵ� ���� 0 �̻� 1,000,000 �����Դϴ�.
��� ������ ���ں� ������ K �̻����� ���� �� ���� ��쿡�� -1�� return �մϴ�.

����� ��
scoville	K	return
[1, 2, 3, 9, 10, 12]	7	2

����� �� ����
���ں� ������ 1�� ���İ� 2�� ������ ������ ������ ���ں� ������ �Ʒ��� ���� �˴ϴ�.
���ο� ������ ���ں� ���� = 1 + (2 * 2) = 5
���� ������ ���ں� ���� = [5, 3, 9, 10, 12]
���ں� ������ 3�� ���İ� 5�� ������ ������ ������ ���ں� ������ �Ʒ��� ���� �˴ϴ�.
���ο� ������ ���ں� ���� = 3 + (5 * 2) = 13
���� ������ ���ں� ���� = [13, 9, 10, 12]
��� ������ ���ں� ������ 7 �̻��� �Ǿ��� �̶� ���� Ƚ���� 2ȸ�Դϴ�.
*/

import java.util.Arrays;

public class Type15 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2},3));
		//1,2,3,9,10,12
	}
	
	public static int solution(int[] scoville, long K) {
		int answer = 0;

		int index = 0;
		
		while (true) {
			if (scoville.length -1 == index) {
				if (scoville[index] < K) {
					answer = -1;
				}
				break;
			}
			Arrays.sort(scoville); //heap ����
			if (scoville[index] >= K) {
				break;
			}
			scoville[index+1] = scoville[index] + (scoville[index+1] * 2);
			index++;
			answer++;
		}

		return answer;
	}

}
