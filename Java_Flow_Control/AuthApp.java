
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String inputpass = args[1];
		
		//if(id == inputId) {
		if(inputId.equals(id) && inputpass.equals(pass)) {
			System.out.println("Hi");
		} else {
			System.out.println("who are you");
		}
	}

}
