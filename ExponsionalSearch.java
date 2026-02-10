import java.util.Arrays;
class ExponsionalSearch
{
	public static void main(String[] args) {
		
		int arr[] = new int[20];
		for (int i = 1;i<arr.length ;i++ ) arr[i-1] = i;

		System.out.println(Arrays.toString(arr));

		int key = 8 ;
		 int pos = exponsionalSearch(arr,arr.length-1,key);
		 System.out.println(key+" : "+pos);
	}

	public static int exponsionalSearch(int [] arr,int n,int key){

		if (arr[0]==key) return 0;

		int i = 1;
		while(i<n && key>arr[i])
		{
			i *= 2;
			i++;
		}

		return binarySearch(arr,key,i/2,Math.min(n,i));
	}

	public static int binarySearch(int []arr,int key,int low,int high)
	{
		while(low>=high)
		{
			int mid = (high+low)/2;
			if (arr[mid]==key) return mid ;
			else if (key<=arr[mid]) high = mid-1;
			else low = mid+1;
		}
		return -1;
	}
}