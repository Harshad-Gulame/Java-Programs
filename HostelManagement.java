import java.util.Scanner;
class HostelManagement
{

	//main method 
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Your choice");
		System.out.println("-------------------------");
		System.out.println("Press 1 for Login");
		System.out.println("-------------------------");
		System.out.println("Press 2 for Exit");
		System.out.println("-------------------------");
		System.out.print("Enter Your Choice: ");

	 byte choice=sc.nextByte();

		switch(choice)
		{
		case 1:
			{
				System.out.println("LOGIN PAGE");
				
				// calling login statemt
				login(sc);

				System.out.println();
				System.out.println("***********************************");
			}
		case 2:
			{
				break;
			}
		default:
			{
				System.out.println("Wrong Choice");
				break;
			}
		};
	}

	//login method
	 public static void login(Scanner sc)
	 {
	 	System.out.println();
	 	System.out.println("WELCOME TO HOSTEL MANAGEMENT SYSTEM ");
	 	System.out.println();
	   
	   long mobileNumber = 8806338049l;
	   int password=123;
	   System.out.print("Enter Mobile Number :");
	   long userId = sc.nextLong();
	   System.out.println();

	   System.out.print("Entr Password :");
	   int pass=sc.nextInt();
	  

	   if (userId == mobileNumber && pass==password )
	    {
	    	System.out.println();
	   		System.out.println(" * * * * LOGIN SUCCEFULLY * * * * ");
	   		System.out.println();
	   		displayData(sc);

	   }
	   else
	    {
	   	System.out.println("WRONG PASSWORD OR USERNAME");
	   }


	   System.out.println();
	 	System.out.println("THANKS YOU VISIT AGAIN");



	 }
	
	public static void displayData (Scanner sc)
	 {
	 	
		System.out.println("CHOICE ONE OPTION");
		System.out.println("--------------------");
		System.out.println();
		System.out.println("Enter 1 for enter new data");
		System.out.println("****************************");
		System.out.println("Enter 2 for display student data");
		System.out.println("****************************");
		System.out.println("Enter 3 for delete data");
		System.out.println("****************************");
		System.out.println("Enter 4 for exit");

		byte choice = sc.nextByte();

		switch(choice)
		{
		case 1:
			{
				System.out.println("Welcome to NEW DATA ENTRY ");
				System.out.println();
				newData( sc);
				break;
			}
		case 2:
			{
				System.out.println("Welcome to SEE ALL STUDENT DATA ");
				System.out.println();
				break;
			}
		case 3:
			{
				System.out.println("Welcome to DELETE SOME STUDENT DATA ");
				System.out.println();
				break;
			}
		case 4:
			{
				System.out.println("Thanks To Visit ");
				System.out.println();
				break;
			}
		default :
			{
				System.out.println("Invalid Choice");
				break;
			}
		}
	}


			public static void newData(Scanner sc) 
			{
				
				System.out.println("Plese Enter a Following Information Properly");
				System.out.println();

				System.out.print("Enter Student first Name : ");
				String name = sc.next();

				System.out.print("Enter Course Name ");
				String course = sc.next();

				System.out.print("Enter Mobile Number :");
				long number = sc.nextLong();

				System.out.print("Enter Adhar Number :");
				double adhar = sc.nextDouble();

				System.out.print("Enter Parent Number :");
				double pNumber = sc.nextDouble();

				System.out.println("* * * * * * * * * * * * * * * * * *");
				System.out.println();
				System.out.println("                NEW STUDENT INFORMATION         ");
				System.out.println();

				System.out.println("Student Name :"+name);
				System.out.println("Student Course Name :"+course);
				System.out.println("Student Mobile Number :"+number);
				System.out.println("Student Adhar Number :"+adhar);
				System.out.println("Student Parents Number :"+pNumber);

				System.out.println();


			}
}