/*
¦���� �����ϱ��, ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��� ������ �����մϴ�. ���� ���ڿ����� ���� ���ĺ��� 2�� �پ� �ִ� ¦�� ã���ϴ�. 
�״���, �� ���� ������ ��, �յڷ� ���ڿ��� �̾� ���Դϴ�. �� ������ �ݺ��ؼ� ���ڿ��� ��� �����Ѵٸ� ¦���� �����ϱⰡ ����˴ϴ�. 
���ڿ� S�� �־����� ��, ¦���� �����ϱ⸦ ���������� ������ �� �ִ��� ��ȯ�ϴ� �Լ��� �ϼ��� �ּ���. ���������� ������ �� ������ 1��, �ƴ� ��� 0�� �������ָ� �˴ϴ�.
���� ���, ���ڿ� S = baabaa ��� 
b aa baa �� bb aa �� aa ��
�� ������ ���ڿ��� ��� ������ �� �����Ƿ� 1�� ��ȯ�մϴ�.

���ѻ���
���ڿ��� ���� : 1,000,000������ �ڿ���
���ڿ��� ��� �ҹ��ڷ� �̷���� �ֽ��ϴ�.

����� ��
s	result
baabaa	1
cdcd	0

����� �� ����
����� �� #1
���� ���ÿ� �����ϴ�.
����� �� #2
���ڿ��� ���������� ¦���� ������ �� �ִ� ���ڿ��� �� �̻� �������� �ʱ� ������ 0�� ��ȯ�մϴ�.
*/

package study_201905;

import java.util.Stack;

public class Type8 {

	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
	}

	public static int solution(String s)
    {

		if(s.length() %2 == 1 ){
			return 0;
		}
		
		Stack<String> stack = new Stack<String>();
		String check = "";
		for(int i =0; i < s.length(); i++){
			check = s.substring(i,i+1);
			if(!stack.isEmpty() && stack.peek().equals(check)){
				stack.pop();
			}else{
				stack.push(check);
			}
		}
        return stack.size()== 0 ? 1 :0;
    }
}
