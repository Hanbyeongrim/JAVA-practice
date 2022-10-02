
class Cal_1{
    int v1, v2;
    Cal_1(int v1, int v2){
    	System.out.println("Cal_1!!");
    	this.v1 = v1; this.v2 = v2;
    }
    public int sum() {
    	return this.v1+v2;
    }
}
class Cal3_1 extends Cal_1{

	Cal3_1(int v1, int v2) {
		super(v1, v2); // 부모클래스의 생성자를 실행해야 함
		System.out.println("Cal3_1!!");
	}
	public int minus() {
		return this.v1-v2;
	}
}
public class InheritanceApp2 {
    public static void main(String[] args) {
        Cal_1 c = new Cal_1(2, 1);
        Cal3_1 c3 = new Cal3_1(2, 1);
        
        System.out.println(c3.sum());
        System.out.println(c3.minus());
    }
}