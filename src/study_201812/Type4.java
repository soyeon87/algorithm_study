//���� ����
//�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

//���ѻ���
//s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.

//����� ��
//s	return
//abcde	c
//qwer	we


package study_201812;

public class Type4 {

	public static void main(String[] args) {
		String s = "abcde";
		String result = solution(s);
		System.out.println(result);
	}

	public static String solution(String s) {
	      String answer = "";
	      
	      int length = s.length();
	      int mid = 0;
	      
	      if(length % 2 == 1){
	          mid = length / 2 + 1;
	          answer = s.substring( mid-1,mid );
	      }else if(length % 2 == 0){
	          mid = length / 2;
	          answer = s.substring(mid-1, mid+1);
	      }
	      
	      //���� �ڵ�
	      return s.substring((s.length()-1) / 2, s.length()/2 + 1);
	      
	      //return answer;
	}
}
