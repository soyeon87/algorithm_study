/*
���� ����
���̽�ƽ���� ���ĺ� �̸��� �ϼ��ϼ���. �� ó���� A�θ� �̷���� �ֽ��ϴ�.
ex) �ϼ��ؾ� �ϴ� �̸��� �� ���ڸ� AAA, �� ���ڸ� AAAA
���̽�ƽ�� �� �������� �����̸� �Ʒ��� �����ϴ�.
�� - ���� ���ĺ�
�� - ���� ���ĺ� (A���� �Ʒ������� �̵��ϸ� Z��)
�� - Ŀ���� �������� �̵� (ù ��° ��ġ���� �������� �̵��ϸ� ������ ���ڿ� Ŀ��)
�� - Ŀ���� ���������� �̵�
���� ��� �Ʒ��� ������� JAZ�� ���� �� �ֽ��ϴ�.
- ù ��° ��ġ���� ���̽�ƽ�� ���� 9�� �����Ͽ� J�� �ϼ��մϴ�.
- ���̽�ƽ�� �������� 1�� �����Ͽ� Ŀ���� ������ ���� ��ġ�� �̵���ŵ�ϴ�.
- ������ ��ġ���� ���̽�ƽ�� �Ʒ��� 1�� �����Ͽ� Z�� �ϼ��մϴ�.
���� 11�� �̵����� "JAZ"�� ���� �� �ְ�, �̶��� �ּ� �̵��Դϴ�.
������� �ϴ� �̸� name�� �Ű������� �־��� ��, �̸��� ���� ���̽�ƽ ���� Ƚ���� �ּڰ��� return �ϵ��� solution �Լ��� ���弼��.

���� ����
name�� ���ĺ� �빮�ڷθ� �̷���� �ֽ��ϴ�.
name�� ���̴� 1 �̻� 20 �����Դϴ�.

����� ��
name	return
JEROEN	56
JAN	23
*/

package study_201902;

public class Type17 {

	public static void main(String[] args) {
		System.out.println(solution("ABBB"));
	}

	public static int solution(String name) {
		int answer = 0;
		
		long count = name.chars().filter(a -> a != 'A').count();
		//System.out.println(count);
		int check = 0;
		int index = 0;
		char[] names = name.toCharArray();
		String direction = "";
		while(true){
			//���Ʒ� ã��
			if(names[index] != 'A'){
				//System.out.println("no");
				check = 'Z' - names[index];
				if(check >=13){
					answer += names[index] - 'A';
				}else{
					answer += check+1;
				}
				count--;
				if(count <= 0){
					break;
				}
				System.out.println(index+"/"+answer);
			}
			if((index == 0 && names[index] == 'A')|| names[index] != 'A'){
			
				//���� ã��
				//System.out.println("next");
				int next= 0;
				for(int i = 1; i < names.length; i++){
					if(names[(index+i)%names.length] != 'A'){
						next = (index+i)%names.length;
						break;
					}
				}
				if(direction.equals("")){
					if(next-index > index + (names.length - next)){
						//�����̵�
						//System.out.println(index + (names.length - next));
						answer += index + (names.length - next);
						direction = "left";
					}else{
						//�����̵�
						//System.out.println(next - index);
						answer += (next -index);
						direction = "right";
					}
				}else{
					if(direction.equals("left")){
						//�����̵�
						//System.out.println(index + (names.length - next));
						answer += index + (names.length - next);
					}else if(direction.equals("right")){
						//�����̵�
						//System.out.println(next - index);
						answer += (next -index);
					}
				}
				index = next;
				System.out.println("next : "+index+"/"+answer);	
			}
		}
		return answer;
	}

}
