/*
 문제 설명
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.

제한 조건
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

입출력 예
a	b	result
5	24	TUE
*/

package study_201812;

public class Type7 {

	public static void main(String[] args) {
		System.out.println(solution(5, 24));
	}
	
	public static String solution(int a, int b) {
	      String answer = "";
	      
	      int day = 0;
	      for(int i =1; i < a; i++){
	    	  switch(i){
	   		  case 2 : 
	   			  day += 29; break;
	   		  case 4: case 6: case 9: case 11:
	   			  day += 30; break;
    		  default :
    			  day += 31; break;
	    	  }
		  }  
	      
	      day += b;
	    
	      switch(day % 7){
	      	case 0 :
	      		answer = "THU"; break;
	      	case 1 :
	      		answer = "FRI"; break;
	      	case 2 :
	      		answer = "SAT"; break;
	      	case 3 :
	      		answer = "SUN"; break;
	      	case 4 :
	      		answer = "MON"; break;
	      	case 5 :
	      		answer = "TUE"; break;
	      	case 6 :
	      		answer = "WED"; break;
	      }
	      
	      return answer;
	}
	
	/*int all_day=0;
    int[] month_day = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
    String[] day = new String[]{"THU","FRI","SAT","SUN","MON","TUE","WED"};
    
    for(int i = 1; i < a; i++){
  	  all_day += month_day[i-1];
    }
    all_day += b;
    
    answer = day[all_day %7];
    */
}
