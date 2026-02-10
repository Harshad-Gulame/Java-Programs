import java.util.Scanner;
class MethodExample1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------- Welcome to Number method ---------");
		System.out.println("Enter number :");

	


		System.out.println("1. Check Number is Even or Odd");
		System.out.println("2. check number is PrimeNumber or not");
		System.out.println("3. Check number is Negative or Positive");
		System.out.println();

		System.out.print("Enter Your Choice : ");

		byte ch =sc.nextByte();

		
		switch(ch)
		{
		case 1:
			{
				System.out.print("Enter Your number to check even or odd :");
				int num = sc.nextInt();
				even(num);
				break;
			}
		case 2:
			{
				System.out.print("Enter your number to check number is PrimeNumber or not : ");
				int num = sc.nextInt();
				primeNumber(num);
				break;
			}

		case 3:
			{
				System.out.print("Enter number to check number is negative or positive : ");
				int num = sc.nextInt();
				negativePositive(num);
				break;
			}
		default :
			{
				System.out.println("wrong Choice");
			}
		}

		
	}

	//Even odd Number method 

	public static void even(int num) 	
	{
		System.out.println("Evenn odd number checking");
		if (num%2==0)
		 {
			System.out.println("number is even");

		}
		else
		{
			System.out.println("number is odd");
		}
	}

	//prime number method

	public static void primeNumber(int num)
	{
		System.out.println("Palindrom number checking");
	}

	//negative positive number method

	public static void negativePositive(int num)
	{
		System.out.println("Check number is negative or positive");
		if (num>0)
		 {
			System.out.println("Number is positive");
		}
		else
		 {
			System.out.println("Number is negative");
		}
	}
}