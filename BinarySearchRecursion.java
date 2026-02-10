import java.util.Arrays;
class BinarySearchRecursion{
	public static void main(String[] args) {

		int [] arr = new int[10];
		for (int i = 0;i < arr.length ;i++ )
			arr[i] = (int)(Math.random()*100);

		Arrays.sort(arr);

		int key = 21 ;

		int pos = binarySearchIterative(arr,arr.length,key,0,arr.length-1);

		System.out.println(Arrays.toString(arr));

		System.out.println(key+" : "+ pos);
	}

	public static int binarySearchIterative(int arr[],int n,int key,int min,int max )
	{
		
		if (min>max) return -1;
		int mid = (max+min)/2;

		if (arr[mid]==key)
			return mid;
		else if (key<arr[mid])
			return binarySearchIterative(arr,)
	}
}