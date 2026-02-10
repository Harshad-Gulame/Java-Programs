import java.util.Arrays;
class MoveEvenOddArray
{
	public static void main(String[] args) 
	{
		int arr [] = {1,2,3,4,5,6,7,8};
		System.out.println("original arr : "+Arrays.toString(arr));
		for (int i = 0;i < arr.length ;i++ )
		{
			 
			 if (arr[i]%2==0) 
			 {
			 	
			 	int j = i + 1;
			 	while(j<arr.length-1)
			 	{
			 		if (arr[j]%2!=0) 
			 		{
			 			System.out.println(arr[i]);
			 			break ;
			 		}

			 		j++;
			 		System.out.println(arr[j]);
			 	}			 
	        }
        }
	}

}