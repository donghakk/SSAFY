
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Queue_02_API {
	public static void main(String[] args) {
//		Queue는 구현클래스 가없다. (인터페이스)
//		LinkedList 구현 클래스로 활용한다.
		
		Queue<String> queue = new LinkedList<>();
		//추가 (add, offer)
		//삭제 (remove, poll)
		//조회 (element, peek)

		//add, remove, element 예외발생
		
//		queue.add("박민아");
//		queue.offer("서만기");
		
//		System.out.println(queue.remove());
//		System.out.println(queue.poll());
		
		System.out.println(queue.element());
//		System.out.println(queue.peek());
//		
//		queue.isEmpty();
		