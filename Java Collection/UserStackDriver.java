import java.util.*;
class UserStack<E>{
	final private int INITIAL_CAPACITY = 10;
	private E[] arr ;
	int indx = 0;
	public UserStack(){
		super();
	}

	public String toString(){
		String op = "[";
		if (indx == 0) {
			return "[]";
		}else{
			for (int i = 0;i<indx-1 ;i++ ) {
				op += arr[i] + ",";

			}
		}
		return op+"]";
	}

	 

	 
}
class UserStackDriver{
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		System.out.println(stack);

		UserStack st = new UserStack();
		System.out.print(st);

	}
}