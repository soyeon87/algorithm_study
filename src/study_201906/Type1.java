/*
문제 설명
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

입출력 예
nums	result
[1,2,3,4]	1
[1,2,7,6,4]	4

입출력 예 설명
입출력 예 #1
[1,2,4]를 이용해서 7을 만들 수 있습니다.
입출력 예 #2
[1,2,4]를 이용해서 7을 만들 수 있습니다.
[1,4,6]을 이용해서 11을 만들 수 있습니다.
[2,4,7]을 이용해서 13을 만들 수 있습니다.
[4,6,7]을 이용해서 17을 만들 수 있습니다.
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

        //숫자의 경우를 구하기
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
