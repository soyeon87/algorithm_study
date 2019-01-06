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

package study_201812;

import java.util.HashMap;
import java.util.Set;

public class Type1 {

	public static void main(String[] args) {
		String participant[] = new String[]{"leo", "kiki", "eden"};
		String completion[] = new String[]{"eden", "kiki"};
		String result = solution(participant, completion);
		System.out.println(result);
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
	
		HashMap<String, Integer> list = new HashMap<>();
		for(int i=0; i < participant.length ; i++){
			if(list.get(participant[i]) != null){
				list.put(participant[i], (int)list.get(participant[i])+1);
			}else{
				list.put(participant[i], 1);
			}
		}
		
		for(int i=0; i < completion.length; i++){
			if(list.get(completion[i]) > 0 ){
				list.put(completion[i], (int)list.get(completion[i])-1);
			}
		}
		
		Set keys = list.keySet();
		for(Object key : keys){
			if(list.get(key.toString()) > 0){
				answer = key.toString();
			}
		}
		
		return answer;
		
	}

}
