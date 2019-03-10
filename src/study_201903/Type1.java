/*
���� ����
���ڸ� ���ڰ� ���� ���� ������ ������ֽ��ϴ�. ����� ���� ������ �ٿ� �Ҽ��� �� �� ���� �� �ִ��� �˾Ƴ��� �մϴ�.
�� ���� ������ ���� ���ڰ� ���� ���ڿ� numbers�� �־����� ��, ���� �������� ���� �� �ִ� �Ҽ��� �� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
numbers�� ���� 1 �̻� 7 ������ ���ڿ��Դϴ�.
numbers�� 0~9���� ���ڸ����� �̷���� �ֽ��ϴ�.
013�� 0, 1, 3 ���ڰ� ���� ���� ������ ������ִٴ� �ǹ��Դϴ�.

����� ��
numbers	return
17	3
011	2

����� �� ����
���� #1
[1, 7]���δ� �Ҽ� [7, 17, 71]�� ���� �� �ֽ��ϴ�.
���� #2
[0, 1, 1]���δ� �Ҽ� [11, 101]�� ���� �� �ֽ��ϴ�.
11�� 011�� ���� ���ڷ� ����մϴ�.

*/
package study_201903;

import java.util.HashSet;

public class Type1 {

	public static void main(String[] args) {
		System.out.println(solution("1234"));		
	}
	
	public static int solution(String numbers) {
       
        int arr[] = new int[numbers.length()];
        for(int i = 0; i < arr.length; i++){
        	arr[i] = Integer.valueOf(numbers.substring(i,i+1));
        }
        
        doPermutation(arr,0);
        System.out.println(value);
        String[] list = value.split("\n");
        
        HashSet set = new HashSet<>();
        
        for(int i = 1; i <= arr.length; i++){
        	loop :
        	for(int j =0; j < list.length; j++){
        		int check = Integer.parseInt(list[j].substring(0, i));
        		if(check > 1){
        			int max = (int)Math.sqrt(check)+1;
        			for(int h = 2; h < max ; h++){
        				if(check % h == 0){ 
        					continue loop;
        				}
        			}
        			set.add(check);
        		}
        	}
        }
        
        return set.size();
    }

	static String value = "";
	
	public static void doPermutation(int[] arr, int startIdx) {
		int length = arr.length;
		
		if(startIdx == length-1){
            for(int n: arr) value +=String.valueOf(n);
            value += "\n";
            return;
        }
		
		for (int i = startIdx; i < length; i++) {
			swap(arr, startIdx, i);
			doPermutation(arr, startIdx + 1);
			swap(arr, startIdx, i);
		}
	}

	public static void swap(int[] arr, int n1, int n2) {
		int temp = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = temp;
	}
	
	//https://onsil-thegreenhouse.github.io/programming/algorithm/2018/04/05/permutation_combination/
}