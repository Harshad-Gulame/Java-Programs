import java.util.Scanner;

class Bank{
	String name ;
	long accountNumber ;
	long atmNumber ;
	int cvv ;
	 Bank(String name,long accountNumber ,long atmNumber ,int cvv )
	 {
	 	this.name = name ;
	 	this.accountNumber = accountNumber ;
	 	this.atmNumber = atmNumber ;
	 	this.cvv = cvv ;
	 }

	 public String dispplayBank()
	 {
	 	return "Bank [name = "+name+"accountNumber = "+atmNumber+"cvv = "+cvv;
	 }
}

class Payament
{
	String name ;
	String emailId ;
	long contact ;
	Bank bank ;

	Payament(String name,String emailId,long contact,Bank bank)
	{
		this.name = name ;
		this.emailId = emailId ;
		this.contact = contact ;
		this.bank = bank ;

	}
	public String displayPayament()
	{
		return "name :"+name+"emailId :"+emailId+"Conatct :"+contact+"bank "+bank ;
	}

	public void payamentMenthod(Payament obj)
	{
		if (obj instanceof PhonePay)
		 {
			PhonePay obj1 = (PhonePay).obj ;
			System.out.println(obj1.payamentOption());
			System.out.println(obj1.displayPayament());
			System.out.println(obj1.bank.displayBank());
			obj1.spiltbill();
		}
		else if (obj instanceof GooglePay)
		 {
			GooglePay obj1 = (GooglePay).obj ;
			System.out.println(obj1.payamentOption());
			System.out.println(obj1.displayPayament());
			System.out.println(obj1.bank.displayBank());
			obj1.tabToPay();
		}
	}
}

class GooglePay extends Payament
{
	String payamentOption = "GOOGLE_PAY";
	GooglePay(String name, String emailId,long contact,Bank bank)
	{
		super(name,emailId,contact,bank);
	}

	public void tabToPay()
	{
		System.out.println("Tap-To-Pay");
	}
}

class PhonePay extends Payament{
	String payamentOption = "Phone-Pay";

	PhonePay(String name, String emailId,long contact,Bank bank)
	{
		super(name,emailId,contact,bank);
	}

	public void spiltbill()
	{
		System.out.println("split your Bill");
	}
}


class PayamentMethodEx
{
	public static void main(String[] args) {
		for (; ; ) {

			System.out.println("\n WELCOME TO PAYAMENT ");
			System.out.println("1. PhonePay ");
			System.out.println("2.GooglePay");
			System.out.println("3.COD");
			int option = new Scanner(System.in).nextInt();

			switch(option)
			{
			case 1 :
				{
				PhonePay obj = new PhonePay("Ramesh Kumar","ramesh@gmail.com",9874563210l,new Bank("Sbi",9872641265152l,789456984132l,133);
					obj.payamentMenthod(obj);
					break;
				}
			}
			}
			
		}
	}
}