package 단순연결리스트;

public class SinglyLinkedList {
	//필드로 가지고 있으면 좋을것들
	private Node head; //노드의 시작점 - 건들지 못하게 프라이빗
	private int size; //현재의 연결리스트의 노드의 개수 : 이론상 필수는 아니지만 편이.
	
	public SinglyLinkedList() {
		this.head = null;//이 두줄 코드는 필요없다. 왜냐면 초기값이 동일하니까.
		this.size = 0; 
	}
	
	//조회
	public Node get(int idx) {
		if(idx<0 || idx>=size) {
			return null;
		}
		Node curr = head;
		for(int i = 0; i<idx; i++) {
			curr = curr.link;
		}
		return curr;
	}
	
	//첫번째 위치에 원소 삽입
	
	public void addFirst(String data) {
		//노드를 생성한다.
		Node node = new Node(data); //생성자를 만들어 놓았으니 인스턴스 생성가능
		//순서중요.
		node.link = head;
		head = node; //head가 첫번째 원소를 가리키는 거니까 넣어
		size++;
	}
	
	//마지막 위치에 원소 삽입
	public void addLast(String data) {
		
		if(size == 0) {
			addFirst(data);
			return;
		}
		Node node = new Node(data);
		
		//마지막 노드를 찾아가자.
		Node curr = head;
		while(curr.link != null) {
			curr = curr.link;
		}
		curr.link = node;
	}
	
	//중간원소삽입
	public void add(int idx, String data) {
		if(idx<0 || idx>size) {
			System.out.println("유효하지 않은 인덱스!!!");
			return;
		}
		if(idx == 0) {
			addFirst(data);
			return;
		}
		if(idx == size) {
			addLast(data);
			return;
		}
		
		Node pre = get(idx-1); //조회 함수를 만들어 두었으니까 히히
		Node node = new Node(data);
		node.link = pre.link; //삽입 
		pre.link = node;
		size++;
	}
	
	//첫번째 원소 삭제
	//데이터를 반환할거야
	public String remove() {
		if(head == null)return null;
		
		String data = head.data; //반환값저장
		head = head.link; // 헤드 뒤로 한칸이동
		size--; //사이즈 하나 감소
		return data;
	}
	//중간원소삭제
	public String remove(int idx) {
		if(idx == 0) return remove();
		//범위를 벗어났다면...
		if(idx<0 || idx>=size) return null; //관대하게 처리할수도 있을것 같음
		
		Node pre = get(idx-1);
		Node rmNode = get(idx); // = pre.link; 이게더 효율적이다.
		
		String data = rmNode.data; //pre.lnk.data; 와 같다.
		pre.link = rmNode.link; // pre.link.link;
		size--;
		return data;
	}
	
	
	//연결리스트에 내용물을 출력하는 메서드 구현
	public void printList() {
		Node curr = head; 
		if(head == null) {
			System.out.println("리스트 텅텅");
			return;
		}
		
		while(curr!=null){
			System.out.print(curr.data + " -> ");
			curr = curr.link;
		}
		
		System.out.println();
	}
}
