import java.util.Scanner;
import java.util.Arrays;
class UserInpurtArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0;i<arr.length ;i++ ) {
			System.out.println("Enter Element :"+(i+1)+" ");
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		
	}
}