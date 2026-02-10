import java.util.Arrays;
class TernarySearch{
	public static void main(String[] args) {
		
		int [] arr = new int[20];
		for (int i = 0;i<arr.length ;i++ ) arr[i] = i+1;

	    int key = 19;

		System.out.println(Arrays.toString(arr));

		int pos1 = ternarySearchIterative(arr,arr.length,key);
		int pos2 = ternarySearchRecurasive(arr,0,arr.length-1,key);

		System.out.println(key+" : "+pos1);
		System.out.println(key+" : "+pos2);

	}

	public static int ternarySearchIterative(int arr[],int n,int key)
	{
		int low = 0;
		int high = arr.length-1;


		while(low<=high)
		{

			int mid1 = low+(high-low)/3;
			int mid2 = high-(high-low)/3;

			if (arr[mid1]==key) return mid1;
			if (arr[mid2]==key) return mid2 ;
			if (key<arr[mid1])  high = mid1-1;
			if (key>arr[mid2]) low = mid2+1;
			else{ 
				low = mid1+1;
				high = mid2-1;
			}
		}
		return -1;
	}




	public static int ternarySearchRecurasive(int arr[],int low,int high,int key)
	{
	
		if (low>high) return -1;
		

			int mid1 = low+(high-low)/3;
			int mid2 = high-(high-low)/3;

			if (arr[mid1]==key) return mid1;
			if (arr[mid2]==key) return mid2 ;
			if (key<arr[mid1]) return ternarySearchRecurasive(arr,low,mid1-1,key);
			else if (key>arr[mid2]) return ternarySearchRecurasive(arr,mid1+1,high,key);

			else return ternarySearchRecurasive(arr,mid1+1,mid2-1,key);

		
	}
}