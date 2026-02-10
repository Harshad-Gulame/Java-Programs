// multiple thread exicute same time so generate a mix output for avoid this use synchronized

class Example{
	public synchronized void printNumber(String name)
	{
		for (int i = 1;i<=10 ;i++ ) {
			System.out.println(name + " : "+i);
		} 
	}
}
class MyThread extends Thread{
	Example obj ;
	MyThread(Example obj){
		this.obj = obj ;
	}
	public void run(){
		obj.printNumber("Ramesh");
	}
}
class ExceptionExample1
{
	public static void main(String[] args) {
		
		Example obj = new Example();
		MyThread t1 = new MyThread(obj);
		t1.start();
		obj.printNumber("main");
	}
}