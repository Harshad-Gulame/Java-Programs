import java.util.Arrays;
class BubbleSortString{
	public static void main(String[] args) {
		
		String name[] = {"RAMESH","MAHESH","GANESH","MUKESH","SURESH"};

		bubbleSortString(name,name.length);

	}

	public static void bubbleSortString(String arr[],int n)
	{
		for (int i = 0;i<n-1 ;i++ ) {
			for (int j = i+1;j<n ;j++ ) {
				if ((arr[i].compareTo(arr[j]))<0) {
					
					String temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}