import java.util.Scanner;
class PersonalInfo
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to personal Info : ");
		PersonalInfo();

	}

	public static void PersonalInfo()
	 {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Name: ");
		String name = sc.next();

		System.out.print("Enter Your Mobile Number :");
		long number = sc.nextLong();

		System.out.print("Enter Your Gender :");
		String gender = sc.next();

		System.out.print("Enter Your Adhar Number :");
		double adhar = sc.nextDouble();

		System.out.print("Enter Your Address :");
		String address = sc.next();

		System.out.println("------- YOUR PERSONAL INFORMATION -------");
		System.out.println("Name : " + name);
		System.out.println("Mobile No: "+number);
		System.out.println("Gender : "+gender);
		System.out.println("Adhar No : "+adhar);
		System.out.println("Address : " + address);

	}
}