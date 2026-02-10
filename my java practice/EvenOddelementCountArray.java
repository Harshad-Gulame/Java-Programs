class EvenOddelementCountArray{
	public static void main(String[] args) {
		
        int arr[] = {1, 2, 3, 4, 5, 6};
        int eCount = 0 ;
        int oCount = 0 ;
        for (int ele :arr ) {
        	if ( ele%2==0) {
        		eCount++;
        	}
        	else{
        		oCount++;
        	}
        }

        System.out.println("Even :"+eCount);
        System.out.println("Odd :"+oCount);
	}
}