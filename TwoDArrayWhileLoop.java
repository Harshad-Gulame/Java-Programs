class TwoDArrayWhileLoop{
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5},{6,7,8s}};
		for (int []arr1 :arr ) {
			for (int ele :arr1 ) {
				
				if (ele%2==0) {
					System.out.println("Its Even Element :"+ele);
				}
				else{
					System.out.println("Its Odd Element :"+ele);
				}
			}
		}
		
	}
}