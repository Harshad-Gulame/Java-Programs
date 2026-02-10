class DoWhileArrayForward{
	public static void main(String[] args) {
		int arr [] = {10,20,40,50,60} ;
		int i = 0;
		do{
			System.out.println(arr[i]);
			i++;
		}while(i<arr.length);
	}
}