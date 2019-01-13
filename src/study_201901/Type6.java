/*
문제 설명
문자열 s의 길이가 4혹은 6이고, 숫자로만 구성되있는지 확인해주는 함수, solution을 완성하세요.
예를들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.

입출력 예
s	return
a234	false
1234	true
*/

package study_201901;

public class Type6 {

	public static void main(String[] args) {
		System.out.println(solution("a134"));
	}

	public static boolean solution(String s) {     
	      /* 1차코드
	      boolean answer = true;
	      if(s.length() == 4 || s.length() == 6){
	    	  char[] list = s.toCharArray();
		      for(int i = 0; i < list.length; i++){
		    	  if(list[i] < '0' || list[i] > '9'){
		    		  answer = false;
		    		  break;
		    	  }
		      }
	      }else{
	    	  answer = false;
	      }
	      return answer;
	      */
	      
		  //2차코드
		  boolean answer = false;
	      if(s.length() == 4 || s.length() ==6 ) 
	    	  if((int)s.chars().filter(a -> a< '0' || a >'9').count() == 0 ) answer = true;
	      return answer;
	      
	      /*if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
	      return false;*/
	}
}
