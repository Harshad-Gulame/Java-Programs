import java.util.Arrays;
class MeargeSort{
	public static void main(String[] args) {
		
		int arr [] = {5,6,4,7,3,8,2,9,1,0};

		System.out.println("Before :"+Arrays.toString(arr));
		merageSort(arr,0,arr.length-1);
		System.out.println("After :"+Arrays.toString(arr));


	}

	public static void merageSort(int [] arr,int l,int r)
	{
		if (l<r) {
			int mid = (l+r)/2;
			merageSort(arr,l,mid);
			merageSort(arr,mid+1,r);
			merage(arr,l,mid,r);
		}
	}

	public static void merage(int arr[], int l,int mid,int r)
	{
		int len1 = mid-1+1;
		int len2 = r-mid;

		int [] left = new int[len1];
		int [] right = new int[len2];

		
		for(int i = 0;i<len1;i++)
		{
			left[i] = arr[l+1];
		}

		for(int i = 0;i<len1;i++)
		{
			left[i] = arr[mid+i+1];
		}

		int i = 0 ,j = 0,k = l;

		while(i<len1 && j<len2){
			if(left[i]<=right[j])
			{
				arr[k++] = right[i++];
			}
			else{
				arr[k++] = right[j++];
			}
		}

		while(i<len1)
		{
			arr[k++] = left[i++];
		}

		while(j<len2)
		{
			arr[k++] = right[j++];
		}
	}
}