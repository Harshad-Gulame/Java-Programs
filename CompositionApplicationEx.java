class Student
{
	String name ;
	String address ;
	long contact ;
	String course ;
	String gender ;

	Student(String name, String address ,long contact , String course,String gender)
	{
		this.name = name ;
		this.address = address ;
		this.contact = contact ;
		this.course = course ;
		this.gender = gender ;
	} 

	public void displayStudent()
	{
		System.out.println("\n Student Information ");
		
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Contact :"+contact);
		System.out.println("Course :"+course);
		System.out.println("Gender :"+gender);
	}

}

class Course
{
	String course ;
	String strem ;
	double fee ;
	int departmentNo ;
	int year ;

	Course(String course,String strem,double fee,int departmentNo,int year)
	{
		this.course = course ;
		this.strem  = strem ;
		this.fee = fee ;
		this.departmentNo = departmentNo ;
		this.year = year ;

	}

	public void displayCourse()
	{
		System.out.println("\n Course Details ");
		System.out.println("Course :"+course);
		System.out.println("Strem :"+strem);
		System.out.println("Fee :"+fee);
		System.out.println("Department Number :"+departmentNo);
		System.out.println("Year Of Course :"+year);
	}
}

class College
{
	String name ;
	String univercity ;
	int collegeCode ;
	Student student ;
	Course course ;

	College(String name , String univercity,int collegeCode)
	{
		this.name = name ;
		this. univercity = univercity;
		this.collegeCode = collegeCode ;
		this.student = new Student("Prashant","Achakdani" ,9545154590l , "BCA","Male");
		this. course = new Course("BCA-MCA","CS/IT",25000,12,3);

	}

	public void displayCollege()
	{
		System.out.println("\n College Detail");
		System.out.println("Name :"+name);
		System.out.println("univercity :"+univercity);
	}
}
class CompositionApplicationEx
{
	public static void main(String[] args) {
	
		System.out.println("main Start");

		College object = new College("FC College","PUNE-Univercity",9985);
		object.displayCollege();
		object.student.displayStudent();
		object.course.displayCourse();

	
	}
}