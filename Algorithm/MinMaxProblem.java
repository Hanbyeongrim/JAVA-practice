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
		System.out.println("���� ū ���� "+max + "�̰� ��ġ�� " + max_i + " ���� ���� ���� "+min + "�̰� ��ġ�� "+ min_i);

	}

}
