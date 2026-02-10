class ExampleDriver
{
	public static void main(String[] args) 
	{
		System.out.println(Math.pow(2,3));
		UserMath obj = new UserMath();
		System.out.println(obj.pow(2,3));

		System.out.println();

		System.out.println(obj.min(200,30));
		System.out.println(Math.min(200,30));

		System.out.println();

		System.out.println(obj.max(500,50));
		System.out.println(Math.max(500,50));

		System.out.println();

		System.out.println(Math.abs(-20));
		System.out.println(obj.abs(-7));



	}
}

class UserMath
{
	public double pow(double num, int power)
	{
		double op = 1;
		for (int i=1;i<=power ; i++)  
			op *=num;
		return op;
	}

	public int min(int num1,int num2)
	{
		int op1=0;
		if (num1>num2)
		 {
			op1= num2;
		}
		else
		{
			op1 = num1;
		}

		return op1;
	}

	public int max(int num1,int num2)
	{
		int op1=0;
		if (num1<num2)
		 {
			op1= num2;
		}
		else
		{
			op1= num1;
		}

		return op1;
	}

	public int abs(int num)
	{
		int num2 =+7;
		int op = num*num2 ;
		op/=num;

		return op;
	}


}