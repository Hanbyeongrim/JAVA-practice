
public class EqualsApp {

	public static void main(String[] args) {
		int p1 = 1;
		int p2 = 1;
		System.out.println(p1==p2); //������Ƽ�� Ÿ�� ����
		
		String o1 = new String("java");
		String o2 = new String("java");
		System.out.println(o1==o2); //non-������Ƽ�� Ÿ�Ժ���
		System.out.println(o1.equals(o2));
		
		String o3 = "java2";
		String o4 = "java2";
		System.out.println(o3==o4); //string ����, �׷��� �Է°� ���� �� ��ġ�� �ٸ��� ����� �� ����
		
		//������Ƽ�� -> ����� ��� ����
		//non������Ƽ��, ��ü-> equals ����ϱ�
	}

}
