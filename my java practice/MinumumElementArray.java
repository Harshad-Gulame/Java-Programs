 class MinumumElementArray
 {
 	public static void main(String[] args) {
 		
 
 		int arr [] = {10, 45, 2, 89, 30};
 		int min = Integer.MAX_VALUE;
 		for (int ele : arr ) {
 			if (ele < min) {
 				
 				min = ele ;
 			}
 		}

 		System.out.println("Minimum element :"+min);
   }
 }