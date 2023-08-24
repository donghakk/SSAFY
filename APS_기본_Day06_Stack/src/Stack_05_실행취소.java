import java.util.Scanner;
import java.util.Stack;

public class Stack_05_실행취소 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<String> ctrlZ = new Stack<>(); // 뒤로
		Stack<String> ctrlY = new Stack<>(); // 앞으로
		
		String work = "";
		
		while(true) {
			System.out.println("1. 새로운 작업");
			System.out.println("2. Ctrl+Z");
			System.out.println("3. Ctrl+Y");
			System.out.println("0. 종료(아무 숫자를 입력하면 종료하게끔)");
			

			//메뉴 선택하기
			int N = sc.nextInt();
			//if문으로 틀을 잡을건데 switch 가넝이야 (요걸로 만들어보는것도 추천)
			if(N==1) {
				//새로운 작업을 넣어보자.
				//작업순서.
				//1. 현재 작업을 Z에 넣는다.
				//2. 새로운 작업을 입력 받는다.
				//3. Y를 비운다.
				//3-1. clear(); 메서드를 활용하여 비운다.
				//3-2. 새로운 스택을 만든다. new를 이용하여 인스턴스 생성
				//3-3. while(!ctrlY.isEmpty()){ ctrlY.pop();}
				//4. 현재 작업 출력 (선택사항)
				
				ctrlZ.push(work);
				work = sc.next(); //주의  공백이 없는 상태의 작업이 들어온다고 가정.
				ctrlY.clear();
				System.out.println(work);
				
			}else if(N==2) {
				//실행을 취소한다.
				if(ctrlZ.isEmpty()) {
					System.out.println("Z스택이 공백상태라 과거 작업이 없다.");
				}else {
					//1. 현재 작업을 Y에 넣는다.
					//2. Z에서 작업을 꺼내어 넣는다. (work 대입)
					//3. 현재 작업 출력 (선택사항)
					ctrlY.push(work);
					work = ctrlZ.pop();
					System.out.println(work);
				}
			}else if(N==3) {
				//실행취소를 취소한다. (앞으로 )
				if(ctrlY.isEmpty()) {
					System.out.println("현재 작업이 가장 최신작업이야 ");
				}else {
					//1. 현재 작업을 Z에 넣는다.
					//2. Y에서 작업을 꺼내어 넣는다.
					//3. 현재 작업 출력 (선택사항)
					ctrlZ.push(work);
					work = ctrlY.pop();
					System.out.println(work);
				}
			}else {
				//0 혹은 아무 숫자가 입력이 되어 종료를 하려고 한다.
				System.out.println("종료합니당~");
				break;
			}
		}	
	}
}
