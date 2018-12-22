//문제 설명
//수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
//수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

//1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

//1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
//가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

//제한 조건
//시험은 최대 10,000 문제로 구성되어있습니다.
//문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

//입출력 예
//answers	return
//[1,2,3,4,5]	[1]
//[1,3,2,4,2]	[1,2,3]

//입출력 예 설명
//입출력 예 //1
//수포자 1은 모든 문제를 맞혔습니다.
//수포자 2는 모든 문제를 틀렸습니다.
//수포자 3은 모든 문제를 틀렸습니다.
//따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

//입출력 예 //2
//수포자 1은 [1, 4]번 문제를 맞혔습니다.
//수포자 2는 다섯 번째 문제를 맞혔습니다.


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
