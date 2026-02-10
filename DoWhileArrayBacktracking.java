class DoWhileArrayBacktracking{
	public static void main(String[] args) {
		int arr [] = {10,20,40,50,60} ;
		int i = arr.length-1;
		do{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);
	}
}