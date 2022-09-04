
public class AuthApp3 {

	public static void main(String[] args) {
		//String[] users = {"egoing", "jin", "youbin"};
		String[][] users = {
				{"egoing", "1111"},
				{"jin", "2222"},
				{"youbin", "3333"}
		};
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i = 0; i < users.length; i++) {
			String[] current = users[i];
			if(		current[0].equals(inputId) &&
					current[1].equals(inputPass)) {
				isLogined = true;
				break;
			}
		}
		if(isLogined) {
			System.out.println("Hi");
		} else {
			System.out.println("who are you");
		}

	}

}
