class ZigZagArrayMerg
{
	public static void main(String[] args) {
		int [] a = {1,3,5};
		int [] b = {2,4,6,8,9};

	
		

		int [] c = new int[a.length + b.length];
		// System.out.println(c.length);

		int k = 0;
			int max = a.length > b.length ? a.length : b.length ;
		for (int i = 0;i<max ;i++ ) {
			if (i<a.length) {
				c[k++] = a[i] ;
			}
			if (i<b.length) {
				c[k++] = b[i];
			}
		}
		for (int ele :c ) {
			System.out.print(ele+ " ");
		}

	}
}