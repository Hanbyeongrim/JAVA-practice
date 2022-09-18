class foo{
	public static String classVar = "I calss var"; //클래스 변수
	public String instanceVar = "I instance var"; //인스턴스 변수
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); error
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(foo.classVar);
//		System.out.println(foo.instanceVar); error
		foo.classMethod();
//		foo.instanceMethod(); error
		
		foo f1 = new foo();
		foo f2 = new foo();
		
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "changed by f1"; //클래스변수라 인스턴스에서도 바뀜
		System.out.println(foo.classVar);
		System.out.println(f2.classVar);
		
		f1.instanceVar = "changed by f1"; //인스턴스변수라 해당 인스턴스에서만 바뀜
		System.out.println(f1.instanceVar);
		System.out.println(f2.instanceVar);

	}

}
