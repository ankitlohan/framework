package automation;

public class Exefile {

	public static void main(String[] args) throws Exception {
		
		Exelib lib = new Exelib();
		
		lib.open("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		lib.User("Admin");

		lib.Password("admin123");
		
		lib.close();
		
		
		
		
	}

}
