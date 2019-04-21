/*
���� ����
��ȣ�� �ٸ��� ¦�������ٴ� ���� '(' ���ڷ� �������� �ݵ�� ¦��� ')' ���ڷ� ������ �Ѵٴ� ���Դϴ�. ���� ���
()() �Ǵ� (())() �� �ùٸ� ��ȣ�Դϴ�.
)()( �Ǵ� (()( �� �ùٸ��� ���� ��ȣ�Դϴ�.
'(' �Ǵ� ')' �θ� �̷���� ���ڿ� s�� �־����� ��, ���ڿ� s�� �ùٸ� ��ȣ�̸� true�� return �ϰ�, 
�ùٸ��� ���� ��ȣ�̸� false�� return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
���ڿ� s�� ���� : 100,000 ������ �ڿ���
���ڿ� s�� '(' �Ǵ� ')' �θ� �̷���� �ֽ��ϴ�.

����� ��
s	answer
()()	true
(())()	true
)()(	false
(()(	false

����� �� ����
����� �� #1,2,3,4
������ ���ÿ� �����ϴ�.
*/

package study_201904;

public class Type3 {

	public static void main(String[] args) {
		System.out.println(solution("(()("));
	}

	static boolean solution(String s) {
		
		if(s.length()%2 == 1){
			return false;
		}
		
		int check = 0;
		int precount = 0;
		for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == '('){
        		check++;
        		precount++;
        		if(precount > s.length()/2){
        			return false;
        		}
        	}else if(s.charAt(i) == ')'){
        		if(check<=0){
        			return false;
        		}else{
            		check--;
        		}
        	}
        }
		
		return true;
    }
}