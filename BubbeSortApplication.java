import java.util.Arrays;
class Marker
{
	String brand;
	String color;
	double price;

	Marker(String brand,String color,double price)
	{
		this.brand = brand ;
		this.color = color ;
		this.price = price ;
	}

	public String toString()
	{
		return "Brand :"+brand+", color :"+color +",price :"+price;
	}
}
class BubbeSortApplication{
	public static void main(String[] args) {
		
		Marker m1 = new Marker("Cameln","Blcak",25);
		Marker m2 = new Marker("Cameln","Red",25);
		Marker m3 = new Marker("Demolon","Blue",25);
		Marker m4 = new Marker("Demolon","Green",25);
	

		Marker markers[] = {m1,m2,m3,m4};
		for (Marker ele :markers ) {
			System.out.println(ele);
		}

		for (; ; ) {
			System.out.println("\n1. Brand A");
			System.out.println("2. Brand D");
			System.out.println("3. Color A");
			System.out.println("4. Color D");
			System.out.println("5. Price A");
			System.out.println("6. Price D");

			System.out.println("Enter your Choice: ");

			switch(new java.util.Scanner(System.in).nextInt())
			{
			case 1 -> brandAscending(markers,markers.length);
			case 2 -> brandDescending(markers,markers.length);
			case 3 -> colorAscending(markers,markers.length);
			case 4 -> colorDescending(markers,markers.length);
			case 5 -> priceAscending(markers,markers.length);
			// case 6 -> priceDescending(markers,markers.length);

			default -> System.out.println("INVALID CHOICE ");
			

			}
			for (Marker ele :markers ) {
				System.out.println(ele);
			}
		}
	}

	public static void brandAscending(Marker [] arr,int n)
	{
		for (int i = 0;i<n-1 ;i++ ) {
			for (int j = i+1;j<n ;j++ ) {
				if ((arr[i].brand.compareTo(arr[j].brand))>0) {
					Marker temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void brandDescending(Marker [] arr,int n)
	{
		for (int i = 0;i<n-1 ;i++ ) {
			for (int  j = i+1;j<n ;j++ ) {
				if ((arr[i].brand.compareTo(arr[j].brand))<0) {
					Marker temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}


public static void colorAscending(Marker [] arr,int n)
	{
		for (int i = 0;i<n-1 ;i++ ) {
			for (int j = i+1;j<n ;j++ ) {
				if ((arr[i].color.compareTo(arr[j].color))>0) {
					Marker temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}


	public static void colorDescending(Marker [] arr,int n)
	{
		for (int i = 0;i<n-1 ;i++ ) {
			for (int j = i+1;j<n ;j++ ) {
				if ((arr[i].color.compareTo(arr[j].color))<0) {
					Marker temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}


	public static void priceAscending(Marker [] arr, int n)
	{
		for (int  i = 0;i<n-1 ;i++ ) {
			for (int j = i+1;j<n ;j++ ) {
				if (arr[i]>=arr[j]) {
					int temp = arr[j];0
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}