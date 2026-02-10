import java.util.Scanner;
class Demo3
{
	public static void main(String[] args) {
		
			System.out.println("1.For Login");
			System.out.println("2.Registration");
			System.out.println("3.Logut");
			System.out.println("Enter your Choice :");
			int choice = new Scanner(System.in).nextInt();

			switch(choice){
			case 1 -> login();
			case 2 -> registration();
			case 3 -> logout();
			}
		
	}

	public static void login(){
		String username1 = "admin";
		String password1 = "123";
		System.out.println("Welcome to Login Page ");
		System.out.println("Enter Username");
		String username = new Scanner(System.in).nextLine();
		System.out.println("Enter Password");
		String password = new Scanner(System.in).nextLine();

		if (username1.equals(username) && password1.equals(password)) {
			System.out.println("Login sucssfully");
		}
		else{
			System.out.println("Envalid Crediantional");
		}


	}

	public static void registration(){

	}

	public static void logout()
	{

	}
}