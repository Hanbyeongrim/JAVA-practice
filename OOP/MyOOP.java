
public class MyOOP {
	public static String delimit = "";
	public static void main(String[] args) {
		delimit = "-----";
		printA();
		printA();
		printB();
		printB();
		
		delimit = "****";
		printA();
		printA();
		printB();
		printB();


	}

	public static void printA() {
		System.out.println(delimit);
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void printB() {
		System.out.println(delimit);
		System.out.println("B");
		System.out.println("B");
	}

}
