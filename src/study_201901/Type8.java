package study_201901;

import java.util.ArrayList;

public class Type8 {

	public static void main(String[] args) {
		System.out.println(solution(10));
	}

	public static int solution(int n) {	
		ArrayList<Integer> list = new ArrayList<>();
		loop: for(int i = 2; i<= n ; i++){
			for(int j = 0; j < list.size(); j++){
				if(i % list.get(j) == 0){
					continue loop;
				} 
			}
			list.add(i);
		}		
		return list.size();
	}
}
