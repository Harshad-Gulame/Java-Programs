class ForVowel
{
	public static void main(String[] args)
	 {
		
	for (char ch = 'A';ch<='Z' ;ch++ )
	 {
		switch(ch)															// find vowel in Uper case character
		{
		case 'A':
			{
				System.out.print(ch+" ");
				break;
			}
		case 'E':
			{
				System.out.print(ch+" ");
				break;
			}
		case 'I':
			{
				System.out.print(ch+ " ");
				break;
			}
		case 'O' :
			{
				System.out.print(ch+" ");
				break;
			}
		case 'U' :
			{
				System.out.print(ch+" ");
				break;
			}
		};
	}

      System.out.println();
	for (char ch = 'a';ch<='z' ;ch++ )			// find vowels in lower case
	 {
		switch(ch)
		{
		case 'a':
			{
				System.out.print(ch+" ");
				break;
			}
		case 'e':
			{
				System.out.print(ch+" ");
				break;
			}
		case 'i':
			{
				System.out.print(ch+ " ");
				break;
			}
		case 'o' :
			{
				System.out.print(ch+" ");
				break;
			}
		case 'u' :
			{
				System.out.print(ch+" ");
				break;
			}
		};
	}


	}
}