package ch04;

public class UndirecteGraph {

	private int count; //��� ��
	private int[][] vertexMatrix;
	
	public UndirecteGraph(int count) { //�� ��Ʈ���� �����
		this.count = count;
		vertexMatrix = new int[count][count];
	}
	
	public void addEges(int from, int to, int weight) { //��Ʈ������ �������� �ֱ�
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	public int[][] getMatrix(){
		return vertexMatrix;
	}
}
