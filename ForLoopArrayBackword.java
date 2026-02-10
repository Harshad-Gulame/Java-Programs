class ForLoopArrayBackword{
	public static void main(String[] args) {
		int arr [] = {10,20,40,50,60} ;
		System.out.println("Array Backtracking using for loop");

		for (int i = arr.length-1 ;i>=0 ; i-- ) {
			System.out.println(arr[i]);
		}
	}
}