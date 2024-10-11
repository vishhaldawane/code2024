
public class LoginTest {
	public static void main(String[] args) {
		
		System.out.println("begin main");
		
		User user = new User();
		
		
		try {
			user.login("jack112312313","jack567");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Problem "+e);
		}
	
		System.out.println("End of main");
	}
}

class User
{
	void login(String un, String up) throws Exception
	{
		System.out.println("Login started...");
		
		if(un.length() > 8) {
			throw new Exception("username cannot exceed 8 letters");	
		}
		else if(up.length() > 8) {
			throw new Exception("password cannot exceed 8 letters");	
		}
		else if( un.equals(up)) {
			throw new Exception("username and password cannot be same");	

		}
		
		System.out.println("Login finished...");

	}
}


