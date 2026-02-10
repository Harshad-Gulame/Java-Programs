//wajp to converting binary to decimal 
class BinarytoDecimal
{
	public static void main(String[] args) {
		
		int bin = 101;
		int sum = 0;
		int a = 1;
		while(bin!=0)
		{
			int r = bin%10;
			 sum = sum + r *a;
			 
			a = a * 2;
			bin = bin/10;
			
			
		}
		System.out.println(sum);
	}
}