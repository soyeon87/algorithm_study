/*
���� ����
�Ϲ����� �����ʹ� �μ� ��û�� ���� ������� �μ��մϴ�. �׷��� ������ �߿��� ������ ���߿� �μ�� �� �ֽ��ϴ�. 
�̷� ������ �����ϱ� ���� �߿䵵�� ���� ������ ���� �μ��ϴ� �����͸� �����߽��ϴ�. �� ���Ӱ� ������ �����ʹ� �Ʒ��� ���� ������� �μ� �۾��� �����մϴ�.

1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� J�� ������� ���� �������� �ֽ��ϴ�.
3. �׷��� ������ J�� �μ��մϴ�.

���� ���, 4���� ����(A, B, C, D)�� ������� �μ� ����Ͽ� �ְ� �߿䵵�� 2 1 3 2 ��� C D A B ������ �μ��ϰ� �˴ϴ�.
���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� �˰� �ͽ��ϴ�. ���� ������ C�� 1��°��, A�� 3��°�� �μ�˴ϴ�.
���� ����Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭 priorities�� ���� �μ⸦ ��û�� ������ ���� ������� � ��ġ�� �ִ����� �˷��ִ� location�� �Ű������� �־��� ��, 
���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
���� ����Ͽ��� 1�� �̻� 100�� ������ ������ �ֽ��ϴ�.
�μ� �۾��� �߿䵵�� 1~9�� ǥ���ϸ� ���ڰ� Ŭ���� �߿��ϴٴ� ���Դϴ�.
location�� 0 �̻� (���� ����Ͽ� �ִ� �۾� �� - 1) ������ ���� ������ ������� ���� �տ� ������ 0, �� ��°�� ������ 1�� ǥ���մϴ�.

����� ��
priorities	location	return
[2, 1, 3, 2]	2	1
[1, 1, 9, 1, 1, 1]	0	5

����� �� ����
���� #1
������ ���� ���� �����ϴ�.
���� #2
6���� ����(A, B, C, D, E, F)�� �μ� ����Ͽ� �ְ� �߿䵵�� 1 1 9 1 1 1 �̹Ƿ� C D E F A B ������ �μ��մϴ�.
*/

package study_201902;

import java.util.LinkedList;
import java.util.Queue;

public class Type13 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue que = new LinkedList();
        for(int i = 0; i < priorities.length;i++){
        	que.offer(i);        		
        }
        
        int check = 0;
        int temp = 0;
        while(true){
        	temp = (int)que.peek();
        	for(int i = 0; i < priorities.length; i++){
        		if (priorities[check] < priorities[i]) {
    				que.poll();
    				que.offer(temp);
    				break;
    			}
        	}
        	if(temp == (int)que.peek()){
        		if(temp == location){
        			answer++;
        			break;
        		}else{
        			que.poll();
        			priorities[temp] = 0;
        			answer++;
        		}
        	}
        	
        	while(true){
        		check++;
        		if(check == priorities.length){
            		check = 0;
            	}
        		if(priorities[check] > 0){
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
