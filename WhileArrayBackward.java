class WhileArrayBackward{
	public static void main(String[] args) {
		int arr [] = {10,20,40,50,60} ;
		System.out.println("while loop using backtracking ");
		int i = arr.length-1;
		while(i>=0){
			System.out.println(arr[i]);
			i--;
		}
	}
}