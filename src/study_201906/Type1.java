/*
���� ����
�־��� ���� �� 3���� ���� ������ �� �Ҽ��� �Ǵ� ����� ������ ���Ϸ��� �մϴ�. 
���ڵ��� ����ִ� �迭 nums�� �Ű������� �־��� ��, nums�� �ִ� ���ڵ� �� ���� �ٸ� 3���� ��� ������ �� �Ҽ��� �Ǵ� ����� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
nums�� ����ִ� ������ ������ 3�� �̻� 50�� �����Դϴ�.
nums�� �� ���Ҵ� 1 �̻� 1000 ������ �ڿ����̸�, �ߺ��� ���ڰ� ������� �ʽ��ϴ�.

����� ��
nums	result
[1,2,3,4]	1
[1,2,7,6,4]	4

����� �� ����
����� �� #1
[1,2,4]�� �̿��ؼ� 7�� ���� �� �ֽ��ϴ�.
����� �� #2
[1,2,4]�� �̿��ؼ� 7�� ���� �� �ֽ��ϴ�.
[1,4,6]�� �̿��ؼ� 11�� ���� �� �ֽ��ϴ�.
[2,4,7]�� �̿��ؼ� 13�� ���� �� �ֽ��ϴ�.
[4,6,7]�� �̿��ؼ� 17�� ���� �� �ֽ��ϴ�.
*/

package study_201906;

import java.util.ArrayList;
import java.util.Stack;

public class Type1 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,7,6,4}));
	}

	static ArrayList<Stack> list = new ArrayList<Stack>();
   
	public static int solution(int[] nums) {
        int answer = 0;

        //������ ��츦 ���ϱ�
        int size = nums.length;
        comb(nums,new boolean[size], 0, size, 3);
		for (int j = 0; j < list.size(); j++) {
			Stack<Integer> value = list.get(j);
			int sum = 0;
			while (!value.isEmpty()) {
				sum += value.pop();
			}
			for (int k = 2; k <= ((int) Math.sqrt(sum) + 1); k++) {
				if (sum % k == 0) {
					sum = -1;
					break;
				}
			}
			if (sum != -1) {
				answer++;
			}
		}
          
        return answer;
    }
	
	static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
        if(r == 0) {
            print(arr, visited, n, r);
            return;
        }
        if(depth == n) {
            return;
        } else {
            visited[depth] = true;
            comb(arr, visited, depth + 1, n, r - 1);
 
            visited[depth] = false;
            comb(arr, visited, depth + 1, n, r);
        }
    }
 
    static void print(int[] arr, boolean[] visited, int n, int r) {
    	Stack<Integer> stack = new Stack();
    	for(int i=0; i<n; i++) {
            if(visited[i] == true){
                stack.push(arr[i]);
            }
        }
    	list.add(stack);
    }
	
	
}
