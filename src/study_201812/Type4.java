//문제 설명
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

//제한사항
//s는 길이가 1 이상, 100이하인 스트링입니다.

//입출력 예
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
	      
	      //좋은 코드
	      return s.substring((s.length()-1) / 2, s.length()/2 + 1);
	      
	      //return answer;
	}
}
