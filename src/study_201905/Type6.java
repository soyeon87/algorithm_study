/*
���� ����
JadenCase�� ��� �ܾ��� ù ���ڰ� �빮���̰�, �� ���� ���ĺ��� �ҹ����� ���ڿ��Դϴ�. 
���ڿ� s�� �־����� ��, s�� JadenCase�� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
s�� ���� 1 �̻��� ���ڿ��Դϴ�.
s�� ���ĺ��� ���鹮��(" ")�� �̷���� �ֽ��ϴ�.
ù ���ڰ� ������ �ƴҶ����� �̾����� ������ �ҹ��ڷ� ���ϴ�. ( ù��° ����� �� ���� )

����� ��
s	return
3people unFollowed me	3people Unfollowed Me
for the last week	For The Last Week
*/

package study_201905;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Type6 {

	public static void main(String[] args) {
		System.out.println(solution("3people  unFollowed me  "));
	}

	// ������ Ȯ��
	static Pattern pattern = Pattern.compile("(^[a-z]*$)");

	public static String solution(String s) {
		Matcher matcher;

		// �� �� " " ������ split�� limit�� ���� ������ŭ
		String[] arr = s.toLowerCase().split(" ", s.length());

		for(int i =0; i < arr.length; i++){
			matcher = pattern.matcher(arr[i]);
			if (arr[i].length() > 0) {
				if (matcher.matches()) {
					arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
				}
			}
		}
		return String.join(" ",arr);
	}

}
