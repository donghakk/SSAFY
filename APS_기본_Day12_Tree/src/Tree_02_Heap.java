import java.util.Arrays;

public class Tree_02_Heap {
	public static int[] heap = new int[100]; //완전이진트리라고 생각할것!
	public static int heapSize = 0;
	
	public static void main (String[] args) {	
		heapPush(5);
		System.out.println(Arrays.toString(heap));
		heapPush(22);
		System.out.println(Arrays.toString(heap));
		heapPush(17);
		System.out.println(Arrays.toString(heap));
		heapPush(4038);
		heapPush(34);
		heapPush(6);
		System.out.println(Arrays.toString(heap));
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
	}
	
	//힙에 삽입
	public static void heapPush(int item) {
		heap[++heapSize] = item; //마지막 자리에 삽입.
		
		int ch = heapSize;//자식
		int pa = ch/2;//부모
		while(pa>0 && heap[ch] > heap[pa]) {
			int tmp = heap[pa];
			heap[pa] = heap[ch];
			heap[ch] = tmp;
			ch = pa;  // 자식은 부모로 올려주고. 
			pa = ch / 2;	// 그녀석의 부모는 / 2 한 값.(int)
		}
	}
	//삭제 
	public static int heapPop() {
		//힙이 공백상태라면?
		if(heapSize <= 0) return -1; //주의 요망! 
		
		int item = heap[1]; //루트노드
		heap[1] = heap[heapSize--];
		int p = 1;
		int ch = p *2; //왼쪽자식
		
		if(ch + 1 <= heapSize && heap[ch] < heap[ch+1]){
			ch += 1; //오자가 더크면 오자로 변경세팅
		}
		while(ch<=heapSize && heap[p] <heap[ch]) {
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;
		}
		
		return item;
	}
}
