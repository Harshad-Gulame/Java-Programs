import java.util.Scanner;
class PalindromNumber
{
	static int num ;
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");

		num = sc.nextInt();

		if (isPalindrom())
		 {
				System.out.println("Numbr is PalindromNumber");
		 }	

		else
		{
			System.out.println(num+"Number is not PalindromNumber");
		}
	}

	public static boolean isPalindrom()
	 {
	 	int dup = num;
	 	int rev = 0;
		
		while(dup!=0)
		{
			int rem = dup % 10;
			rev = rev * 10 + rem;
			dup/=10;
		}

		if (num==rev)  
			return true;
		else
			return false;
	}
}