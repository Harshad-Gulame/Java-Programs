class NonStaticMethod
{
     public static void main(String[] args) 
     {
        	NonStaticMethod obj = new NonStaticMethod();
        	obj.m1();
        	NonStaticMethod.m2();
     }

     public void m1() 
     {
     	System.out.println("m1() Non Static Method ");
     }

     public static void m2()
     {
     	System.out.println("m2() Static Method");
     }


}