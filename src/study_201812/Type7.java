/*
 ���� ����
2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? 
�� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT
�Դϴ�. ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.

���� ����
2016���� �����Դϴ�.
2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)

����� ��
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
