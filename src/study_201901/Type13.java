/*
 ���� ����
���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. 
�� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. 
�� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.

����� ��
s	return
try hello world	TrY HeLlO WoRlD

����� �� ����
try hello world�� �� �ܾ� try, hello, world�� �����Ǿ� �ֽ��ϴ�. 
�� �ܾ��� ¦����° ���ڸ� �빮�ڷ�, Ȧ����° ���ڸ� �ҹ��ڷ� �ٲٸ� TrY, HeLlO, WoRlD�Դϴ�. 
���� TrY HeLlO WoRlD �� �����մϴ�.
*/

package study_201901;

public class Type13 {

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}

	public static String solution(String s) {
		String answer = "";
		int check = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != ' '){
				if(check % 2 != 0) {
					answer += String.valueOf(s.charAt(i)).toLowerCase();
				}else{
					answer += String.valueOf(s.charAt(i)).toUpperCase();
				}
				check++;
			}else{
				answer += " ";
				check = 0;
			}
		}
		return answer;
		
		/*String answer = "";
        int cnt = 0;
        String[] array = s.split("");
        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
        return answer;*/
	}
}
