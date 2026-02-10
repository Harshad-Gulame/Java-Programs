import java.util.Scanner;
class IndianCurrency
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount");

		int amount = sc.nextInt();
 		
 		System.out.println("500 :"+amount/500);
 		amount = amount%500;

 		System.out.println("200 :"+amount/200);
 		amount = amount%200;

 		System.out.println("100 :"+amount/100);
 		amount = amount%100;

 		System.out.println("50 :"+amount/50);
 		amount = amount%50;

 		System.out.println("20 :"+amount/20);
 		amount = amount%20;

 		System.out.println("10 :"+amount/10);
 		amount = amount%10;

 		System.out.println("5 :"+amount/5);
 		amount = amount%5;

 		System.out.println("2 :"+amount/2);
 		amount = amount%2;
		
		System.out.println("1 :"+amount/1);
 		amount = amount%1;
		
	}
}