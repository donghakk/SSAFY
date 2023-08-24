public class Stack_01_구현 {
	
	public static int[] stack = new int[5];
	public static int top = -1;
	
	public static void main(String[] args) {
		"hello".length();//스트링의 length는 메소드
		
		
		
		
		
	}
	
	public static void push(int value) {
		//배열로 만든 스택이므로 작업하나가 추가.
		if(isFull())
			System.out.println("꽉참!!!");
		else {
			stack[++top] = value;
		}
	}
	
	public static int pop() {
		if(isEmpty()) {
			System.out.println("텅빔!!!");
			return -1; //이건주의요망
		}
		return stack[top--];    //연산자 우선순위!!
	}
	
	
	public static int peek() {
		if(isEmpty()) {
			System.out.println("텅빔!!!");
			return -1; //이건주의요망
		}
		return stack[top];
	}
	
	
	public static boolean isFull() {
		return top == stack.length-1;
	}
	
	
	public static boolean isEmpty() {
//		if(top == -1) return true;		
//		return false;
		return top == -1;
	}
}
