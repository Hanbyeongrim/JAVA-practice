package ch08;

public class Greedy {

	public static void main(String[] args) {
		int[] coins = {500, 100, 50, 10};
		int price = 8370;
		int count = 0;
		int tot = 0;
		
		for(int i = 0; i < coins.length; i++) {
			
			count = price / coins[i];
			price = price % coins[i];
			tot += count;
			
			System.out.println(coins[i] + "�� ������" + count + "�� �ʿ��մϴ�");
		}
		System.out.println("��" + tot + "�� �ʿ��մϴ�");

	}

}
