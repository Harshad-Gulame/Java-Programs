import java.util.Scanner;
class ThreeDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check 3 didt or not");

		int num = sc.nextInt();

		if (num>=100 && num<=999)
		 {
			System.out.println("number is Three Digit number ");
		}
		else {
			System.out.println("Number is not a three digit number ");
		}
	}
}