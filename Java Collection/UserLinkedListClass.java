import java.util.*;
class UserNoSuchFieldException extends RuntimeException{

}
class UserLinkedList<E> implements Cloneable{
	private int indx ;
	private Node<E> head ;
	private Node<E> tail ;

	private class Node<E>{
		E ele;
		Node<E> next ;

		Node(E ele){
			this.ele = ele;
		}
	}

	@Override
	public String toString(){
		if(indx == 0) return "[]" ;
		String op = "[";
		Node<E> curr = head ;

		while(curr.next!=null)
		{
			op+=curr.ele+", ";
			curr = curr.next;
		}
		op+= curr.ele+"]";
		return op;
	}

	public boolean add(E ele){
		Node<E> newNode = new Node<E>(ele);
		if (indx == 0) {
			head = newNode ;
			tail = head ;
			indx++;
		}else{
			tail.next = newNode ;
			tail = newNode ;
			indx++;
		}
		return true ;
	}
 	 
 	 public void addLast(E ele){
 	 	if(size() == 0)
 	 		throw new UserNoSuchFieldException();

 	 	add(ele);
 	 }

 	 public void addFirst(E ele)
 	 {
 	 	if(size() == 0)
 	 		throw new UserNoSuchFieldException();

 	 	Node<E> newNode = new Node<E>(ele);
 	 	newNode.next = head ;
 	 	head = newNode ;
 	 	indx++;
 	 }

 	 public int size()
 	 {
 	 	return indx;
 	 }

 	 public E getFirst(){
 	 	if(size() == 0)
 	 		throw new UserNoSuchFieldException();

 	 	return head.ele;
 	 }
 	 public E getLast(){
 	 	if(size() == 0)
 	 		throw new UserNoSuchFieldException();

 	 	return tail.ele;
 	 }

}
class UserLinkedListClass{
	public static void main(String[] args) {
		
		UserLinkedList<Integer> list1 = new UserLinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		 
		list1.addFirst(20);
		list1.addLast(30);
		System.out.println(list1);
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		System.out.println(list);
		// System.out.println(list1);
		// System.out.print(list1.size());


	}
}