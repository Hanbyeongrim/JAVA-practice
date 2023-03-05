package ch04;

import java.util.Stack;

public class DfsSearch {

	int count;
	boolean[] visited;
	Stack<Integer> stack;	//BFS�� ArrayList<Integer> queue�� ����
	int[][] matrix;
	
	public DfsSearch(int count) {
		this.count = count;
		visited = new boolean[count];
		stack = new Stack<Integer>();
	}
	
	public void DfsTraversal() {
		stack.push(0); //Ž�� ���� ��ȣ
		visited[0] = true;
		
		while(stack.isEmpty() == false) {
			int node = stack.pop();
			System.out.print(node+" ");
			for(int j = 0; j < count; j++) {
				if(matrix[node][j] != 0 && visited[j] == false) {
					stack.push(j);
					visited[j] = true; //Ž�� �޴ٴ� üũó��
				}
			}
		}
	}
	public static void main(String[] args) {
		int count = 8;
		UndirecteGraph graph = new UndirecteGraph(count);
		graph.addEges(0, 1, 1); //�׷��� �׸���
		graph.addEges(0, 2, 1);
		graph.addEges(1, 3, 1);
		graph.addEges(1, 4, 1);
		graph.addEges(2, 5, 1);
		graph.addEges(2, 6, 1);
		graph.addEges(3, 7, 1);
		graph.addEges(4, 5, 1);
		
		DfsSearch dfs = new DfsSearch(count);
		dfs.matrix = graph.getMatrix();
		dfs.DfsTraversal();

	}

}
