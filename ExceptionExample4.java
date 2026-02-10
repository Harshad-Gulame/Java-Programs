class ExceptionExample4
{
	public static void main(String[] args) {
		System.out.println("main Start");
		for (int i=1;i<=5 ;i++ )
		 {
			try{
				System.out.println("try :"+i);
				if(i/2==0){
					System.out.println(i);
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println("catch :"+i);
			}
			finally{
				System.out.println("finally :"+i);
			}

		}
		System.out.println("main Ends ");
	}
}