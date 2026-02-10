class SumOfEvenOddElementArray{
	public static void main(String[] args) {
		int arr[] = {1,7,5,4,6};
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0;i<arr.length ;i++ ) {
			if (arr[i]%2==0) {
				evenSum += arr[i];
			}
			else {
				oddSum += arr[i];
			}
		}
		System.out.println("Sum Of even Element : "+evenSum);
		System.out.println("Sum Of odd Element : "+oddSum);

	}
}