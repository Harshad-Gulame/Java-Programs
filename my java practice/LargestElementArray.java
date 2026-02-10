class LargestElementArray{
	public static void main(String[] args) {
		
		int arr [] = {10, 45, 2, 89, 30} ;

		int max = 0;

		for (int ele : arr ) {
			
			if (ele > max) {
				
				max = ele ;
			}
		}
		System.out.println("Maximum Element is :"+max);
	}
}