/*
���� ����
���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. 
���� ��� strings�� [sun, bed, car]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� u, e, a�� strings�� �����մϴ�.

���� ����
strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
��� strings�� ������ ���̴� n���� Ů�ϴ�.
�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.

����� ��
strings	n	return
[sun, bed, car]	1	[car, bed, sun]
[abce, abcd, cdx]	2	[abcd, abce, cdx]

����� �� ����
����� �� 1
sun, bed, car�� 1��° �ε��� ���� ���� u, e, a �Դϴ�. �̸� �������� strings�� �����ϸ� [car, bed, sun] �Դϴ�.
����� �� 2
abce�� abcd, cdx�� 2��° �ε��� ���� c, c, x�Դϴ�. ���� ���� �Ŀ��� cdx�� ���� �ڿ� ��ġ�մϴ�. 
abce�� abcd�� ���������� �����ϸ� abcd�� �켱�ϹǷ�, ���� [abcd, abce, cdx] �Դϴ�. 
*/

package study_201901;

import java.util.Arrays;

public class Type3 {

	public static void main(String[] args) {
		String[] strings = new String[]{"sun","bed","car"};
		String[] result = solution(strings, 1);
		for(int i =0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}
	
	public static String[] solution(String[] strings, int n) {
	      
	      String temp = "";
	      String[] copy = {};
	      for(int i =0; i < strings.length; i++){
	    	  for(int j = 0; j < strings.length-i-1; j++){
	    		  if(strings[j].charAt(n) > strings[j+1].charAt(n)){
		    		  temp = strings[j];
		    		  strings[j] = strings[j+1];
		    		  strings[j+1] = temp;
		    	  }else if(strings[j].charAt(n) == strings[j+1].charAt(n)){
		    		  copy = Arrays.copyOfRange(strings, j, j+2);
		    		  Arrays.sort(copy);
		    		  strings[j] = copy[0];
		    		  strings[j+1] = copy[1];
 		    	  }  
	    	  }
	      }
	      
	      return strings;
	}

}
