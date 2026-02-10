import java.util.Scanner;
class RankMarks
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 subject marks :");

		int p = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int b = sc.nextInt();

		double per = p+m+c+b/4;
		System.out.println(per);
		if (p<35 || m< 35|| c<35 || b<35) {
			
			System.out.println("you are fail ");
		}
		else if (per>85)
		 {
			System.out.println("Pass With Distinction");
		}
		else if (per>=65)
		 {
			System.out.println("Pass With First Class");
		}
		else if (per>55)
		 {
			System.out.print("Pass With secound class");
		}
		else if (per>=35)
		 {
			System.out.println("You are pass ");
		}
		else {
			System.out.println("fail ");
		}
	}
}