/*
���� ����
H-Index�� �������� ���꼺�� ������� ��Ÿ���� ��ǥ�Դϴ�. ��� �������� H-Index�� ��Ÿ���� ���� h�� ���Ϸ��� �մϴ�. 
��Ű���1�� ������, H-Index�� ������ ���� ���մϴ�.
� �����ڰ� ��ǥ�� �� n�� ��, h�� �̻� �ο�� ���� h�� �̻��̰� ������ ���� h�� ���� �ο�Ǿ��ٸ� h�� �� �������� H-Index�Դϴ�.
� �����ڰ� ��ǥ�� ���� �ο� Ƚ���� ���� �迭 citations�� �Ű������� �־��� ��, �� �������� H-Index�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
�����ڰ� ��ǥ�� ���� ���� 1�� �̻� 1,000�� �����Դϴ�.
���� �ο� Ƚ���� 0ȸ �̻� 10,000ȸ �����Դϴ�.

����� ��
citations	return
[3, 0, 6, 1, 5]	3

����� �� ����
�� �����ڰ� ��ǥ�� ���� ���� 5���̰�, ���� 3���� ���� 3ȸ �̻� �ο�Ǿ����ϴ�. �׸��� ������ 2���� ���� 3ȸ ���� �ο�Ǿ��� ������ �� �������� H-Index�� 3�Դϴ�.
*/

package study_201903;

import java.util.Arrays;

public class Type3 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,0,6,1,0}));
		//1, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 10
		//3, 0, 6, 1, 5
	}
	
	public static int solution(int[] citations) {
		int answer = 0;
		
        Arrays.sort(citations);
        answer = citations[citations.length-1];
        
        loop : 
        while(true) {
        	for(int i = citations.length-1 ; i >= 0; i--) {
        		if(citations[i] >= answer && citations.length - i >= answer) {
        				break loop;        		
        		}
        	}
        	if(answer == 0) {
        		break;
			}else {
				answer--;
			}
        	
        }
        return answer;
    }
	
	/*
	int answer = 0;
    Arrays.sort(citations);

    for (int i = citations.length -1 ; i >= 0 ; i--) {
        if(citations.length -i >= citations[i])
            break;
        answer++;
    }
    System.out.println(answer);
    return answer;
	*/

}
