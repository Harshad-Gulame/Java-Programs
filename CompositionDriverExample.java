class Address
{
	String locality ;
	String area ;
	String city ;
	String state ;
	int pincode ;

	Address(String locality,String area,String city,String state,int pincode)
	{
		this.locality = locality ;
		this.area = area ;
		this.city = city ;
		this.state = state ;
		this.pincode = pincode ;
	}

	public void displayAddress(){
		System.out.println("\n Address Details ");
		System.out.println("Locality :"+locality);
		System.out.println("Area :"+area);
		System.out.println("City :"+city);
		System.out.println("State :"+state);
		System.out.println("pincode :"+pincode);
	}
}

class Card
{
	String bank ;
	String expiryDate ;
	int cvv ;
	long cardNumber ;

	Card(String bank,String expiryDate,int cvv,long cardNumber)
	{
		this.bank = bank ;
		this.expiryDate = expiryDate ;
		this.cvv = cvv ;
		this.cardNumber = cardNumber ;
	}

	public void displayCard(){
		System.out.println("\n Card Detail ");
		System.out.println("Bank :"+bank);
		System.out.println("Expiry Date :"+expiryDate);
		System.out.println("CVV :"+cvv);
		System.out.println("Card Number :"+cardNumber);
	}
}

class Customer{
	String name ;
	String email ;
	long contact ; 
	Address [] addresses ;
	Card card ;

	Customer(String name,String email,long contact,Address [] addresses ,Card card)
	{
		this.name = name ;
		this.email = email ;
		this.contact = contact ;
		this.addresses = addresses ;
		this.card = card ;
	}

	public void displayCustomer(){
		System.out.println("Customer Details ");
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Contact :"+contact);

	}
}
class CompositionDriverExample
{
	public static void main(String[] args) {
		
		Address address1 = new Address("JM","DECCAN","Pune","MAHARASTRA",410012);
		Address address2 = new Address("FC","DECCAN","Pune","MAHARASTRA",421540);
		Card card = new Card("SBI","01/2026",132,1245_2545_2515l);

		Customer customer = new Customer("Ramesh Kumar","ramesh@gmail.com",8806338049l,
			new Address []{address1,address2},card);

		customer.displayCustomer();
		customer.card.displayCard();
		Address [] arr = customer.addresses ;

		for (Address ele : arr )
		{
			ele.displayAddress();
		}
	}
}