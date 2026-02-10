import java.util.Scanner;
class FootToMitter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for feet:");

		double feet = sc.nextDouble() , meter = feet*0.305 ;
         
		 System.out.println(feet + " feet is "+ meter + "meter");
		 
	}
}