/*
문제 설명
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상인 문자열입니다.
s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )

입출력 예
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

	// 영문자 확인
	static Pattern pattern = Pattern.compile("(^[a-z]*$)");

	public static String solution(String s) {
		Matcher matcher;

		// 맨 뒤 " " 을위해 split의 limit은 글자 갯수만큼
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
