import java.util.Scanner;
class SumOfNumber
{
	static int num,dup;
	static int sum;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		num = sc.nextInt();
		dup = num;
		SumOfDigit();
		System.out.println(dup+" : "+sum);
	}

	public static void SumOfDigit()
	 {
		int rem = num%10;
		sum += rem;
		num /=10;
		if (num == 0)  return;
		SumOfDigit();
	}
}