import java.util.Arrays;
class BubbleSort
{
	public static void main(String[] args) {

		int arr[] = {5,6,4,7,3,8,2,9,0,1};

		System.out.println("Main Before Sort :"+Arrays.toString(arr));
		bubbleSort(arr,arr.length);
		System.out.println("After Sort :"+Arrays.toString(arr));
		
	}

	public static void bubbleSort(int [] arr, int n)
	{
		for (int  i = 0;i<n-1 ;i++ ) { 	 
			for (	int j = i+1;j<n ;j++ ) {
				if (arr[i]>=arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			
		}}
	}
}