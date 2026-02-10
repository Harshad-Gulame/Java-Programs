import java.util.Arrays;
class ReverseArray{
	public static void main(String[] args) {

	int arr [] = {1, 2, 3, 4} ;
	int arr1 [] = new int[arr.length] ;
	int j = 0;
	for (int i= 0;i < arr.length;i++ ) {
			
			arr1[j] = arr[i];
			j++;				

			}		
	}

	System.out.println(Arrays.toString(arr1));
}