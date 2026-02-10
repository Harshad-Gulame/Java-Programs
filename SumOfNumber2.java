import java.util.Scanner;
class SumOfNumber2
{
	static int num;
	static int sum;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		num = sc.nextInt();
		
		int op= SumOfDigit(num,0);
		System.out.println(num+" : "+op);
	}

	public static int SumOfDigit(int num,int sum)
	 {
		 
		sum += (num%10);
		num /=10;
		if (num == 0)  return sum;
		return SumOfDigit(num,sum);
	}
}