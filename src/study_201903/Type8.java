/*
���� ����
n���� ���� �ƴ� ������ �ֽ��ϴ�. �� ���� ������ ���ϰų� ���� Ÿ�� �ѹ��� ������� �մϴ�. ���� ��� [1, 1, 1, 1, 1]�� ���� 3�� ������� ���� �ټ� ����� �� �� �ֽ��ϴ�.
-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3
����� �� �ִ� ���ڰ� ��� �迭 numbers, 
Ÿ�� �ѹ� target�� �Ű������� �־��� �� ���ڸ� ������ ���ϰ� ���� Ÿ�� �ѹ��� ����� ����� ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
�־����� ������ ������ 2�� �̻� 20�� �����Դϴ�.
�� ���ڴ� 1 �̻� 50 ������ �ڿ����Դϴ�.
Ÿ�� �ѹ��� 1 �̻� 1000 ������ �ڿ����Դϴ�.

����� ��
numbers	target	return
[1, 1, 1, 1, 1]	3	5

����� �� ����
������ ���� ���� �����ϴ�.
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
