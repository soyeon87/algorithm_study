/*
���� ����
�� ������ ��ϵ� �ֽİ����� ��� �迭 prices�� �Ű������� �־��� ��, ������ �������� ���� �Ⱓ�� �� �������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���ѻ���
prices�� �� ������ 1 �̻� 10,000 ������ �ڿ����Դϴ�.
prices�� ���̴� 2 �̻� 100,000 �����Դϴ�.

����� ��
prices	return
[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]

����� �� ����
1�� ������ 1�� ������ ������ �������� �ʾҽ��ϴ�.
2�� ������ 2�� ������ ������ �������� �ʾҽ��ϴ�.
3�� ������ 3�� 1�ʵڿ� ������ �������ϴ�. ���� 1�ʰ� ������ �������� ���� ������ ���ϴ�.
4�� ������ 2�� 1�ʰ� ������ �������� �ʾҽ��ϴ�.
5�� ������ 3�� 0�ʰ� ������ �������� �ʾҽ��ϴ�.
*/

package study_201903;

public class Type10 {

	public static void main(String[] args) {
		int[] result = solution(new int[]{1, 2, 3, 2, 3});
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]+" ");
		}
		System.out.println();
	}

	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i< prices.length; i++){
        	int check = 0;
        	for(int j = i+1; j < prices.length; j++){
        		if(prices[i] > prices[j]){
        			check = j - i;
        			break;
        		}else{
        			check++;
        		}
        	}
        	answer[i] = check;
        }
        
        return answer;
    }
}
