class StringPalindromeCMD{
	public static void main(String[] args) {
		String op = isPalindrome(args[0]);
		System.out.println(op);
	}
	public static String isPalindrome(String s1){
		boolean palindrome= true;
		// int end = s1.length()-1;
		for (int i=0;i<s1.length()/2 ;i++ ) {
			for (int j=s1.length()-1-i; j>=s1.length()-1-i ;j-- ) {
				if(s1.charAt(i)!= s1.charAt(j)){ 
				 palindrome=false;
				break;
				}
			}
			if(!palindrome) 
				break;
		}
		if(palindrome) return "String is palidrome";
		else return "String is not palindrome";
	}
}