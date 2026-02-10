import java.util.Arrays;
class SelectionSort
{
	public static void main(String[] args) {
		int arr [] = {3,4,2,5,6,1,7,8,0,9};
		System.out.println("Before :"+Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println("After :"+Arrays.toString(arr));

	}

	public static void selectionSort(int arr[],int n)
	{
		int cnt = 0;
		for (int i = 0;i<n-1 ;i++ ) {
			int min = i ;
			for (int  j = i;j<n;j++ ) {
				if (arr[min]>=arr[j]) {
					min = j ;
				}

				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp ;
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}
}