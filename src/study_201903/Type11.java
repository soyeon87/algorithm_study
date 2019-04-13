/*
���� ����
Leo�� ī���� �緯 ���ٰ� �Ʒ� �׸��� ���� �߾ӿ��� ���������� ĥ���� �ְ� �𼭸��� �������� ĥ���� �ִ� ���� ��� ī���� �ý��ϴ�.
Leo�� ������ ���ƿͼ� �Ʊ� �� ī���� �������� �������� ��ĥ�� ������ ������ ���������, ��ü ī���� ũ��� ������� ���߽��ϴ�.
Leo�� �� ī�꿡�� ���� ������ �� brown, ������ ������ �� red�� �Ű������� �־��� �� ī���� ����, ���� ũ�⸦ ������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
���� ������ �� brown�� 8 �̻� 5,000 ������ �ڿ����Դϴ�.
������ ������ �� red�� 1 �̻� 2,000,000 ������ �ڿ����Դϴ�.
ī���� ���� ���̴� ���� ���̿� ���ų�, ���� ���̺��� ��ϴ�.

����� ��
brown	red	return
10	2	[4, 3]
8	1	[3, 3]
24	24	[8, 6]
*/

package study_201903;

public class Type11 {

	public static void main(String[] args) {
		int[] result = solution(24, 24);
		System.out.println(result[0]+"/"+result[1]);
		
	}

	public static int[] solution(int brown, int red) {
        int[] answer = new int[]{0,0};
        int sum = brown + red;
        
        for(int i = 3; i <= sum; i++) {
        	if(sum % i == 0){
        		int b = sum / i ; //���� - i�� ����
				if ((b-2)*(i-2) == red) {
					answer[0] = b;
					answer[1] = i;
					break;
				}    	
        	}
        }
        
        return answer;
    }
}
