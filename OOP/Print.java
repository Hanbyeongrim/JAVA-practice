
class Print{
	public String delimit = "";
	//생성자 - 클래스와 동일한 이름으로 생성, 초깃값 지정 가능
	public Print(String delimit) {
		this.delimit = delimit; //this 인스턴스 변수를 의미
	}
	
	public void A() {
		System.out.println(this.delimit);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimit);
		System.out.println("B");
		System.out.println("B");
	}
}