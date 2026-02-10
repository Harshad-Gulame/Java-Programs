import java.util.Scanner;
class SumofNatural
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		int n = sc.nextInt();
		
		 int b = m1(n);
		System.out.println(b);
	}

	 public static int m1(int n)
		{
			int i = 1;
			int sum = 0;
			while(i<n)
			{
				sum = i+sum;
				i++;
			}

			return sum;

			
		}
}