package ch04;

public class UndirecteGraph {

	private int count; //노드 수
	private int[][] vertexMatrix;
	
	public UndirecteGraph(int count) { //빈 매트릭스 만들기
		this.count = count;
		vertexMatrix = new int[count][count];
	}
	
	public void addEges(int from, int to, int weight) { //매트릭스에 연결정보 넣기
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	public int[][] getMatrix(){
		return vertexMatrix;
	}
}
