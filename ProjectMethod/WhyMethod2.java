
public class WhyMethod2 {
	// text, delimit -> 매개변수, parameter
	public static void printTwoTimes(String text, String delimit) {
		System.out.println(delimit);
		System.out.println(text);
		System.out.println(text);
	}
	public static void main(String[] args) {
		
		//code
		// a, - -> 인자, argument
		printTwoTimes("a", "-");
		
		//code
		printTwoTimes("a", "*");
		
		//code
		printTwoTimes("b", "!!");

	}

}
