import java.util.Arrays;
class ArrayEx1
{
	public static void main(String[] args) {

		int [][] a = new int [2][3];
		a[0][0] = 10 ;
		a[0][1] = 20 ;
		a[0][2] = 30 ;

		a[1][0] = 40 ;
		a[1][1] = 50 ;
		a[1][2] = 60 ;
		
		System.out.println(Arrays.deepToString(a));


		
		   // int [] a = {10,20,30};
		// 	System.out.println(Arrays.toString(a));
	}
}