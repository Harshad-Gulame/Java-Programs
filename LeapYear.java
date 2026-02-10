import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Year to check year is leap or not :");

		int year = sc.nextInt();
		if (year%4==0 && year%100!= 0 || year%400==0)
		 {
			System.out.println("It's Leap Year ");
		}
		else
		{
			System.out.println("It's Not a leap Year ");
		}
	}
}