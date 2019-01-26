/*
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.

입출력 예
n	return
12345	[5,4,3,2,1]
*/

package study_201901;

public class Type15 {

	public static void main(String[] args) {
		int[] list = solution(12345);
		for(int i = 0; i < list.length; i++){
			System.out.println(list[i]);
		}
	}

	public static int[] solution(long n) {
		/*//1차코드
		int[] answer = {};
	
		String n_s = String.valueOf(n);
		ArrayList list = new ArrayList<>();
		for(int i = 0; i < n_s.length(); i++){
			list.add(n_s.substring(i,i+1));
		}
		Collections.reverse(list);
		
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++){
			answer[i] =  Integer.parseInt((String) list.get(i));
		}
		
		return answer;
		*/
		
		/*//2차코드
		StringBuilder build = new StringBuilder(String.valueOf(n)).reverse();
		String value = build.toString();
		int answer[] = new int[value.length()];
		for(int i = 0; i < answer.length; i++){
			answer[i] =  Integer.parseInt((String) value.substring(i,i+1));
		}
		return answer;
		*/
		
		//3차코드
		int length = String.valueOf(n).length();
		int answer[] = new int[length];
		while( length > 0){
			answer[length -1] = (int)(n / Math.pow(10, length-1));
			n = (long) (n - answer[length -1]*Math.pow(10, length-1));
			length -= 1;
		}
		return answer;
	}
}
