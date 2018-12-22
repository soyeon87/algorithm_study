//���� ����
//������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
//�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
//�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

//���ѻ���
//������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
//completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
//�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
//������ �߿��� ���������� ���� �� �ֽ��ϴ�.

//����� ��
//participant	completion	return
//[leo, kiki, eden]	[eden, kiki]	leo
//[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
//[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav

//����� �� ����
//���� #1
//leo�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
//���� #2
//vinko�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
//���� #3
//mislav�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.

package study;

import java.util.ArrayList;
import java.util.Arrays;

public class Type_2018_12_1 {

	public static void main(String[] args) {
		String participant[] = new String[]{"leo", "kiki", "eden"};
		String completion[] = new String[]{"eden", "kiki"};
		String result = solution(participant, completion);
		System.out.println(result);
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		ArrayList<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(completion));
		
		int index = 0;
		for(int i = 0; i < participant.length; i++){
			index = list.indexOf(participant[i]);
			if(index >= 0){
				list.remove(index);
			}else{
				answer = participant[i];
				break;
			}
		}
		
		return answer;
		
	}

}
