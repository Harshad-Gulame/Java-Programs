import java.util.Scanner;
class BankAll
{
 public static void main(String[] args) 
  {
		Scanner sc = new Scanner(System.in);

		System.out.println("------WELCOME TO LAXMI CHIT FUND BANK-------");

		System.out.println("Enter 1 For Login");
		System.out.println("Enter 2 For New Account");
		int login = sc.nextInt();
		long mobile = 8806338049l;
		int password = 1234;
		long balance = 50000;
		long widtraw ;

		for (; ; )	
			 { 
		
				startingLoop:
				if (login==1)
	 				{
					  System.out.println("Welcome");
		              System.out.println("Enter mobile number");
					  long enMobile = sc.nextLong();
		              if (enMobile==mobile)
		            {
			    System.out.println("Enter Password");
			    int enPassword = sc.nextInt();
			    if (enPassword==password)
			      {
					System.out.println("Login sucssfully");
					System.out.println();
					System.out.println("1. Check Balance");
					System.out.println("2. Witdraw money");
					System.out.println("3. Deposite Money");
					System.out.println();
					System.out.println("Enter Your Choice");

					byte choice = sc.nextByte();

					switch(choice)
				      {
				       case 1:
					    {
						 System.out.println("Your Balance is : "+balance);
						 System.out.println();
						 System.out.println("Check Balance Succefull");
						 break;
					    }
				        case 2:
					    {
					     System.out.println("Enter Witdraw money");
						 widtraw=sc.nextLong();

						 if (widtraw>balance)

						  {
							System.out.println("Abe Khvab To okat nusar dekh: ");
							System.out.println();
						  }

							System.out.println("Succefull Witdraw:"+ widtraw);
						    balance = widtraw-balance;
							System.out.println();
							System.out.println("Your Balance Remain"+balance);
							break;
					    }
				        case 3 :
					    {
							System.out.println("Deposite Money");
							System.out.println();
							System.out.print("Enter you want to deposite money: ");
							long deposite = sc.nextLong();
							System.out.println("You are deposite :"+deposite);
							balance=balance+deposite;
							System.out.println("Your total balance is :"+balance);

							break;
						}
					default:
					{
						System.out.println("Invalid Choice");
						break;
					}
				}
			}
			else
			{

				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Envalid password or Mobile Number");
		}
	}
	 
	else
	{
		System.out.println("You Need to Create Your Account ");
		System.out.println("1 Create Accounr");
		System.out.println("2 Exit");
		int newAccount = sc.nextInt();
		if (newAccount==1)
		 {
			System.out.println("--------- New Account------");

			System.out.print("Enter Name : ");
			String name = sc.next().toUpperCase();

			System.out.print("Eneter Mobile Number : ");
			long moNumber = sc.nextLong();

			System.out.print("Enter aadhar number : ");
			double aadhar = sc.nextDouble();

			System.out.println("Enter Pan number : ");
			long pan = sc.nextLong();

			System.out.println("Enter 4 digit pin : ");
			int pin = sc.nextInt();

			System.out.println("Conferm Your Pin :  ");
			int cmpin = sc.nextInt();



			if (pin == cmpin)
			 {
				System.out.println();
				System.out.println("------Account Generate-------");
				System.out.println("Name : "+name);
				System.out.println("Mobile Number : "+moNumber );
				System.out.println("Adhar Number: "+aadhar);
				System.out.println("Pan Number :"+ pan);
				//System.out.println("Account Number : "+accountNumber);
				break startingLoop;
			}

			else
			{
				System.out.println("Wrong pin");
			}
		}
		if (newAccount==2)
		 {
			System.out.println("--------Thank You Visit Again------");
			break ;
		}


		break;
		
	}
  }
}
}