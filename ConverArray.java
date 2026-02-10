import java.util.*;
class ConverArray
{
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>();

		list.add(10);
		list.add("Kumar");
		list.add(20);
		list.add(123.585);
		list.add('a');
		list.add(30);
		list.add(false);
		list.add(40);

		System.out.println(list);

		ListIterator<Object> it = list.listiterator();

		System.out.println(it.toArry());

		// while(it.hasNext()){

		// 	 System.out.println(it);
		// }
	}
}