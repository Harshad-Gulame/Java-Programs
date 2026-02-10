import java.util.Scanner;
class SumOfNumber1
{
	static int num,dup;
	static int sum;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		num = sc.nextInt();
		dup = num;
		SumOfDigit(num);
		System.out.println(dup+" : "+sum);
	}

	public static void SumOfDigit(int num)
	 {
		 
		sum += (num%10);
		num /=10;
		if (num == 0)  return;
		SumOfDigit(num);
	}
}