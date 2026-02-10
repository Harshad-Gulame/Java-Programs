class LableExample
{
	public static void main(String[] args) 
	{
		
		System.out.println("Main method starts");

		evenOdd : //lable name
		{
			System.out.println("Even Odd block Start");
			if (5%2==0)
			 {
				System.out.println("Number is even");
				break evenOdd;
			}
			else
			{
				System.out.println("Number is odd");
			}
		System.out.println("Even Odd block End");
		}
	System.out.println("Main method end");	
	}
}