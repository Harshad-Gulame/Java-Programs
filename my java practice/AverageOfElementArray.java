class AverageOfElementArray{
	public static void main(String[] args) {
		
		int arr [] = {2, 4, 6, 8} ;
		int sum = 0;

		for (int ele :arr ) {
			
			sum  += ele ;
		}

		System.out.println("Average Of element :"+sum/arr.length);
	}
}