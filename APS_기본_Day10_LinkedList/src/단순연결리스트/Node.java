package 단순연결리스트;
//데이터필드, 다음 노드를 가리키는 링크필드 한개가 존재한다.
public class Node {
	public String data;
	public Node link;
	
	public Node() {
		
	}
	
	public Node(String data) {
		this.data = data;
		this.link = null; //이게 사실 필요없는 문장이다.
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Node [data=" + data + "]";
	}
}
