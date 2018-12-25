//문제 설명
//오늘은 체육수업이 있는 날입니다. 그런데 점심시간에 도둑이 들어 몇몇 학생의 체육복이 도난을 당했습니다. 다행히 일부 학생들이 여벌의 체육복을 가져왔습니다. 
//학생들의 번호는 체격 순으로 매겨져 있기 때문에 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려주려고 합니다.
//예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 
//당연히 체육복을 2벌 가져온 학생의 체육복이 도난을 당했다면, 여벌의 체육복을 빌려줄 수 없습니다.
//체육복이 없으면 체육수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 듣고 싶습니다.
//전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
//체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

//제한사항
//전체 학생의 수는 2명 이상 30명 이하입니다.
//체육복을 도난당한 학생의 수는 2명 이상 n명 이하이고 중복되는 번호는 없습니다.
//여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.

//입출력 예
//n	lost	reserve	return
//5	[2, 4]	[1, 3, 5]	5
//5	[2, 4]	[3]	4

//입출력 예 설명
//예제 //1
//1번 학생이 2번 학생에게 체육복을 빌려주고, 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 학생 5명이 체육수업을 들을 수 있습니다.
//예제 //2
//3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.


package study;

public class Type_2018_12_3 {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = new int[]{2,4};
		int[] reserve = new int[]{3};
		int result = solution(n, lost, reserve);
		System.out.println(result);
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

		int[] person = new int[n];
        for(int i = 0; i < n; i++){
        	person[i] = 1;
        }
        
        for(int i = 0; i< reserve.length; i++){
        	person[reserve[i]-1] = 2;
        }
        
        for(int i = 0; i< lost.length; i++){
        	//잃어버리면 여분이 없어질 뿐 자신의 체육복은 존재한다.
        	switch(person[lost[i]-1]){
        	case 2 :
        		person[lost[i]-1] = 1;
        		break;
        	case 1 :
        		person[lost[i]-1] = 0;
        		break;
        	}
        }
               
        for(int i = 0; i < n ; i++){
        	if(person[i] >= 2){
        		if(i -1 >= 0){
            		if(person[i-1] == 0){
            			person[i-1] = 1;
            			person[i] = 1;
            			continue;
            		}
            	}
        		if(i +1 <= n-1){
        			if(person[i+1] == 0){
        				person[i+1] = 1;
        				person[i] = 1;
        				continue;
        			}
        		}
        	}

        }
        
        for(int i = 0; i < n ; i++){
        	if(person[i]>=1){
        		answer++;
        	}
        }
        
        return answer;
    }
}
