class Address
{
	String area ;
	String city ;
	int pincode ;

	Address(String area, String city, int pincode)
	{
		this.area = area ;
		this.city = city ;
		this.pincode = pincode ;
	}

	public void displayAddress()
	{
		System.out.println("Area :"+area);
		System.out.println("Area :"+city);
		System.out.println("Pincode :"+pincode);
	}
}

class Employee extends Address  implements Cloneable
{
	String ename ;
	String empid ;
	double salary ;
	long contact ;

	Employee(String ename, String empid , double salary,long contact,String area , String city,int pincode)
	{
		super(area,city,pincode);
		this.ename = ename ;
		this.salary = salary ;
		this.contact = contact ;
	}

	public void displayEmployee()
	{
		System.out.println("Name :"+ename);
		System.out.println("Salary :" + salary);
		System.out.println("Contact :"+ contact);
	}

	@Override
	public java.lang.Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
class ExceptionExample
{
	public static void main(String[] args) {
		
		Employee oldobj = new Employee("Ramesh","Em_1",25000,8806338049l,"Deccan","pune",413302);
		oldobj.displayEmployee();

		System.out.println("\n _____________________________________________ \n");

		Employee copyObj = null ;
		try{

			copyObj = (Employee)oldobj.clone();
		} catch(CloneNotSupportedException e)
		{
			System.out.println("CloneNotSupportedException Handaled");
		}

		copyObj.displayEmployee();
	}
}