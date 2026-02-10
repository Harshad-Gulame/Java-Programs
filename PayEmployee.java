import java.util.Scanner;
class PayEmployee
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee target : ");

		int target = sc.nextInt();

		if(target > 90)
		{
           System.out.println("Incres the Pay of Employee by 3%");
		}
		else 
		{
			System.out.println("Incres the pay of Employee by 1%");
		}
	}
}