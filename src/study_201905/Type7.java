/*
���� ����
�� ���� �ּҰ����(Least Common Multiple)�� �Էµ� �� ���� ��� �� ������ �Ǵ� ���� ���� ���ڸ� �ǹ��մϴ�. ���� ��� 2�� 7�� �ּҰ������ 14�� �˴ϴ�. 
���Ǹ� Ȯ���ؼ�, n���� ���� �ּҰ������ n ���� ������ ��� �� ������ �Ǵ� ���� ���� ���ڰ� �˴ϴ�. 
n���� ���ڸ� ���� �迭 arr�� �ԷµǾ��� �� �� ������ �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� �ּ���.

���� ����
arr�� ���� 1�̻�, 15������ �迭�Դϴ�.
arr�� ���Ҵ� 100 ������ �ڿ����Դϴ�.

����� ��
arr	result
[2,6,8,14]	168
[1,2,3]	6
*/

package study_201905;

public class Type7 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3,4}));
	}
	
	public static int solution(int[] arr) {
		int answer = 1;
		for(int i = 1; i < arr.length; i++){
			if(i == 1){
				answer = arr[i-1]*arr[i] / getMoc(arr[i-1], arr[i]);
			}else{
				answer = arr[i]*answer / getMoc(answer, arr[i]);
			}
		}
		return answer;
	}
	
	public static int getMoc(int a,int b){
		while(b!=0){
			int r = a%b;
			a= b;
			b= r;
		}
		return a;
	}

}
