import java.util.Arrays;
class CharArrayRandom
{
	public static void main(String[] args) {
		char arr[] = new char[26];

		for (char ch = 'A';ch<='Z' ;ch++ ) {
			char cha1 = (char)(Math.random()*10);
			System.out.println(cha1);
			arr[cha-65] = cha1 ;
		}
		System.out.println(Arrays.toString(arr));
	}
}