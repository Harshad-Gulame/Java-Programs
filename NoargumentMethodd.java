import java.util.Scanner;
class NoargumentMethodd
{
	static int num; //default value 0
	public static void main(String[] args) 
	{
		//check number is even or odd
		Scanner sc = new Scanner(System.in);	//get data from user
		System.out.print("Enter Number :");
		num = sc.nextInt();						// num>0

		if (checkNumber())  //check valid number is or not
		 {
		 	if (num%2==0)
		 	 {
		 		
		 	
			System.out.println(num+" is even");
			}
			else
			{
			System.out.println(num+" Number is odd");
			}
		}
		else
		{
			System.out.println("Invalid number "+num);
		}

	}

	public static boolean checkNumber()			 //check number is valid or not by checkNumber() method
	 {
		if (num<=0)
		 {
			return false;
		}
		else 
		{
			return true;
		}
	}
}