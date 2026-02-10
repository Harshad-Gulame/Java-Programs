import java.util.Scanner;
class Bmi
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter weight in pound :");
		double pound = sc.nextDouble();

       System.out.println("Enter hight in inche :");
		double inche = sc.nextDouble();
		double hight = inche* 0.0254;
		double kilogram = pound * 0.45359237;

         System.out.println("height"+hight);
		
		System.out.println("weight"+kilogram);
		System.out.println("BMI:" + kilogram * kilogram);
	}
}
