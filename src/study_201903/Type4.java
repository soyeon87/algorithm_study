/*
���� ����
��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.
������ : 119
���ؿ� : 97 674 223
������ : 11 9552 4421
��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, 
� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.

����� ����
phone_book	return
[119, 97674223, 1195524421]	false
[123,456,789]	true
[12,123,1235,567,88]	false

����� �� ����
����� �� #1
�տ��� ������ ���� �����ϴ�.
����� �� #2
�� ��ȣ�� �ٸ� ��ȣ�� ���λ��� ��찡 �����Ƿ�, ���� true�Դϴ�.
����� �� #3
ù ��° ��ȭ��ȣ, ��12���� �� ��° ��ȭ��ȣ ��123���� ���λ��Դϴ�. ���� ���� false�Դϴ�.
*/

package study_201903;

import java.util.Arrays;

public class Type4 {

	public static void main(String[] args) {
		System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
		//"12232332", "12", "222222"
		//"119", "97674223", "1195524421"
		//"113", "12340", "123440", "12345", "98346"
	}
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
      
        Arrays.sort(phone_book);
        int min_length = 0;
        for(int i = 0; i < phone_book.length-1; i++){
        	for(int j = i+1; j < phone_book.length; j++){
        		if(phone_book[i].charAt(0) == phone_book[j].charAt(0)){
        			min_length = Math.min(phone_book[i].length(), phone_book[j].length());
        			if(phone_book[i].substring(0, min_length).equals(phone_book[j].substring(0,min_length))){
        				answer = false;
        			}        			
        		}
        	}
        }
        return answer;
        
        /*
        for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
            }
        }
        return true;
        */
    }

}
