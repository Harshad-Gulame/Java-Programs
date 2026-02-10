class StaticBlock
{
	static int a =10;
	static{
		System.out.println("Hello From Static Block");
	}
	public static void main(String[] args) 
	{
		System.out.println(StaticBlock.a);
		
	}
}