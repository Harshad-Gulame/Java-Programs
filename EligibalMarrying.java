import java.util.Scanner;
class EligibalMarrying
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Boy Age : ");

		int age = sc.nextInt();

		 System.out.println("Enter Property of boy");

		long property = sc.nextLong();

		if(age > 21 && property > 10000000 )
		{
			System.out.println("Boy is elighibal for marrying");
		}
		else {
			System.out.println("Boy Can Not elighibal for marrying");
		}
	}
}