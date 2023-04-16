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
			
			System.out.println(coins[i] + "의 동전이" + count + "개 필요합니다");
		}
		System.out.println("총" + tot + "개 필요합니다");

	}

}
