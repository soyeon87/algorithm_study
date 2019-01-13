package study_201901;

public class Type9 {

	public static void main(String[] args) {
		System.out.println(solution(4));
	}

	public static String solution(int n) {
		String answer = "";
		String[] list = new String[]{"박","수"};
		for(int i = 1; i <= n ; i++) answer += list[i%2];
		return answer;
		
		//return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
	}
}
