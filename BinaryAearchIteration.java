import java.util.Arrays;
class BinaryAearchIteration
{
	public static void main(String[] args) {
		
		int [] arr = new int[10];
		for (int i = 0;i < arr.length ;i++ )
			arr[i] = (int)(Math.random()*100);

		Arrays.sort(arr);

		int key = 21 ;

		int pos = binarySearchIterative(arr,arr.length,key);

		System.out.println(Arrays.toString(arr));

		System.out.println(key+" : "+ pos);
	}

	public static int binarySearchIterative(int arr[],int n,int key )
	{
		int min = 0,max = n-1;
		while(min<=max)
		{
			int mid = (max+min)/2 ;

			if (arr[mid]==key) return mid;
			else if(key<arr[mid]) max = mid - 1;
			else min = mid + 1; 
		}
		return -1;
	}
}