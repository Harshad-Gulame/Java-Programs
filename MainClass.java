class MainClass
{
	public static void main(String[] args) 
	{
	
	Student obj = new Student();
	obj.m1();
	}
}

class Student
{
	String name = "Harshad";
	int age = 22;
	public void m1()
	{
		System.out.println("Name Of Student : "+ name);
		System.out.println("Age of Student : "+ age);
	}
}