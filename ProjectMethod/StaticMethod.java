class Print{
	public String delimit;
	public void a() { //인스턴스를 만들어 사용하는 메소드는 static 사용 불가
		System.out.println(this.delimit);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimit);
		System.out.println("b");
		System.out.println("b");
	}
}
public class StaticMethod {
	
	public static void main(String[] args) {
		//Print.a("-");
		//Print.b("-");
		Print t1 = new Print(); //instance
		t1.delimit = "-";
		t1.a();
		t1.b();
		
		//Print.a("*");
		//Print.b("*");
		Print t2 = new Print();
		t2.delimit = "*";
		t2.a();
		t2.b();

	}

}
