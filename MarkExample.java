import java.util.Scanner;
class MarkExample
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks : ");

		int mark = sc.nextInt();
         int totalMarks = 500;

		float percentage = (mark*100)/totalMarks;

		System.out.println(percentage);

		if (mark > 500 || mark < 0)
		{
			System.out.println("Entered Marks is invalid"+mark);
			return;
		}
		else if (percentage >= 90)
		 {
			System.out.println("Outstanding Grade:- O " + percentage);
		}
		else if (percentage >= 75)
		 {
		   System.out.println("First Class With Distinction Grade- A"+percentage);	
		}
		else if (percentage >= 60)
		 {
			System.out.println("First Class Grade:- B"+percentage);
		}
		else if (percentage >= 50)
		 {
		 	System.out.println("Secound Clas Grade:- C"+percentage);

		}
		else if (percentage >= 35 )
		 {
			System.out.println("Pass Grade:- D"+percentage);
		}
		else
		{
			System.out.println("Faill Grade :- F"+mark);
		}
	}
}