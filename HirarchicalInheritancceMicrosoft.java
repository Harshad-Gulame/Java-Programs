class Microsoft
{
	String firstName ;
	String lastName ;
	String userName ;
	String password ;
	String licenceDate ;
	String email ;
	String fileType ;

	Microsoft(String firstName,String lastName,String userName,String password,String licenceDate,String email,String fileType)
	{
		this.firstName =firstName ;
		this.lastName = lastName ;
		this.userName =userName ;
		this.password =password ;
		this.licenceDate = licenceDate ;
		this.email = email ;
		this.fileType = fileType ;
	}

	public void getMicrosoft()
	{
		System.out.println("\n Microsoft Details ");
		System.out.println("firstName :"+firstName);
		System.out.println("lastName :"+lastName);
		System.out.println("userName :"+userName);
		System.out.println("password :"+password);
		System.out.println("licenceDate :"+licenceDate);
		System.out.println("email :"+email);
		System.out.println("fileType :"+fileType);
	}
}

class Word extends Microsoft
{
	String applicationName ;
	int pages ;
	Word(String firstName,String lastName,String userName,String password,String licenceDate,String email,String fileType,
		String applicationName,int pages)
	{
		super(firstName,lastName,userName,password,licenceDate,email,fileType);
		this.applicationName =applicationName ;
		this.pages =pages ;
	}

	public void getWord()
	{
		System.out.println("\n Word Info ");
		System.out.println("Application Name :"+applicationName);
		System.out.println("Pages :"+pages);
	}
}

class Excel extends Microsoft
{
	String applicationName ;
	int sheets ;

	Excel(String firstName,String lastName,String userName,String password,String licenceDate,String email,String fileType,
		String applicationName,int sheets)
	{
		super(firstName,lastName,userName,password,licenceDate,email,fileType);
		this.applicationName =applicationName ;
		this.sheets =sheets ;
	}

	public void getExcel()
	{
		System.out.println("\n Excel info");
		System.out.println("Application Name :"+applicationName);
		System.out.println("sheets :"+sheets);
	}
}

class PowerPoint extends Microsoft
{
	String applicationName ;
	int slides;

	PowerPoint(String firstName,String lastName,String userName,String password,String licenceDate,String email,String fileType,
		String applicationName,int slides)
	{
		super(firstName,lastName,userName,password,licenceDate,email,fileType);
		this.applicationName = applicationName ;
		this.slides = slides ;
	}
	public void getPowerPoint()
	{
		System.out.println("\n PowerPoint Info ");
		System.out.println("Application Name :"+applicationName);
		System.out.println("slides :"+slides);
	}
}
class HirarchicalInheritancceMicrosoft
{
	public static void main(String[] args) {

	

		Word obj1 =new Word("Harshad","Gulame","harshad123","Pass@123","01/03/2022","harshadGulame@gmail.com",".docs","word",10);
		obj1.getWord();
		obj1.getMicrosoft();

		Excel obj2 =new Excel("Harshad","Gulame","harshad123","Pass@123","01/03/2022","harshadGulame@gmail.com",".docs","Excel",2);
		obj2.getExcel();
		obj2.getMicrosoft();

		PowerPoint obj3 =new PowerPoint("Harshad","Gulame","harshad123","Pass@123","01/03/2022","harshadGulame@gmail.com",".docs","word",20);
		obj3.getPowerPoint();
		obj3.getMicrosoft();
 
	}
}