import java.util.Scanner;
class PrimeNumberRecurrsion
{
	 
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");

		if (IsPrime(sc.nextInt(),2))
		 {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not Prime");
		}
	}

	public static boolean IsPrime(int num,int start)
	{
		if (num<2) return false;  			// 4<2
		if (start>=(num/2)+1) return true;  //  2>= 2+1   2 > = 3
		if (num%start==0)  return false;    //  4%2 = 0 

		return IsPrime(num,++start);        //
	}
}