import java.util.Scanner;
class ReverseRecursion
{
	static int num;
	static int rev;

	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter Number  :");
			num = sc.nextInt();
			int dup=num;
			ReverseNumber();
			System.out.println(dup+" : "+rev);
	}
	public static void ReverseNumber()
	 {
		    int rem = num % 10;
		    rev = rev*10+rem;
		    num /= 10;
		    if (num == 0)  return;
		     ReverseNumber();
	}
}