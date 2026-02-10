import java.util.*;
class AnticlockWiseArray
{
	public static void main(String[] args) {
		
		int [] arr = new int [10];

		for (int i=0;i< arr.length; i++) arr[i] = i+1;

		System.out.println("Befor :"+ Arrays.toString(arr));
		
		antiClockRotation(arr, new Scanner(System.in).nextInt());

		System.out.println("After :"+ Arrays.toString(arr));
	}

	public static void antiClockRotation(int [] arr ,int rotation)
	{
		for (int i = 1;i<=rotation ;i++ ) {
			int temp = arr[arr.length-1];
			for (int j = arr.length - 2; j>=0 ;j-- ) {
				arr[j+1] = arr[j];
			}
			arr[0] = temp ;
		    System.out.println("Rotation :"+i+" "+Arrays.toString(arr));

		}

	}
}