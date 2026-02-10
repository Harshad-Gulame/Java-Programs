import java.util.Arrays;
class LargestElementArraySorted{
	public static void main(String[] args) {
		
		int [] arr = {5,4,7,3,2,8,1} ;
		System.out.println(" Original Array : "+Arrays.toString(arr));
		int max = Integer.MIN_VALUE ;

		Arrays.sort(arr);
		System.out.println("Sorted array : "+Arrays.toString(arr)); 

		
			System.out.println("Larget Element :"+arr[arr.length-1]);
		

		
	}
}