import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//마이쮸 나누어 주기
//한번 받은 사람은 새롭게 줄을 서고 기존의 받은 양보다 한개 더 받을 수 있다.
//사람이 줄을 서면 새로운 사람이 와서 줄을 서게 된다.
public class Queue_03_마이쮸 {
	static class Person {
		// 필드로 무엇을 가지고 있으면 좋은가
		int num; // 사람의 번호
		int cnt; // 현재 가지고 갈 수 있는 마이쮸 카운트
		String name;
		
		//이것 또한 가능이다.
		public Person(int num, String name) {
			this.num = num;
			this.cnt = 1;
			this.name = name;
		}
		
		public Person(int num, int cnt, String name) {
			this.num = num;
			this.cnt = cnt;
			this.name = name;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 20; // 총 마이쮸의 개수
		int pNum = 1;

		// 큐를 생성하자.
		Queue<Person> queue = new LinkedList<>();
		// 첫번째 사람을 넣어놓자.
		queue.add(new Person(pNum++, 1, "박정훈"));
		// 정확하게 몇번 돌릴지 알수 없으므로 while문
		// 마이쮸를 다 나누어주면 끝내는 걸로
		while (N > 0) {
			Person p = queue.poll(); // 현재 줄에서 꺼내서 마이쮸 나누어주자
			N -= p.cnt;
			if (N <= 0) {
				System.out.println(p.num + "이 마지막 마이쮸를 챙겨갔다.");
			} else {
				System.out.println(p.num + "번 " + p.name + "이(가) " + p.cnt + "만큼 가져감.");
				p.cnt++;
				System.out.println("남은 마이쮸 : " + N + "개");
				queue.add(p);
				System.out.println("새로 줄설 사람의 이름을 입력해주세요.");
				queue.add(new Person(pNum++, 1, sc.nextLine()));
			}

		}

	}
}
