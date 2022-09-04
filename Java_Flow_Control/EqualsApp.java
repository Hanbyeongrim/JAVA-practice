
public class EqualsApp {

	public static void main(String[] args) {
		int p1 = 1;
		int p2 = 1;
		System.out.println(p1==p2); //프리미티브 타입 변수
		
		String o1 = new String("java");
		String o2 = new String("java");
		System.out.println(o1==o2); //non-프리미티브 타입변수
		System.out.println(o1.equals(o2));
		
		String o3 = "java2";
		String o4 = "java2";
		System.out.println(o3==o4); //string 예외, 그러나 입력값 받을 시 위치가 다른데 저장될 수 있음
		
		//프리미티브 -> 동등비교 사용 가능
		//non프리미티브, 객체-> equals 사용하기
	}

}
