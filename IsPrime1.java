import java.util.Scanner;
class IsPrime1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		if (IsPrime(num))
		 {
			System.out.println(num+"Is prime");
		}
		else
		{
			System.out.println(num +"Is not prime");
		}
	}

	public static boolean IsPrime(int num)
	 {
		if (num<2) return false;
		 for (int i=2;i<=num/2; i++ ) 
		  if (num%i==0) return false;  
		return true;
	}
}