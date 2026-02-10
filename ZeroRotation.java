import java.util.Arrays;
class ZeroRotation{
	public static void main(String[] args) {
		
		int [] arr = {4,0,2,0,1,0,3,0} ;

		System.out.println("Befor :"+Arrays.toString(arr));
		moveZero(arr);
		System.out.println("After :"+Arrays.toString(arr));
	}

	public static void moveZero(int [] arr) {
		
		int k  = 0;
		for (int i = 0;i < arr.length ;i++ ) {
			if (arr[i]!=0) {
				arr[k] = arr[i] ;
				k++;
			}
		}
		for (int i = k;i < arr.length ;i++ ) {
			arr[i] = 0 ;
		}
		System.out.println(Arrays.toString(arr));
	}
}