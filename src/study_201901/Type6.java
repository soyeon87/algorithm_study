/*
���� ����
���ڿ� s�� ���̰� 4Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���.
������� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.

���� ����
s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.

����� ��
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
	      /* 1���ڵ�
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
	      
		  //2���ڵ�
		  boolean answer = false;
	      if(s.length() == 4 || s.length() ==6 ) 
	    	  if((int)s.chars().filter(a -> a< '0' || a >'9').count() == 0 ) answer = true;
	      return answer;
	      
	      /*if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
	      return false;*/
	}
}
