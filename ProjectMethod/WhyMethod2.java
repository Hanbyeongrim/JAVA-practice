
public class WhyMethod2 {
	// text, delimit -> �Ű�����, parameter
	public static void printTwoTimes(String text, String delimit) {
		System.out.println(delimit);
		System.out.println(text);
		System.out.println(text);
	}
	public static void main(String[] args) {
		
		//code
		// a, - -> ����, argument
		printTwoTimes("a", "-");
		
		//code
		printTwoTimes("a", "*");
		
		//code
		printTwoTimes("b", "!!");

	}

}
