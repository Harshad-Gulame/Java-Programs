import java.util.Arrays;
class SentanalSearch{
	public static void main(String[] args) {
		
		int arr[] = new int[20];
		for (int i = 0;i< arr.length ;i++ ) 
			arr[i] = i+1;

		System.out.println(Arrays.toString(arr));

		int key = 5 ;

		int pos = sentanalSearch(arr,arr.length,key);
		System.out.println(key +" : "+ pos);

	}

	public static int sentanalSearch(int arr[],int n,int key)
	{
		int last = arr[n-1];
		arr[n-1] = key;

		int i = 0;
		while(arr[i]!=key) i++ ;
		arr[n-1] = last ;
		if (i<n || arr[i] == last) return i;
		else return -1;
	}
}