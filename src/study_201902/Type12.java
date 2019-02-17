/*
���� ����
Ʈ�� ���� �밡 ���� ���������� �� ���� �ٸ��� ������ ������ �ǳʷ� �մϴ�. ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� �˾Ƴ��� �մϴ�. 
Ʈ���� 1�ʿ� 1��ŭ �����̸�, �ٸ� ���̴� bridge_length�̰� �ٸ��� ���� weight���� �ߵ��ϴ�.
�� Ʈ���� �ٸ��� ������ ������ ���� ���, �� Ʈ���� ���Դ� ������� �ʽ��ϴ�.
���� ���, ���̰� 2�����, ���� 10kg���� �ߵ�� �ٸ��� �ֽ��ϴ�. ���԰� [7, 4, 5, 6]kg�� Ʈ���� ������� �ִ� �ð� �ȿ� �ٸ��� �ǳʷ��� ������ ���� �ǳʾ� �մϴ�.
��� �ð�	�ٸ��� ���� Ʈ��	�ٸ��� �ǳʴ� Ʈ��	��� Ʈ��
0	[]	[]	[7,4,5,6]
1~2	[]	[7]	[4,5,6]
3	[7]	[4]	[5,6]
4	[7]	[4,5]	[6]
5	[7,4]	[5]	[6]
6~7	[7,4,5]	[6]	[]
8	[7,4,5,6]	[]	[]
����, ��� Ʈ���� �ٸ��� �������� �ּ� 8�ʰ� �ɸ��ϴ�.
solution �Լ��� �Ű������� �ٸ� ���� bridge_length, �ٸ��� �ߵ� �� �ִ� ���� weight, Ʈ���� ���� truck_weights�� �־����ϴ�. 
�̶� ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���� ����
bridge_length�� 1 �̻� 10,000 �����Դϴ�.
weight�� 1 �̻� 10,000 �����Դϴ�.
truck_weights�� ���̴� 1 �̻� 10,000 �����Դϴ�.
��� Ʈ���� ���Դ� 1 �̻� weight �����Դϴ�.

����� ��
bridge_length	weight	truck_weights	return
2	10	[7,4,5,6]	8
100	100	[10]	101
100	100	[10,10,10,10,10,10,10,10,10,10]	110
*/

package study_201902;

import java.util.LinkedList;
import java.util.Queue;

public class Type12 {

	public static void main(String[] args) {
		System.out.println(solution(2,10,new int[]{7,4,5,6}));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue que = new LinkedList();
        for(int i = 0; i < bridge_length; i++){
        	que.offer(0);
        }
        
        int check = 0;
        int sum = 0;
        while(true){
        	sum -= (int)que.peek();
    		que.poll();
    		if(check < truck_weights.length){
    			if(sum + truck_weights[check] <= weight){
            		sum += truck_weights[check];
            		que.offer(truck_weights[check]);
            		check++;
            	}else{
            		que.offer(0);
            	}
    		}else{
    			que.offer(0);
    		}
        	answer++;
        	if(check == truck_weights.length && sum == 0){
        		break;
        	}
        }
        
        return answer;
    }
}
