package ch22;

public class TwoDimArrayTest {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{1,2,3,4}}; // new int[3][4] 초기화, 초기값 0
		int i, j;
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]+",");
			}
			System.out.println("\t"+arr[i].length);
		}

	}

}
