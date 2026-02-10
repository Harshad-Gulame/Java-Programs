// not complete program
// command prompt
// command -> setx varName value
import java.util.Scanner;
class ApplicationDriver
{
	static Scanner sc = new Scanner(System.in);
	static String myPin = System.getenv("myPin");
	static{
		boolean assumpt = false;
		for (int i = 3;i>=1 ;i-- )
		 {
			System.out.print("Enter your Pin : ");
			// String pin = sc.next();
			String pin = sc.next();

			if (pin.equal(myPin)) {
				assumpt = true;
				break;
			}
			else{
				System.out.println("Invalid Pin ");
				System.out.println("Attempt Left"+(i-1));
			}
		}

		if (!assumpt) 
			System.exit(0);  // Terminate the JVM (Kills The Thread)

	}
	public static void main(String[] args)
	 {
			System.out.println();
			System.out.println("PhonePy\n HOME PAGE ");
	}

}