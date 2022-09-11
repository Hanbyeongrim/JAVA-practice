
public class OutputMethod {
	public static String a() {
		return "a";
	}
	public static int One() {
		return 1;
		//return 이후 코드는 실행되지 않음
	}
	public static void main(String[] args) {
		System.out.println(a());
		
		System.out.println(One());

	}

}
// string int : 메소드의 리턴값 유형 // void 메소드에 리턴이 없음