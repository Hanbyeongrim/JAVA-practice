import java.io.FileWriter;
import java.io.IOException;

public class OtherOOP {

	public static void main(String[] args) throws IOException {
		//클래스를 직접 사용
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		//클래스를 복제하여 사용
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("hello");
		f1.write(" Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("hello");
		f2.write(" Java2");
		f2.close();
		
		//class : System Math FileWriter
		//instance : f1 f2

	}

}
