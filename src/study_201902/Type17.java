/*
문제 설명
조이스틱으로 알파벳 이름을 완성하세요. 맨 처음엔 A로만 이루어져 있습니다.
ex) 완성해야 하는 이름이 세 글자면 AAA, 네 글자면 AAAA
조이스틱을 각 방향으로 움직이면 아래와 같습니다.
▲ - 다음 알파벳
▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
▶ - 커서를 오른쪽으로 이동
예를 들어 아래의 방법으로 JAZ를 만들 수 있습니다.
- 첫 번째 위치에서 조이스틱을 위로 9번 조작하여 J를 완성합니다.
- 조이스틱을 왼쪽으로 1번 조작하여 커서를 마지막 문자 위치로 이동시킵니다.
- 마지막 위치에서 조이스틱을 아래로 1번 조작하여 Z를 완성합니다.
따라서 11번 이동시켜 "JAZ"를 만들 수 있고, 이때가 최소 이동입니다.
만들고자 하는 이름 name이 매개변수로 주어질 때, 이름에 대해 조이스틱 조작 횟수의 최솟값을 return 하도록 solution 함수를 만드세요.

제한 사항
name은 알파벳 대문자로만 이루어져 있습니다.
name의 길이는 1 이상 20 이하입니다.

입출력 예
name	return
JEROEN	56
JAN	23
*/

package study_201902;

public class Type17 {

	public static void main(String[] args) {
		System.out.println(solution("AAA"));
	}

	public static int solution(String name) {
		/*int answer = 0;
		
		long count = name.chars().filter(a -> a != 'A').count();
		//System.out.println(count);
		int check = 0;
		int index = 0;
		char[] names = name.toCharArray();
		String direction = "";
		while(true){
			//위아래 찾기
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
			
				//다음 찾기
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
						//좌측이동
						//System.out.println(index + (names.length - next));
						answer += index + (names.length - next);
						direction = "left";
					}else{
						//우측이동
						//System.out.println(next - index);
						answer += (next -index);
						direction = "right";
					}
				}else{
					if(direction.equals("left")){
						//좌측이동
						//System.out.println(index + (names.length - next));
						answer += index + (names.length - next);
					}else if(direction.equals("right")){
						//우측이동
						//System.out.println(next - index);
						answer += (next -index);
					}
				}
				index = next;
				System.out.println("next : "+index+"/"+answer);	
			}
		}
		
		return answer;
		*/

		int count = (int) name.chars().filter(a -> a != 'A').count();
		if(count == 0){
			return 0;
		}
		int left_cnt = count, right_cnt = count;
		int check = 0;
		int left = 0, right = 0;
		char[] names = name.toCharArray();
		
		for(int i = 0; i < names.length; i++){
			if(names[i] != 'A'){
				check = 'Z' - names[i];
				if(check >=13){
					right += names[i] - 'A';
				}else{
					right += check+1;
				}
				//System.out.println("right : "+right );
				right_cnt--;
				if(right_cnt <= 0){
					break;
				}
			}
			right++;
			//System.out.println("right : " + right);
		}
		
		int index = 0;
		for(int i = 0; i < names.length; i++){
			if(i != 0){
				index = names.length - i; 
			}
			if(names[index] != 'A'){
				check = 'Z' - names[index];
				if(check >=13){
					left += names[index] - 'A';
				}else{
					left += check+1;
				}
				//System.out.println("left : "+left );
				left_cnt--;
				if(left_cnt <= 0){
					break;
				}
			}
			left++;
			//System.out.println("left : " + left);
		}
		
		if(left > right){
			return right;
		}else{
			return left;
		}
	}
}
