class RecursionAlphabates
{
	static char ch = 'Z';
	public static void main(String[] args) 
	{
		printAlpahabates();
	}

	public static void printAlpahabates()
	{
		System.out.print(ch +" ");
		if (ch-- == 'A')
		 {
			return;
		}
		printAlpahabates();
	}
}