import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod3 {
	// text, delimit -> �Ű�����, parameter
	public static void printTwoTimes(String text, String delimit) {
		System.out.println(delimit);
		System.out.println(text);
		System.out.println(text);
	}
	public static String twoTimes(String text, String delimit) {
		String out = "";
		out = out + delimit + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
		// return�� �����Ƿ� �ٸ� �޼ҵ忡�� ��� ����
	}
	public static void main(String[] args) throws IOException {
		
		//code
		// a, - -> ����, argument
		printTwoTimes("a", "-");
		System.out.println(twoTimes("a", "-"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a","-"));
		fw.close();
		//code
		printTwoTimes("a", "*");
		
		//code
		printTwoTimes("b", "!!");

	}

}
