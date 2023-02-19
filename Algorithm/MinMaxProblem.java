package ch01;

public class MinMaxProblem {

	public static void main(String[] args) {
		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		
		int min = numbers[0];
		int max = numbers[0];
		
		int min_i = 0;
		int max_i = 0;
		
		for(int i = 1; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
				min_i = i;
			}
			if(max < numbers[i]) {
				max = numbers[i];
				max_i = i;
			}
		}
		System.out.println("가장 큰 값은 "+max + "이고 위치는 " + max_i + " 가장 작은 값은 "+min + "이고 위치는 "+ min_i);

	}

}
