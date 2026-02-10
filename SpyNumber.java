class SpyNumber
{
	 
    public static void main(String[] args) 
    {
         
        
        
        int num = 22;   
        int sum = 0;
        int product = 1;
        int temp = num;
        
        while (temp > 0) 
        {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        
        if (sum == product)
         {
            System.out.println(num + " is a Spy Number.");
        } else
         {
            System.out.println(num + " is NOT a Spy Number.");
        }
 
       
    }
}

