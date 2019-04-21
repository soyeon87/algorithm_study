/*
���� ����
�����Ա� ������ �Ϸ��� �մϴ�. �����Ա� ������ ��(land)�� �� N�� 4���� �̷���� �ְ�, ��� ĭ���� ������ ���� �ֽ��ϴ�. 
1����� ���� ������ �� �྿ ������ ��, �� ���� 4ĭ �� �� ĭ�� �����鼭 �����;� �մϴ�. 
��, �����Ա� ���ӿ��� �� �྿ ������ ��, ���� ���� �����ؼ� ���� �� ���� Ư�� ��Ģ�� �ֽ��ϴ�.
���� ���,
| 1 | 2 | 3 | 5 |
| 5 | 6 | 7 | 8 |
| 4 | 3 | 2 | 1 |
�� ���� �־����ٸ�, 1�࿡�� �׹�° ĭ (5)�� �������, 2���� �׹�° ĭ (8)�� ���� �� �����ϴ�.
������ ����� ��� �������� ��, ���� �� �ִ� ������ �ִ밪�� return�ϴ� solution �Լ��� �ϼ��� �ּ���. 
�� ���� ���, 1���� �׹�° ĭ (5), 2���� ����° ĭ (7), 3���� ù��° ĭ (4) ���� ��� 16���� �ְ����� �ǹǷ� 16�� return �ϸ� �˴ϴ�.

���ѻ���
���� ���� N : 100,000 ������ �ڿ���
���� ������ 4���̰�, ��(land)�� 2���� �迭�� �־����ϴ�.
���� : 100 ������ �ڿ���

����� ��
land	answer
[[1,2,3,5],[5,6,7,8],[4,3,2,1]]	16

����� �� ����
����� �� #1
������ ���ÿ� �����ϴ�.
*/

package study_201904;

public class Type5 {

	public static void main(String[] args) {
		System.out.println(solution(new int[][]{{1,2,3,3},{5,6,7,8},{4,3,2,1}}));
	}
	
	static int solution(int[][] land) {
        int answer = 0;
        int check = 0;
        int precol = 0, col = 0;
        
        for(int i = 0; i < land.length; i++){
        	check = 0;
        	col = precol;
        	precol = 0;
        	for(int j = 0; j < land[i].length; j++){
        		if(i > 0 && j == col){
        			continue;
        		}
        		if(check < land[i][j]){
        			check = land[i][j];
        			precol = j;
        		}else if(i < land.length-1 && check == land[i][j]){
        			if(land[i+1][precol] > land[i+1][j]){
        				check = land[i][j];
            			precol = j;
        			}
        		}
        	}
        	System.out.println(precol);
        	answer += land[i][precol];
        }
        
        return answer;
    }

}
