
/*
���� ����
�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 
'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
������� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.

���ѻ���
���ڿ� s�� ���� : 50 ������ �ڿ���
���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.

����� ��
s	answer
pPoooyY	true
Pyy	false

����� �� ����
����� �� #1
'p'�� ���� 2��, 'y'�� ���� 2���� �����Ƿ� true�� return �մϴ�.
����� �� #2
'p'�� ���� 1��, 'y'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�.
*/

package study_201901;

public class Type4 {

	public static void main(String[] args) {
		System.out.println(solution("PyY"));
	}

	public static boolean solution(String s) {
        boolean answer = true;

        char[] list = s.toLowerCase().toCharArray();
        int a =0,b = 0;
        for(char c : list){
        	if(c == 'p') a++;
        	else if(c == 'y') b++;
        }
        if(a != b) answer = false;
        
        /*s = s.toUpperCase();
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
        */
        return answer;
    }
}
