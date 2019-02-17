/*
���� ����
���α׷��ӽ� �������� ��� ���� �۾��� ���� ���Դϴ�. �� ����� ������ 100%�� �� ���񽺿� �ݿ��� �� �ֽ��ϴ�.
��, �� ����� ���߼ӵ��� ��� �ٸ��� ������ �ڿ� �ִ� ����� �տ� �ִ� ��ɺ��� ���� ���ߵ� �� �ְ�, �̶� �ڿ� �ִ� ����� �տ� �ִ� ����� ������ �� �Բ� �����˴ϴ�.
���� �����Ǿ�� �ϴ� ������� �۾��� ������ ���� ���� �迭 progresses�� �� �۾��� ���� �ӵ��� ���� ���� �迭 speeds�� �־��� 
�� �������� �� ���� ����� �����Ǵ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���� ����
�۾��� ����(progresses, speeds�迭�� ����)�� 100�� �����Դϴ�.
�۾� ������ 100 �̸��� �ڿ����Դϴ�.
�۾� �ӵ��� 100 ������ �ڿ����Դϴ�.
������ �Ϸ翡 �� ���� �� �� ������, �Ϸ��� ���� �̷�����ٰ� �����մϴ�. ���� ��� �������� 95%�� �۾��� ���� �ӵ��� �Ϸ翡 4%��� ������ 2�� �ڿ� �̷�����ϴ�.

����� ��
progresses	speeds	return
[93,30,55]	[1,30,5]	[2,1]

����� �� ����
ù ��° ����� 93% �Ϸ�Ǿ� �ְ� �Ϸ翡 1%�� �۾��� �����ϹǷ� 7�ϰ� �۾� �� ������ �����մϴ�.
�� ��° ����� 30%�� �Ϸ�Ǿ� �ְ� �Ϸ翡 30%�� �۾��� �����ϹǷ� 3�ϰ� �۾� �� ������ �����մϴ�. 
������ ���� ù ��° ����� ���� �ϼ��� ���°� �ƴϱ� ������ ù ��° ����� �����Ǵ� 7��° �����˴ϴ�.
�� ��° ����� 55%�� �Ϸ�Ǿ� �ְ� �Ϸ翡 5%�� �۾��� �����ϹǷ� 9�ϰ� �۾� �� ������ �����մϴ�.
���� 7��°�� 2���� ���, 9��°�� 1���� ����� �����˴ϴ�.
*/

package study_201902;

import java.util.HashMap;
import java.util.Map;

public class Type11 {

	public static void main(String[] args) {
		int[] result = solution(new int[] {93, 30, 55, 60, 40, 65}, new int[] {1, 30, 5 , 10, 60, 7});
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
		
		int[] days = new int[progresses.length];
		for(int i = 0; i < days.length; i++) {
			while(true) {
				progresses[i] = progresses[i] +speeds[i];
				days[i]++;
				if(progresses[i] >= 100) {
					break;
				}
			}
		}
		
		Map list = new HashMap<>();
		int count = 0;
		for(int i = 0; i < days.length; i++) {
			if(days[i] > 0) {
				list.put(count, 1);
				for(int j = i+1; j < days.length; j++) {
					if(days[i] >= days[j]) {
						list.put(count, (int)list.get(count)+1);
						days[j] = 0;
					}else {
						break;
					}

				}
				count++;
			}
		}
	
		int[] answer = new int[count];
		for(int i = 0; i <count; i++) {
			answer[i] = (int)list.get(i);
		}
		
		return answer;
	}

}
