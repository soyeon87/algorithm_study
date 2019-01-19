/*
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s	return
Zbcdefg	gfedcbZ

(추가)
** 함수 활용
1) String 글자 하나하나를 배열로 변환
 - String[] arr = str.split("");
2) String 합치기
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
