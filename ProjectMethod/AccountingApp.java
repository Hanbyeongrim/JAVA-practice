
public class AccountingApp {

	public static void main(String[] args) {
		double valueOfSupply = 10000.0;
		double vatRate = 0.1;
		
		double vat = getVat(valueOfSupply, vatRate);
		double total = getTotal(valueOfSupply, vat);
		
		System.out.println("value of supply : " + valueOfSupply);
		System.out.println("vat : " + vat);
		System.out.println("total : " + total);

	}

	public static double getTotal(double valueOfSupply, double vat) {
		return valueOfSupply + vat;
	}

	public static double getVat(double valueOfSupply, double vatRate) {
		return valueOfSupply * vatRate;
	}

}
