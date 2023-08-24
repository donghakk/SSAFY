import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		//testcase
		for(int tc = 1; tc<=T; tc++) {
			String res = "Possible";
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int[] luckyguys = new int[n];//손님 
			Queue<Integer> fish = new LinkedList<>();//붕어빵 
			for(int i = 0; i<n;i++) {
				luckyguys[i] = sc.nextInt();
			}
			int max = 0;
			for(int i = 0; i<n; i++) {
				if(max<luckyguys[i])
					max = luckyguys[i];
			}
			int[] count = new int[max]; //손님 
			for(int i = 0; i<n; i++) {
				count[luckyguys[i]]++;
			}
			for(int i  = 1; i<count.length;i++) { // i 는 초를 나타낸다. 
				if(i == m) { //m초마다붕어빵을 k개 추가. 
					m += m;
					for(int j = 0; j<k;k++)
						fish.add(1);
				}//enqueue 
				while(count[i] >= 1 && !fish.isEmpty()) {
					count[i]--;
					fish.remove();
				}
				if(count[i] >= 1 && fish.isEmpty()) {
					res = "Impossible";
					break;
				}
			} // check 
			System.out.println("#"+tc+" " + res);

		}// test case
	}
}