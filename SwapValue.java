class SwapValue
{
	public static void main(String[] args) {
		int a = 10 ;
		int b = 20;
		System.out.println("Before Swap");
		System.out.println("a : "+a);
		System.out.println("b : "+b);

		int c = a;
		 a=b;
		 b=c;
		 System.out.println("After Swap");
		 System.out.println("a:"+a);
		 System.out.println("b :" + b);
	}
}