/*
문제 설명
네트워크란 컴퓨터 상호 간에 정보를 교환할 수 있도록 연결된 형태를 의미합니다. 
예를 들어, 컴퓨터 A와 컴퓨터 B가 직접적으로 연결되어있고, 컴퓨터 B와 컴퓨터 C가 직접적으로 연결되어 있을 때 컴퓨터 A와 컴퓨터 C도 간접적으로 연결되어 정보를 교환할 수 있습니다. 
따라서 컴퓨터 A, B, C는 모두 같은 네트워크 상에 있다고 할 수 있습니다.
컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.

제한사항
컴퓨터의 개수 n은 1 이상 200 이하인 자연수입니다.
각 컴퓨터는 0부터 n-1인 정수로 표현합니다.
i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j]를 1로 표현합니다.
computer[i][i]는 항상 1입니다.

입출력 예
n	computers	return
3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1

입출력 예 설명
예제 #1
아래와 같이 2개의 네트워크가 있습니다.
예제 #2
아래와 같이 1개의 네트워크가 있습니다.

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
		System.out.println(solution(4, new int[][]{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}}));//이거 수정
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
        	//System.out.println("이번연결수 --"+prearr.size());
        	if(array.size()>0){
        		check = 0;
    			loop : for(int q=0; q< prearr.size(); q++){
        			int get = prearr.get(q);
        			//System.out.println("체크할수 --"+get);
    				for (int k = 0; k < array.size(); k++) {
    					que = array.get(k);
    					if (que.contains(get)){
    						//System.out.println("발견---"+get+"/k:"+que.size()+"/preque:"+prearr.size());
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
