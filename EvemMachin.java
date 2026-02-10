import java.util.Scanner;
class EvemMachin
{
	static int bjp, cong, ss, mns, aap, nota;
 	public static void main(String[] args) 
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the Population : ");
 		int pop = sc.nextInt();

 		//loop will iternate population time
 		for (int i=1 ;i<= pop ;i++ ) 
 		{
 			System.out.println();
 			System.out.println("		WELCOME		");
 			System.out.println();
 			System.out.println("1. BJP");
 			System.out.println("2. CONGRESS");
 			System.out.println("3. SHIV SENA");
 			System.out.println("4. MNS");
 			System.out.println("5. AAP");
 			System.out.println("6. NOTA");
 			System.out.println();

 			System.out.print("Enter Your Vote : ");
 			int vote = sc.nextInt();
 			switch(vote)
 			{
 			case 1 :
 				{
 					System.out.println("Ache Din Ayenge");
 					bjp++;
 					break;
 				}
 			case 2 :
 				{
 					System.out.println("Bharat Jodo");
 					cong++;
 					break;
 				}
 			case 3 :
 				{
 					System.out.println("Ham he Asale Sena");
 					ss++;
 					break;
 				}
 			case 4 :
 				{
 					System.out.println("Jay Maharashtra");
 					mns++;
 					break;
 				}
 			case 5 :
 				{
 					System.out.println("Apka ak vote muze azad karadega");
 					aap++;
 				}
 			case 6 :
 				{
 					System.out.println("You are Educated ");
 					nota++;
 					break;
 				}
 			default :
 				{
 					System.out.println("Invalid Party");
 					i--;   //utilize the waste literals
 					break;
 				}
 			}			
 		}
 		  if(bjp >= cong && bjp >= ss && bjp >= mns && bjp >= aap && bjp >= nota)
 		  	System.out.println("BJP won The Electionj" +bjp +" Votes");

 		 else if(cong >= bjp && cong >= ss && cong >= mns && cong >= aap && cong >= nota)
 		  	System.out.println("congress won The Electionj"+cong +" Votes");

 		 else if(ss >= cong && ss >= bjp && ss >= mns && ss >= aap && ss >= nota)
 		  	System.out.println("SHIV Sena won The Electionj"+ss +" Votes");

 		 else if(mns >= cong && mns >= ss && mns >= bjp && mns >= aap && mns >= nota)
 		  	System.out.println("MNS won The Electionj"+mns +" Votes");

 		 else if(aap >= cong && aap >= ss && aap >= mns && aap >= bjp && aap >= nota)
 		  	System.out.println("aap won The Electionj"+aap +" Votes");

 		 else 
 		  	System.out.println("Nota won The Electionj"+ nota +" Votes");

 		  System.out.println("Bjp total Votes :" + bjp);
 		  System.out.println("cong total Votes :" + cong);
 		  System.out.println("mns total Votes :" + mns);
 		  System.out.println("ss total Votes :" + ss);
 		  System.out.println("nota total Votes :" + nota);
 		  System.out.println("APP total votes : "+ aap);



 		
 	}
}