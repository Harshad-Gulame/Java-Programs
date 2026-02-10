import java.util.Scanner;
class IsPrime
{
	 public static void main(String[] args) 
	{
	
		System.out.print("Enter Number :");
		int num = new Scanner(System.in).nextInt();
		IsPrime(num);
	}

	public static void IsPrime(int num)
	 {
	 	int cnt = 0;
		for (int i=1;i<=num ;i++ ) 
		
			if (num%i==0) cnt++;
			 	if (cnt==2) 
			 	{
			 	
				System.out.println("Number is Prime : "+num); 
				}
				else
				{
					System.out.println("Number is  Not Prime : "+num);
				}
			
		}
		 
	}
