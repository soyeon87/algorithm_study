/*
문제 설명
n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3
사용할 수 있는 숫자가 담긴 배열 numbers, 
타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
각 숫자는 1 이상 50 이하인 자연수입니다.
타겟 넘버는 1 이상 1000 이하인 자연수입니다.

입출력 예
numbers	target	return
[1, 1, 1, 1, 1]	3	5

입출력 예 설명
문제에 나온 예와 같습니다.
*/

package study_201903;

public class Type8 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,1,1,1,1}, 3));
	}

	public static int solution(int[] numbers, int target) {
        int answer = 0;
        
        int total = 0;
        for(int i : numbers){
        	total += i;
        }
        
        int get = total - target;
        if(get > 0){
            int[] arr = { 1, 3, 5, 7, 9 };
            int n = arr.length;
            int r = 3;
            int[] combArr = new int[n];

            doCombination(combArr, n, r, 0, 0, numbers);
        }else{
        	return 1;
        }
        
        return answer;
    }
	
    public static void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr){
        if(r == 0){
            for(int i=0; i<index; i++) System.out.print(arr[combArr[i]] + " ");
            System.out.println();
        }else if(target == n) return;
        else{
            combArr[index] = target;
            doCombination(combArr, n, r-1, index+1, target+1, arr); // (i)
            doCombination(combArr, n, r, index, target+1, arr); //(ii)
        }
    }
}
