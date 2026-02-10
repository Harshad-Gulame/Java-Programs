class LenghtForArrayEx
{
	public static void main(String[] args) {
		int [] arr = {10,20,30,40};

		System.out.println("Usnig for Loop");
		for (int i = 0;i<arr.length ;i++ ) {
			System.out.println(arr[i]);
		}


		System.out.println("Usnig while Loop ");

		int a  = 0;
		while(a<arr.length)
		{
			System.out.println(arr[a]);
			a++;
		}

		System.out.println("Usnig do while Loop");

			int b = 0;
			do{
				System.out.println(arr[b]);
				b++;

			}while(b<arr.length);
	}
}