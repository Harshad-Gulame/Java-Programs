import java.util.Arrays;
class MeargeArray{
	public static void main(String[] args) {
	int [] a = {10,20,30,40};
	int [] b ={50,60,70};

	int c[] = new int[a.length+b.length];

	System.out.println(Arrays.toString(c));

	for (int i = 0; i<c.length ; i++) {

		for(int j = 0;j<a.length;j++){

			c[i] = a[j];

			for (int k = j;k<b.length ;k++ ) {
				c[i+1] = b[k];
			}
			
			
		}
	}
	System.out.println(Arrays.toString(c));

	}
}