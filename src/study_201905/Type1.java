/*
���� ����
Finn�� ���� ���а��ο� ���� �ֽ��ϴ�. ���� ���θ� �ϴ� Finn�� �ڿ��� n�� ������ �ڿ������ ǥ�� �ϴ� ����� ��������� ����� �˰� �Ǿ����ϴ�. 
������� 15�� ������ ���� 4������ ǥ�� �� �� �ֽ��ϴ�.
1 + 2 + 3 + 4 + 5 = 15
4 + 5 + 6 = 15
7 + 8 = 15
15 = 15
�ڿ��� n�� �Ű������� �־��� ��, ���ӵ� �ڿ������ n�� ǥ���ϴ� ����� ���� return�ϴ� solution�� �ϼ����ּ���.

���ѻ���
n�� 10,000 ������ �ڿ��� �Դϴ�.

����� ��
n	result
15	4

����� �� ����
����� ��#1
������ ���ÿ� �����ϴ�.
*/

package study_201905;

public class Type1 {

	public static void main(String[] args) {
		System.out.println(solution(15));
	}

	public static int solution(int n) {
		int answer = 0;
		
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum = 0;
			for(int j = i; j <=n; j++){
				sum += j ;
				if(sum == n){
					answer++;
					break;
				}else if(sum > n){
					break;
				}
			}
		}
		
		return answer;
		
		/*
		int answer = 0;
        for (int i = 1; i <= num; i += 2) {
            if (num % i == 0) {
                answer++;
            }
        }
        return answer;
        //�־��� �ڿ����� ���ӵ� �ڿ����� ������ ǥ���ϴ� ����� ���� �־��� ���� Ȧ�� ����� ������ ����.
        */
	}
}
