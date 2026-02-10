class PalindromCommandLineArgument{
	public static void main(String[] args) {
	
		String op = isPalindrome(args[0]);
		System.out.println(op);		
	}

	public static String isPalindrome(String str)
	{
		String rev = new StringBuilder(str).reverse().toString();

		if (str.equals(rev)) return "Palindrome ";
		else return "No Palindrome";
	}
}