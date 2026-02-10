import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
  {
		
			
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");

	int num = sc.nextInt();   
 	int dup = num, rev=0; 

  	int rem = num%10;       
 	rev = rev*10+rem; 	
 	num/=10;			

 	rem = num%10;		
 	rev = rev*10+rem;
 	num/=10;

 	System.out.println(rev);

 }

}