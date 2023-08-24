import 단순연결리스트.SinglyLinkedList;

public class LinkedList_02_이중연결리스트 {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		list.printList();
		
		list.addFirst("sdfs");
		list.printList();
		
		list.addFirst("gggg");
		list.printList();
		
		list.addLast("last");
		list.printList();
		System.out.println(list.get(1));
	}
}
