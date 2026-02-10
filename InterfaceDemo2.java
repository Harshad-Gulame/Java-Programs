abstract class Demo
{
	static void m1(){
		System.out.println("Static block");
	}
}
class InterfaceDemo2{
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.m1();
	}
}