class Print1{
	public static String delimit = "";
	public static void A() {
		System.out.println(delimit);
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void B() {
		System.out.println(delimit);
		System.out.println("B");
		System.out.println("B");
	}
}

public class MyOOP2 {
	public static void main(String[] args) {
		Print1.delimit = "-----";
		Print1.A();
		Print1.A();
		Print1.B();
		Print1.B();
		
		Print1.delimit = "****";
		Print1.A();
		Print1.A();
		Print1.B();
		Print1.B();

	}

}
