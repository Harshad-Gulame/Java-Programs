import java.util.Scanner;
class FinancialCompound
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Saving Rs : ");
		int saveRs = sc.nextInt();
		System.out.println("saving rs"+saveRs);

		final double INTEREST = 0.00417;

		double firstMonth = saveRs * (1+INTEREST);
		System.out.println("First Month Value :" + firstMonth);

	    double secoundMonth = (saveRs + firstMonth) * (1 + INTEREST);
	    System.out.println("Secound Month Value :" + secoundMonth);

	    double thirdMonth = (saveRs + secoundMonth) * (1 + INTEREST);
	    System.out.println("Secound Month Value :" + thirdMonth);


	}
}