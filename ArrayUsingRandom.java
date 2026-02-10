import java.util.Arrays;
class ArrayUsingRandom
{
	public static void main(String[] args) {
		// System.out.println(Math.random());

		int arr [] = new int[5];

		for (int i = 0;i<arr.length ;i++ ) {
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));

	}
}