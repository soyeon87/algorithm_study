/*
���� ����
2���� ��� arr1�� arr2�� �Է¹޾�, arr1�� arr2�� ���� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
��� arr1, arr2�� ��� ���� ���̴� 2 �̻� 100 �����Դϴ�.
��� arr1, arr2�� ���Ҵ� -10 �̻� 20 ������ �ڿ����Դϴ�.
���� �� �ִ� �迭�� �־����ϴ�.

����� ��
arr1	arr2	return
[[1, 4], [3, 2], [4, 1]]	[[3, 3], [3, 3]]	[[15, 15], [15, 15], [15, 15]]
[[2, 3, 2], [4, 2, 4], [3, 1, 4]]	[[5, 4, 3], [2, 4, 1], [3, 1, 1]]	[[22, 22, 11], [36, 28, 18], [29, 20, 14]]
*/

package study_201905;

public class Type5 {

	public static void main(String[] args) {
		int[][] result = solution(new int[][]{{1,4},{3,2},{4,1}},new int[][]{{3,3},{3,3}});
		for(int i = 0; i < result.length; i++){
        	for(int j = 0; j < result[i].length; j++){
        		System.out.print(result[i][j]+" ");
        	}
    		System.out.println();
        }
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < arr1.length; i++){
        	for(int j = 0; j < arr2[0].length; j++){
        		for(int k = 0; k < arr1[i].length; k++){
        			answer[i][j] += arr1[i][k] * arr2[k][j];
        		}
        	}
        }
        return answer;
    }
}
