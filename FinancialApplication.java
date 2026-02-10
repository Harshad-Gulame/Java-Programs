import java.util.Scanner;
class FinancialApplication
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Balance -");
		float balance = sc.nextFloat();
 
 		System.out.print("Enter Annual Interesate Rate - ");
		float annualIntrestRate = sc.nextFloat();

		double interest = balance* (annualIntrestRate / 1200);

		System.out.println("Enter balance -" + balance + "and interest rate" + interest );
		System.out.println("The interest is "+interest);


	}
}