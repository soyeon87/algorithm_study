/*
���� ����
1���� n���� ��ȣ�� �پ��ִ� n���� ����� ���� �����ձ⸦ �ϰ� �ֽ��ϴ�. ���� �����ձ�� ������ ���� ��Ģ���� ����˴ϴ�.
1������ ��ȣ ������� �� ����� ���ʴ�� �ܾ ���մϴ�.
������ ����� �ܾ ���� �������� �ٽ� 1������ �����մϴ�.
�ջ���� ���� �ܾ��� ������ ���ڷ� �����ϴ� �ܾ ���ؾ� �մϴ�.
������ �����ߴ� �ܾ�� ����� �� �����ϴ�.
�� ������ �ܾ�� �������� �ʽ��ϴ�.
������ 3���� �����ձ⸦ �ϴ� ��Ȳ�� ��Ÿ���ϴ�.
tank �� kick �� know �� wheel �� land �� dream �� mother �� robot �� tank
�� �����ձ�� ������ ���� ����˴ϴ�.
1�� ����� �ڽ��� ù ��° ���ʿ� tank�� ���մϴ�.
2�� ����� �ڽ��� ù ��° ���ʿ� kick�� ���մϴ�.
3�� ����� �ڽ��� ù ��° ���ʿ� know�� ���մϴ�.
1�� ����� �ڽ��� �� ��° ���ʿ� wheel�� ���մϴ�.
(��� ����)
�����ձ⸦ ��� ������ ������ ����, 3�� ����� �ڽ��� �� ��° ���ʿ� ���� tank ��� �ܾ�� ������ �����ߴ� �ܾ��̹Ƿ� Ż���ϰ� �˴ϴ�.
����� �� n�� ������� ������� ���� �ܾ� words �� �Ű������� �־��� ��, 
���� ���� Ż���ϴ� ����� ��ȣ�� �� ����� �ڽ��� �� ��° ���ʿ� Ż���ϴ����� ���ؼ� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���� ����
�����ձ⿡ �����ϴ� ����� �� n�� 2 �̻� 10 ������ �ڿ����Դϴ�.
words�� �����ձ⿡ ����� �ܾ���� ������� ����ִ� �迭�̸�, ���̴� n �̻� 100 �����Դϴ�.
�ܾ��� ���̴� 2 �̻� 50 �����Դϴ�.
��� �ܾ�� ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
�����ձ⿡ ���Ǵ� �ܾ��� ��(�ǹ�)�� �Ű� ���� �����ŵ� �˴ϴ�.
������ [ ��ȣ, ���� ] ���·� return ���ּ���.
���� �־��� �ܾ��� Ż���ڰ� ������ �ʴ´ٸ�, [0, 0]�� return ���ּ���.

����� ��
n	words	result
3	[tank, kick, know, wheel, land, dream, mother, robot, tank]	[3,3]
5	[hello, observe, effect, take, either, recognize, encourage, ensure, establish, hang, gather, refer, reference, estimate, executive]	[0,0]
2	[hello, one, even, never, now, world, draw]	[1,3]

����� �� ����
����� �� #1
3���� ����� �����ձ⿡ �����ϰ� �ֽ��ϴ�.
1�� ��� : tank, wheel, mother
2�� ��� : kick, land, robot
3�� ��� : know, dream, tank
�� ���� ������ ���� �ϰ� �Ǹ�, 3�� ����� �ڽ��� �� ��° ���ʿ� ���� tank��� �ܾ 1�� ����� �ڽ��� ù ��° ���ʿ� ���� tank�� �����Ƿ� 
3�� ����� �ڽ��� �� ��° ���ʷ� ���� �� �� ó�� Ż���ڰ� ������ �˴ϴ�.
����� �� #2
5���� ����� �����ձ⿡ �����ϰ� �ֽ��ϴ�.
1�� ��� : hello, recognize, gather
2�� ��� : observe, encourage, refer
3�� ��� : effect, ensure, reference
4�� ��� : take, establish, estimate
5�� ��� : either, hang, executive
�� ���� ������ ���� �ϰ� �Ǹ�, �� ���� �־��� �ܾ�θ����δ� Ż���ڰ� �߻����� �ʽ��ϴ�. ���� [0, 0]�� return�ϸ� �˴ϴ�.
����� �� #3
2���� ����� �����ձ⿡ �����ϰ� �ֽ��ϴ�.
1�� ��� : hello, even, now, draw
2�� ��� : one, never, world
�� ���� ������ ���� �ϰ� �Ǹ�, 1�� ����� �ڽ��� �� ��° ���ʿ� 'r'�� �����ϴ� �ܾ� ���, n���� �����ϴ� now�� ���߱� ������ �̶� ó�� Ż���ڰ� ������ �˴ϴ�.
*/

package study_201906;

import java.util.HashSet;
import java.util.Set;

public class Type3 {

	public static void main(String[] args) {
		int[] result = solution(3, new String[]{"tank", "kick", "know", "wheel", 
				"land", "dream", "mother", "robot", "tank"});
		System.out.println(result[0]+"/"+result[1]);
	}

	public static int[] solution(int n, String[] words) {

        int len = 1;
        String last = words[0].substring(words[0].length()-1,words[0].length());
        int turn = 1, status = 1;
        Set<String> set = new HashSet<String>();
        set.add(words[0]);
        
        String get = "";
        int size = set.size();
        while(len < words.length){
        	get = words[len].substring(0,1);
        	if (last.equals(get)){
        		set.add(words[len]);
        		if(size < set.size()){
        			//�Ѿ
        			last = words[len].substring(words[len].length()-1,words[len].length());
        			size = set.size();
        		}else{
        			//���� - �ߺ�
        			return new int[]{turn+1, status}; 
        		}
        	}else{
        		//���� - ù���� ����
        		return new int[]{turn+1, status};
        	}
        	
        	len++;
        	if(turn == n-1){
        		turn = 0;
        		status++;
        	}else{
        		turn++;
        	}
        }
        
        return new int[]{0,0};
    }
}
