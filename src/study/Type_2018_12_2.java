//���� ����
//�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. 
//�����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

//1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

//1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, 
//���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

//���� ����
//������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
//������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
//���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.

//����� ��
//answers	return
//[1,2,3,4,5]	[1]
//[1,3,2,4,2]	[1,2,3]

//����� �� ����
//����� �� //1
//������ 1�� ��� ������ �������ϴ�.
//������ 2�� ��� ������ Ʋ�Ƚ��ϴ�.
//������ 3�� ��� ������ Ʋ�Ƚ��ϴ�.
//���� ���� ������ ���� ���� ����� ������ 1�Դϴ�.

//����� �� //2
//������ 1�� [1, 4]�� ������ �������ϴ�.
//������ 2�� �ټ� ��° ������ �������ϴ�.


package study;

import java.util.ArrayList;
import java.util.Collections;

public class Type_2018_12_2 {

	public static void main(String[] args) {
		int[] answers = new int[]{1,2,3,4,5};
		int[] result = solution(answers);
		
		for(int i = 0; i < result.length;i++){
			System.out.println(result[i]);
		}
	}

	public static int[] solution(int[] answers) {
		int[] answer = {};

		int[] student1 = { 1, 2, 3, 4, 5 };
		int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int score1 = 0, score2 = 0, score3 = 0;
		int check1 = 0, check2 = 0, check3 = 0;
		int highScore = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student1[check1]) {
				score1++;
			}
			if (answers[i] == student2[check2]) {
				score2++;
			}
			if (answers[i] == student3[check3]) {
				score3++;
			}

			if (highScore < score1) {
				highScore = score1;
			}
			if (highScore < score2) {
				highScore = score2;
			}
			if (highScore < score3) {
				highScore = score3;
			}

			if (check1 == student1.length - 1) {
				check1 = 0;
			} else {
				check1++;
			}
			if (check2 == student2.length - 1) {
				check2 = 0;
			} else {
				check2++;
			}
			if (check3 == student3.length - 1) {
				check3 = 0;
			} else {
				check3++;
			}

			if (i == answers.length - 1) {
				if (highScore == score1) {
					list.add(1);
				}
				if (highScore == score2) {
					list.add(2);
				}
				if (highScore == score3) {
					list.add(3);
				}
				Collections.sort(list);
			}
		}

		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

}
