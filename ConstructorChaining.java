
class Parent{
	String name;
	String lastName;
	String gender;
	long mobile;
	String email;
	String password;

	Parent()
	{
		
	}

Parent(String gender,long mobile,String email,String password)
{
	this("Na","NA",gender,mobile,email,password);
}
	Parent(String name,String lastName,String gender,long mobile,String email,String password)
	{
		this.name= name;
		this.lastName = lastName ;
		this.gender = gender ;
		this.mobile = mobile ;
		this.email = email ;
		this.password = password;
	}
public void displayDemo()
	{
		System.out.println("Name :"+name);
		System.out.println("Last Name:"+lastName);
		System.out.println("Gender :"+gender);
		System.out.println("mobile :"+mobile);
		System.out.println("email :"+email);
		System.out.println("password :"+password);
	}

}
class Demo extends Parent{
	

	Demo()
	{
		super();
	}

	Demo(String gender,long mobile,String email,String password)
	{
		super("Na","NA",gender,mobile,email,password);
	}

	Demo( String name,String lastName,String gender,long mobile,String email,String password){
		super(name,lastName,gender,mobile,email,password);
	}

	
}
class ConstructorChaining{
	public static void main(String[] args) {
		
		Demo obj = new Demo("paras","kale","m",8806338049l,"paras@gmail.com","Pss@123");
		obj.displayDemo();

		Demo obj2 = new Demo("m",8806338049l,"paras@gmail.com","Pss@123");

		
	}
}