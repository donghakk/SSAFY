public class Queue_01_선형큐 {
	// 배열을 선언함으로써 createQueue 연산을 한 것이라고 생각할 것.
	public static String[] queue = new String[5];
	//front : 마지막으로 삭제된 원소의 위치 / rear : 마지막 원소의 위치
	public static int front = -1, rear = -1;// 같은 자료형은 , 이어쓰기 가능

	public static void main(String[] args) {

	}

	//front 와 rear가 동일하면 공백상태
	public static boolean isEmpty() {
//		if(front==rear) return true;
//		return false;

		return front == rear;
	}

	//포화상태 rear 마지막 인덱스 위치에 가 있으면 포화상태
	public static boolean isFull() {
		return rear == queue.length-1;
	}
	
	//삽입 : boolean / 자료형 / void
	public static void enQueue(String item) {
		//배열로 만들었을 때 (연결리스트로 만들었다면 생략 가넝)
		if(isFull()) {
			System.out.println("가득 차서 더 이상 넣을 수 없다!");
			return;
		}
		//넣는 행위를 하려면
		queue[++rear] = item;
	}
	
	//삭제
	public static String deQueue() {
		//공백쳌은 꼭 필요
		if(isEmpty()) {
			System.out.println("공백상태 입니다.");
			return null;
		}
		return queue[++front];
	}
}