import java.util.Arrays;
class CharArray{
	public static void main(String[] args) {
		char arr [] = new char[26];
		char ch = 'A';
		for (int i=0;i<arr.length ;i++ ) {
			arr[i] = ch;
			ch++;
		}
		System.out.println(Arrays.toString(arr));
	}
}