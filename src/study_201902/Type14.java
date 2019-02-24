/*
���� ����
���� ���� �踷��⸦ �������� �����Ϸ��� �մϴ�. ȿ������ �۾��� ���ؼ� �踷��⸦ �Ʒ����� ���� ���� ����, �������� ������ �������� �߻��Ͽ� �踷������ �ڸ��ϴ�. 
�踷���� �������� ��ġ�� ���� ������ �����մϴ�.
- �踷���� �ڽź��� �� �踷��� ������ ���� �� �ֽ��ϴ�.
- �踷��⸦ �ٸ� �踷��� ���� ���� ��� ������ ���Եǵ��� ����, ������ ��ġ�� �ʵ��� �����ϴ�.
- �� �踷��⸦ �ڸ��� �������� ��� �ϳ� �����մϴ�.
- �������� � �踷����� �� �������� ��ġ�� �ʽ��ϴ�.
�Ʒ� �׸��� �� ������ �����ϴ� ���� �����ݴϴ�. �������� �׷��� ���� �Ǽ��� �踷����̰�, ���� �������� ��ġ, �������� �׷��� ���� ȭ��ǥ�� �������� �߻� �����Դϴ�.

�̷��� �������� �踷����� ��ġ�� ������ ���� ��ȣ�� �̿��Ͽ� ���ʺ��� ������� ǥ���� �� �ֽ��ϴ�.
(a) �������� ���� ��ȣ�� �ݴ� ��ȣ�� ������ �� '()'���� ǥ���մϴ�. ���� ��� '()'�� �ݵ�� �������� ǥ���մϴ�.
(b) �踷����� ���� ���� ���� ��ȣ '('��, ������ ���� ���� ��ȣ ')'�� ǥ���˴ϴ�.
�� ���� ��ȣ ǥ���� �׸� ���� �־��� �ֽ��ϴ�.
�踷���� �������� ���� �� ���� �������� �߸��µ�, 
�� ������ ���� ���� �ִ� �� ���� �踷���� ���� 3���� 2���� �������� �߸���, �̿� ���� ������� �־��� �踷������ �� 17���� �������� �߸��ϴ�.
�踷���� �������� ��ġ�� ǥ���� ���ڿ� arrangement�� �Ű������� �־��� ��, �߸� �踷��� ������ �� ������ return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
arrangement�� ���̴� �ִ� 100,000�Դϴ�.
arrangement�� ���� ��ȣ�� �ݴ� ��ȣ�� �׻� ���� �̷�ϴ�.

����� ��
arrangement	return
()(((()())(())()))(())	17

����� �� ����
������ ���� ���� �����ϴ�.
*/

package study_201902;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Type14 {

	public static void main(String[] args) {
		System.out.println(solution("()(((()())(())()))(())"));
	}
	
	public static int solution(String arrangement) {
        int answer = 0;
        
        arrangement = arrangement.replace("()", "*");
        System.out.println(arrangement);
        Stack stack = new Stack<>();
        Map list = new HashMap<>();
        int divisor = 0;
        
		for (int j = 0; j < arrangement.length(); j++) {
			if (arrangement.charAt(j) == '(') {
				stack.push(j);
				list.put(j, divisor);
			} else if (arrangement.charAt(j) == ')') {
				answer += divisor - (int) list.get(stack.peek())+1;
				stack.pop();
			} else if (arrangement.charAt(j) == '*') {
				divisor++;
			}
		}
       
        return answer;
        
        /*
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') {
                st.push(i);
            } else if (arrangement.charAt(i) == ')') {
                if (st.peek() + 1 == i) {
                    st.pop();
                    answer += st.size();
                } else {
                    st.pop();
                    answer += 1;
                }
            }
        }
        return answer;
        */
    }

}
