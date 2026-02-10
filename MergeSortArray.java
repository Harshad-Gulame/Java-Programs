import java.util.Arrays;
class MergeSortArray{
	public static void main(String[] args) {
		
		int [] arr = {1,5,6,3,2,4,8,7,9,0};
		System.out.println("Before :"+Arrays.toString(arr));
		merageSort(arr,0,arr.length-1);
		System.out.println("After :"+Arrays.toString(arr));

	}

	public static void merageSort(int [] arr,int l , int r)
	{
		if (l<r) {
			int mid = (l+r)/2;
			merageSort(arr,l,mid);
			merageSort(arr,mid+1,r);
			merage(arr,l,mid,r);

		}
	}

	public static void merage(int [] arr,int l,int mid,int r)
	{
		int lenL = mid-l+1;
		int lenR = r-mid ;

		int [] left = new int[lenL];
		int  [] right = new int[lenR];

		for (int i = 0;i<lenL ;i++ ) left[i] = arr[l+i];
		for (int i = 0;i<lenR ;i++ ) right[i] = arr[mid+1+i];

		int i = 0, j = 0 ,k = l;

		while(i<lenL && j<lenR){

			if(left[i]<right[j])
			{
				arr[k++] = right[i++];
			}
			else{
				arr[k++] = right[j++];
			}
		}

		while(i<lenL)  arr[k++] = left[i++];
		

		while(j<lenR) arr[k++] = right[j++];
		
	}
}