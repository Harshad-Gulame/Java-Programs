class StringFrequencyArray{
	public static void main(String[] args) {
		String str = "Hi i am ramesh my name is ramesh ";

		String [] arr = str.split("\\s+") ;

		boolean [] track = new boolean[arr.length] ;

		for (int i = 0,cnt = 1; i < arr.length ;i++,cnt = 1 ) {
			 if (track[i])  
                continue;
			
			for (int j = i+1;j < arr.length ;j++ ) {
				
				if (arr[i].equals(arr[j])) {
					cnt++;

					track[j] = true ;
				}
			}
		
		if (cnt>1) 
		System.out.println(arr[i] +" : " +cnt); // Frequency of element 
		}
	}
}