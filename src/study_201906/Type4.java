/*
문제 설명
△△ 게임대회가 개최되었습니다. 이 대회는 N명이 참가하고, 토너먼트 형식으로 진행됩니다. N명의 참가자는 각각 1부터 N번을 차례대로 배정받습니다. 
그리고, 1번↔2번, 3번↔4번, ... , N-1번↔N번의 참가자끼리 게임을 진행합니다. 각 게임에서 이긴 사람은 다음 라운드에 진출할 수 있습니다. 
이때, 다음 라운드에 진출할 참가자의 번호는 다시 1번부터 N/2번을 차례대로 배정받습니다. 
만약 1번↔2번 끼리 겨루는 게임에서 2번이 승리했다면 다음 라운드에서 1번을 부여받고, 3번↔4번에서 겨루는 게임에서 3번이 승리했다면 다음 라운드에서 2번을 부여받게 됩니다. 
게임은 최종 한 명이 남을 때까지 진행됩니다.
이때, 처음 라운드에서 A번을 가진 참가자는 경쟁자로 생각하는 B번 참가자와 몇 번째 라운드에서 만나는지 궁금해졌습니다. 
게임 참가자 수 N, 참가자 번호 A, 경쟁자 번호 B가 함수 solution의 매개변수로 주어질 때, 
처음 라운드에서 A번을 가진 참가자는 경쟁자로 생각하는 B번 참가자와 몇 번째 라운드에서 만나는지 return 하는 solution 함수를 완성해 주세요. 
단, A번 참가자와 B번 참가자는 서로 붙게 되기 전까지 항상 이긴다고 가정합니다.

제한사항
N : 21 이상 220 이하인 자연수 (2의 지수 승으로 주어지므로 부전승은 발생하지 않습니다.)
A, B : N 이하인 자연수 (단, A ≠ B 입니다.)

입출력 예
N	A	B	answer
8	4	7	3

입출력 예 설명
입출력 예 #1
첫 번째 라운드에서 4번 참가자는 3번 참가자와 붙게 되고, 7번 참가자는 8번 참가자와 붙게 됩니다. 
항상 이긴다고 가정했으므로 4번 참가자는 다음 라운드에서 2번이 되고, 7번 참가자는 4번이 됩니다. 
두 번째 라운드에서 2번은 1번과 붙게 되고, 4번은 3번과 붙게 됩니다. 
항상 이긴다고 가정했으므로 2번은 다음 라운드에서 1번이 되고, 4번은 2번이 됩니다. 
세 번째 라운드에서 1번과 2번으로 두 참가자가 붙게 되므로 3을 return 하면 됩니다.
*/

package study_201906;

public class Type4 {

	public static void main(String[] args) {
		System.out.println(solution(8,4,7));
	}

	public static int solution(int n, int a, int b)
    {
        int answer = 1;
        
        if(a>b){
        	int temp = a;
        	a = b;
        	b = temp;
        }
        
        int[] list = new int[n];
        for(int i = 0; i < n; i++){
        	list[i] = i+1;
        }
        
        int[] temp;
        int index = 0;
        while(list.length/2 > 0){
        	temp = new int[list.length/2];
        	index = 0;
        	for(int i = 0; i < list.length; i=i+2){
        		if(list[i] == a && list[i+1] == b){
            		return answer;
            	}
        		if(list[i] == a || list[i] == b){
            		temp[index] = list[i];
            	}else{
            		temp[index] = list[i+1];
            	}
            	index++;
            }
        	answer++;
        	list = temp;
        }
        
        return answer;
    }
}
