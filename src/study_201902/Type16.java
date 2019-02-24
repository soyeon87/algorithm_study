/*
���� ����
� ���ڿ��� k���� ���� �������� �� ���� �� �ִ� ���� ū ���ڸ� ���Ϸ� �մϴ�.
���� ���, ���� 1924���� �� �� ���� �����ϸ� [19, 12, 14, 92, 94, 24] �� ���� �� �ֽ��ϴ�. �� �� ���� ū ���ڴ� 94 �Դϴ�.
���ڿ� �������� ���� number�� ������ ���� ���� k�� solution �Լ��� �Ű������� �־����ϴ�. 
number���� k ���� ���� �������� �� ���� �� �ִ� �� �� ���� ū ���ڸ� ���ڿ� ���·� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���� ����
number�� 1�ڸ� �̻�, 1,000,000�ڸ� ������ �����Դϴ�.
k�� 1 �̻� number�� �ڸ��� �̸��� �ڿ����Դϴ�.

����� ��
number	k	return
1924	2	94
1231234	3	3234
4177252841	4	775841
*/

package study_201902;


public class Type16 {

	public static void main(String[] args) {
		System.out.println(solution("8824", 2));
	}

	public static String solution(String number, int k) {
		String answer = "";
        
        char[] list = number.toCharArray();
        int index = 0;
        int turn = list.length - k;
        while(turn > 0){
        	System.out.println(answer+"/"+index);
        	for(int i = index; i <= list.length-turn; i++){
        		if (i != index && list[i] > list[index]) {
    				index = i;
            	}
        		if(list[index]=='9'){
					break;
				}
            }
        	answer +=String.valueOf(list[index]);
        	turn--;
        	index++;
        }
        return answer;
        
        /*
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
        */
    }
}
