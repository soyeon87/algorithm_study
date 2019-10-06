/*
���� ����
��Ʈ��ũ�� ��ǻ�� ��ȣ ���� ������ ��ȯ�� �� �ֵ��� ����� ���¸� �ǹ��մϴ�. 
���� ���, ��ǻ�� A�� ��ǻ�� B�� ���������� ����Ǿ��ְ�, ��ǻ�� B�� ��ǻ�� C�� ���������� ����Ǿ� ���� �� ��ǻ�� A�� ��ǻ�� C�� ���������� ����Ǿ� ������ ��ȯ�� �� �ֽ��ϴ�. 
���� ��ǻ�� A, B, C�� ��� ���� ��Ʈ��ũ �� �ִٰ� �� �� �ֽ��ϴ�.
��ǻ���� ���� n, ���ῡ ���� ������ ��� 2���� �迭 computers�� �Ű������� �־��� ��, ��Ʈ��ũ�� ������ return �ϵ��� solution �Լ��� �ۼ��Ͻÿ�.

���ѻ���
��ǻ���� ���� n�� 1 �̻� 200 ������ �ڿ����Դϴ�.
�� ��ǻ�ʹ� 0���� n-1�� ������ ǥ���մϴ�.
i�� ��ǻ�Ϳ� j�� ��ǻ�Ͱ� ����Ǿ� ������ computers[i][j]�� 1�� ǥ���մϴ�.
computer[i][i]�� �׻� 1�Դϴ�.

����� ��
n	computers	return
3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1

����� �� ����
���� #1
�Ʒ��� ���� 2���� ��Ʈ��ũ�� �ֽ��ϴ�.
���� #2
�Ʒ��� ���� 1���� ��Ʈ��ũ�� �ֽ��ϴ�.

*/

package study_201910;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Type4 {

	public static void main(String[] args) {
		System.out.println(solution(3, new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
		System.out.println(solution(3, new int[][]{{1,1,0},{1,1,1},{0,0,1}}));
		System.out.println(solution(3, new int[][]{{1,0,0},{0,1,0},{0,0,1}}));
		System.out.println(solution(4, new int[][]{{1,0,0,1},{0,1,1,1},{0,1,1,0},{1,1,0,1}}));
		System.out.println(solution(4, new int[][]{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}}));//�̰� ����
	}

    public static int solution(int n, int[][] computers) {
        //int answer = 0;
        
        ArrayList<Queue> array = new ArrayList<Queue>();
        ArrayList<Integer> prearr = new ArrayList<Integer>();
        Queue que = new LinkedList<>();
        int check = 0;
        for(int i = 0; i < computers.length; i++){
        	
        	prearr = new ArrayList<Integer>();
        	for(int j = 0; j < computers[i].length; j++){
        		if(computers[i][j]==1){
        			prearr.add(j+1);
        			//System.out.println("prearr:"+(j+1));
        			computers[j][i] = 2;
        		}	 
        	}
        	//System.out.println("�̹������ --"+prearr.size());
        	if(array.size()>0){
        		check = 0;
    			loop : for(int q=0; q< prearr.size(); q++){
        			int get = prearr.get(q);
        			//System.out.println("üũ�Ҽ� --"+get);
    				for (int k = 0; k < array.size(); k++) {
    					que = array.get(k);
    					if (que.contains(get)){
    						//System.out.println("�߰�---"+get+"/k:"+que.size()+"/preque:"+prearr.size());
    						check++;
    						for(int p=0; p<prearr.size(); p++){
    							if(prearr.get(p) != get){
    								que.offer(prearr.get(p));
    							}
    						}
    						array.remove(k);
    		    			array.add(que);
    						break loop;
        				}
        			}
        		}
        		if(check==0){
        			que = new LinkedList<>();
        			for(int p=0; p<prearr.size(); p++){
        				que.offer(prearr.get(p));
    				}
        			array.add(que);
        		}
    		}else{
    			que = new LinkedList<>();
    			for(int p=0; p<prearr.size(); p++){
    				que.offer(prearr.get(p));
				}
    			array.add(que);
    		}
			//System.out.println(que.size()+"/"+array.size());
			
        }
        
        return array.size();
    }

}
