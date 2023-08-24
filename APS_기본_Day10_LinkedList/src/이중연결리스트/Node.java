package 이중연결리스트;

public class Node {
	public String data;
	public Node prev;
	public Node next;
	
	public Node() {}
	
	public Node(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Node [data=" + data + "]";
	}
}

