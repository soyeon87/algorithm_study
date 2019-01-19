/*
���� ����
� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. 
���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

���� ����
������ �ƹ��� �о �����Դϴ�.
s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
s�� ���̴� 8000�����Դϴ�.
n�� 1 �̻�, 25������ �ڿ����Դϴ�.

����� ��
s	n	result
AB	1	BC
z	1	a
a B z	4	e F d
*/

package study_201901;

public class Type11 {

	public static void main(String[] args) {
		System.out.println(solution("a B z",4));
	}

	public static String solution(String s, int n) {
		
		char[] list = s.toCharArray();
		int sub = 0;
		char first = ' ';
		for(int i = 0; i < list.length; i++){
			if(list[i] != ' '){
				if(list[i] >= 'A' && list[i] <='Z'){
					sub = 'Z'-(char)list[i];
					first = 'A';
				}else if(list[i] >= 'a' && list[i] <='z'){
					sub = 'z'-(char)list[i];
					first = 'a';
				}
				if(n > sub){
					list[i] = (char)(first+(n-sub-1));
				}else{
					list[i] = (char)(list[i] + n);
				}
			}
		}
		
		return new String(list);
		
	/*	String result = "";
	    for (int i = 0; i < s.length(); i++) {
	      char ch = s.charAt(i);
	      if (Character.isLowerCase(ch)) {
	        ch = (char) ((ch - 'a' + n) % 26 + 'a');
	      } else if (Character.isUpperCase(ch)) {
	        ch = (char) ((ch - 'A' + n) % 26 + 'A');
	      }
	      result += ch;
	    }
	    return result; */
	}
}
