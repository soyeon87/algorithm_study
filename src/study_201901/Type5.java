/*
���� ����
���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

���� ����
str�� ���� 1 �̻��� ���ڿ��Դϴ�.
����� ��
s	return
Zbcdefg	gfedcbZ

(�߰�)
** �Լ� Ȱ��
1) String ���� �ϳ��ϳ��� �迭�� ��ȯ
 - String[] arr = str.split("");
2) String ��ġ��
 - String.join("","");
*/

package study_201901;

import java.util.ArrayList;
import java.util.Collections;

public class Type5 {

	public static void main(String[] args) {
		System.out.println(solution("ZABfgab"));
	}

	public static String solution(String s) {
	      String answer = "";
	      
	      ArrayList<String> lowList = new ArrayList<>();
	      ArrayList<String> upList = new ArrayList<>();
	      
	      for(int i = 0; i < s.length(); i++){
	    	  if(s.charAt(i) >= 'a' && s.charAt(i) <='z'){
	    		  lowList.add(s.substring(i, i+1));
	    	  }else if(s.charAt(i) >= 'A' && s.charAt(i) <='Z'){
	    		  upList.add(s.substring(i,i+1));
	    	  }
	      }
	      Collections.sort(lowList);
	      Collections.reverse(lowList);
	      Collections.sort(upList);
	      Collections.reverse(upList);

	      lowList.addAll(upList);
	      
	      for(int i=0; i <lowList.size(); i++){
	    	  answer += lowList.get(i);
	      }
	      
	      return answer; 
	      
	      /*char[] sol = s.toCharArray();
	      Arrays.sort(sol);
	      return new StringBuilder(new String(sol)).reverse().toString();
	      */
	      
	  }
}
