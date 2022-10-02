
class Cal{
    public int sum(int v1, int v2){
    	return v1+v2;
    }
    //overloading - 동일한 이름의 메소드를 다양한 기능으로 사용
    public int sum(int v1, int v2, int v3){
    	return this.sum(v1, v2)+v3; //this 자기 자신 클래스
    }
}
class Cal3 extends Cal{
	public int minus(int v1, int v2){
    	return v1-v2;
    }
	//overriding - 부모클래스의 기능을 덮어 쓰기
	public int sum(int v1, int v2){
		System.out.println("Cal3!!");
    	return super.sum(v1, v2); // super 부모 클래스
    }
}
public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(2,1));
        System.out.println(c.sum(2,1,1));
        
        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2,1));
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
    }
}