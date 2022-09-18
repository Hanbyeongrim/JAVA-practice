//클래스화
class Accounting{
	public double valueOfSupply;
    public static double vatRate = 0.1;
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
//생성자 사용
class Accounting2{
	public double valueOfSupply;
	public Accounting2(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
    public static double vatRate = 0.1;
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
 
    public static void main(String[] args) {
    	//Accounting.valueOfSupply = 10000.0;
        //System.out.println("Value of supply : " + Accounting.valueOfSupply);
        //System.out.println("VAT : " + Accounting.getVAT());
        //System.out.println("Total : " + Accounting.getTotal());
    	//인스턴스화
    	Accounting a1 = new Accounting();
    	a1.valueOfSupply = 10000.0;
    	
    	Accounting a2 = new Accounting();
    	a2.valueOfSupply = 20000.0;
        
    	System.out.println("Value of supply : " + a1.valueOfSupply);
    	System.out.println("Value of supply : " + a2.valueOfSupply);
    	
    	System.out.println("VAT : " + a1.getVAT());
    	System.out.println("VAT : " + a2.getVAT());
    	
    	System.out.println("Total : " + a1.getTotal());
    	System.out.println("Total : " + a2.getTotal());
    	
    	Accounting2 a3 = new Accounting2(30000.0);
    	System.out.println("Value of supply : " + a3.valueOfSupply);
    }
 
}