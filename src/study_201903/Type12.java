/*
���� ����
��� ���忡���� �Ϸ翡 �а��縦 1�澿 ����մϴ�. ���� �а��縦 ���޹޴� ������ �������� ������ k�� ���Ŀ��� �а��縦 ���޹��� �� �ֱ� ������ �ؿ� ���忡�� �а��縦 �����ؾ� �մϴ�.
�ؿ� ���忡���� ���� �а��縦 ������ �� �ִ� ��¥�� ������ �˷��־���, ��� ���忡���� ��ۺ� ���̱� ���� �ּ����� Ƚ���� �а��縦 ���޹ް� �ͽ��ϴ�.
���� ���忡 �����ִ� �а��� ���� stock, �а��� ���� ����(dates)�� �ش� ������ ���� ������ �а��� ����(supplies), 
���� �������κ��� ���޹��� �� �ִ� ���� k�� �־��� ��, �а��簡 �������� �ʰ� ������ ��ϱ� ���ؼ� �ּ��� �� �� �ؿ� �������κ��� �а��縦 ���޹޾ƾ� �ϴ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
dates[i]���� i��° ���� �������� ���������, supplies[i]���� dates[i] ��¥�� ���� ������ �а��� ������ ��� �ֽ��ϴ�.

���ѻ���
stock�� �ִ� �а���� ����(0�� ����)���� ���˴ϴ�.
stock�� k�� 2 �̻� 100,000 �����Դϴ�.
dates�� �� ���Ҵ� 1 �̻� k �����Դϴ�.
supplies�� �� ���Ҵ� 1 �̻� 1,000 �����Դϴ�.
dates�� supplies�� ���̴� 1 �̻� 20,000 �����Դϴ�.
k�� °���� �а��簡 ����� ���޵Ǳ� ������ k-1�Ͽ� ����� ���������� Ȯ���ϸ� �˴ϴ�.
dates�� ����ִ� ��¥�� �������� ���ĵǾ� �ֽ��ϴ�.
dates�� ����ִ� ��¥�� ���޵Ǵ� �а���� �۾� ���� �� ������ ���޵Ǵ� ���� �������� �մϴ�. 
���� ��� 9��°�� �а��簡 �ٴڳ�����, 10��°�� ���޹����� 10��°���� ������ ��� �� �ֽ��ϴ�.
�а��簡 �ٴڳ��� ���� �־����� �ʽ��ϴ�.

����� ��
stock	dates	supplies	k	result
4	[4,10,15]	[20,5,10]	30	2

����� �� ����
���� �а��簡 4�� ���� �ֱ� ������ ���ð� 1�� ��~3�� �ı��� ����ϰ� ���� ��� �а��縦 �� ����մϴ�. ���� 4�� �Ŀ��� �ݵ�� �а��縦 ���޹޾ƾ� �մϴ�.
4��° ���޹ް� ���� 15�� ���� ��ħ���� 9���� �а��簡 �����ְ� �ǰ�, �̶� 10���� �� ���޹����� 19���� �����ְ� �˴ϴ�. 
15�� ���ĺ��� 29�� ���ı��� �ʿ��� �а���� 15���̹Ƿ� �� �̻��� ������ �ʿ� �����ϴ�.
���� �� 2ȸ�� �а��縦 ���޹����� �˴ϴ�.
*/

package study_201903;

import java.util.Arrays;

public class Type12 {

	public static void main(String[] args) {
		System.out.println("��� : "+solution(4, new int[]{1,2,3,4}, new int[]{10,40,30,20}, 100));
		//4, new int[]{1,2,3,4}, new int[]{10,40,30,20}, 100
		//4, new int[]{4,10,15}, new int[]{20,5,10}, 30  
	}

	public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        
        int sum = 0;
        int[] temp = new int[supplies.length];
        for(int i = 0 ; i < supplies.length; i++){
        	sum += supplies[i];
        	temp[i] = supplies[i];
        }
        int sumcheck = k - stock;
        Arrays.sort(temp);
        
        int check = 0;
        int date = 1;
        
        int preget = 0;
        int aftget = 0;
        
        for(int i = 1; i < k; k++){
        	stock--;
        	preget = dates[check];
        	if(check == dates.length -1){
        		aftget = k;
        	}else{
            	aftget = dates[check+1];
        	}
        	if(date == preget){
        		//System.out.println(date+" "+stock);
        		if(aftget-1-date > stock){
        			stock += supplies[check];
        			answer++;
        		}else{
        			if(sumcheck <= sum && sumcheck >= sum - temp[0]){
        				stock += supplies[check];
        				answer++;
        			}        			
        		}
        		//System.out.println("  "+check);
        		if(check == dates.length -1){
        			break;
        		}else{
        			check++;
        		}
    		}
        	date++;
        }
        return answer;
    }

}
