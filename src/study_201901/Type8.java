/*
���� ����
1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.
�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
(1�� �Ҽ��� �ƴմϴ�.)

���� ����
n�� 2�̻� 1000000������ �ڿ����Դϴ�.

����� ��
n	result
10	4
5	3

����� �� ����
����� �� #1
1���� 10 ������ �Ҽ��� [2,3,5,7] 4���� �����ϹǷ� 4�� ��ȯ
����� �� #2
1���� 5 ������ �Ҽ��� [2,3,5] 3���� �����ϹǷ� 3�� ��ȯ
*/

package study_201901;

import java.util.ArrayList;

public class Type8 {

	public static void main(String[] args) {
		System.out.println(solution(1000000));
	}

	public static int solution(int n) {	
		ArrayList<Integer> list = new ArrayList<>();
		int max = 0;
		loop: 
		for(int i = 2; i<= n ; i++){
			if(n > 2){
				max = (int)Math.sqrt(i)+1;
				for(int j = 0; j < list.size(); j++){
					if(max > list.get(j)){
						if(i % list.get(j) == 0){
							continue loop;
						}
					}else{
						break;
					} 
				}
			}
			list.add(i);
		}		
		return list.size();
	}
}
