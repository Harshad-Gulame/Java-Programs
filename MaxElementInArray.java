import java.util.Arrays;
class MaxElementInArray
{
	public static void main(String[] args) {
		
		int [] arr = new int [20];

		for (int i = 0;i< arr.length ;i++ ) {
			arr[i] = (int)(Math.random()*100);

		}

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int max = largest(arr);

		System.out.println(max);
	
	}

	public static int largest(int [] arr)
	{
		int max1 = Integer.MIN_VALUE;
			int max2 = Integer.MIN_VALUE;
		for (int ele : arr ) {
			
			if (max1<ele) {
				
				max1 = ele;

				for (int i = arr.length-2;i>0 ;i-- ) {
					if (max1 == arr[i]) {
						// System.out.println(arr[i]);
						max2 = arr[i];
					}
				}

			}
		}
		return max2;
	}
}