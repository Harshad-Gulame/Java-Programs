import java.util.Scanner;
class CurrencyConvertor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		//infinite Lops

		for(; ;)
		{
			System.out.println();
			System.out.println("      WELCOME    ");
			System.out.println();
			System.out.println("List Of Currency ");
			System.out.println("1. USD");
			System.out.println("2. EUR");
			System.out.println("3. ADA");
			System.out.println("4. AED");
			System.out.println("5. AFN");
			System.out.println("6. ALL");
			System.out.println("7. AMD");
			System.out.println("For Exit Enter 0");
			System.out.println();

			System.out.print("Enter Your Amount : ");
			float inr = sc.nextFloat();

			System.out.print("Enter The Currency Code : ");
			String code = sc.next().toUpperCase();
			boolean asump = true;

			if (code.equal("USD")) 
			{
				inr = inr/85.56f;

			}
			else if (code.equal("EUR"))
			 {
				inr = inr/9.95f;
			}
			else if (code.equal("ADA"))
            {
				inr = inr/56.15f;
			}
			else if (code.equal("AED"))
            {
				inr= inr/23.30f;
			}
			else if (code.equal("AFN"))
            {
				inr = inr/1.22f;
			}
			else if (code.equal("ALL"))
            {
				inr = inr/1.02f;
			}
			else if (code.equal("AMD"))
            {
				inr = inr/0.22f;
			}

			else
			{
				System.out.println();
				System.out.println("Invalid currency Code i.e : "+code);
				asump = false;
			}
			if (asump) 
			{
				System.out.println(inr);
			}
		}
	}
}