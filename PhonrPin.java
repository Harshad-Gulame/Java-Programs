import java.util.Scanner;
import static java.lang.System.out;
class PhonrPin
{
	public static void main(String [] args) throws InterruptedException
	 {
		int storePin = 1234;
		int duration = 5000;

		outerLoop : // label ( indentifier -> variable)
		for (; ; ) 
		{
			int attempt = 3;

			do
			{
					System.out.println();
					System.out.println("Enter Your Pin : ");
					int userPin = new java.util.Scanner(System.in).nextInt();

					if (storePin==userPin)
					 {
						System.out.println("PHONE UNLOCKED");
						break outerLoop;
					}
					else
					{
						System.out.println("Wrong Pin ");
						System.out.println("Attempt Left "+(attempt-1));

					}
					attempt--;
				}
					while (attempt!=0);
					  
					  System.out.println();
					  System.out.println("Phone is Disabled "+(duration/1000)+"secound");
					  Thread.sleep(duration);
					  duration*=2;
			}
		
	}

}