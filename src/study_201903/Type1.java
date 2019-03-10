/*
문제 설명
한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers는 길이 1 이상 7 이하인 문자열입니다.
numbers는 0~9까지 숫자만으로 이루어져 있습니다.
013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.

입출력 예
numbers	return
17	3
011	2

입출력 예 설명
예제 #1
[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.
예제 #2
[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.
11과 011은 같은 숫자로 취급합니다.

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