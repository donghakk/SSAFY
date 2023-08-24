import java.util.Arrays;
import java.util.Scanner;

public class Problem_사과나무영양분 {
	// 정답을 모아놓는 StringBulider / 배열을 하나 만들어서
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(input);

		// 테스트케이스가 주어지고....
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int ans = 0;

			int N = sc.nextInt(); // 정사각형 크기의 농장
			int[][] farm = new int[N][N];

//			// 입력을 받아보자.
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					farm[i][j] = sc.nextInt();
//				}
////				System.out.println(Arrays.toString(farm[i]));
//			} // 입력 끝
			
			// 입력을 받아보자 2 (붙어져서 들어온 경우) 
//			1
//			5
//			11111
//			11122
//			11121
//			19111
//			11111

			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					farm[i][j] = str.charAt(j) - '0';
				}
				System.out.println(Arrays.toString(farm[i]));
			} // 입력 끝

			// 상하좌우를 위한 델타 배열을 정리
			int[] dr = new int[] { -1, 1, 0, 0 };
			int[] dc = { 0, 0, -1, 1 };

			// 전체 농장을 순회 하면서 상하좌우의 값을 구해보아야한다.
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					//해당 자리의 중간결과
					int sum = farm[i][j]; //문제에서 현재위치의 영양분을 포함한다고 했으니까
					
					//상하좌우 탐색을 해서 갈수 있는 친구들만 포함시켜 더하자.
					for(int d = 0 ; d<4; d++) {
						int nr = i + dr[d];
						int nc = j + dc[d];
						
						//1. 포함하면 / 2. 쳐내
						if(nr >= 0 && nr < N && nc>=0 && nc<N)
							sum += farm[nr][nc];
					}//상하좌우 탐색끝났고 sum에 중간결과가 저장되어있음
					
//					최대값 갱신 (3가지 중 편한거 사용)
					if(ans < sum)
						ans = sum;
					
					ans = Math.max(ans, sum);
					ans = ans<sum?sum:ans;
				}
			}
			

			System.out.println("#" + tc + " " + ans);
//			System.out.printf("#%d %d\n", tc, ans);
		} // tc 위한 for문

		// 요기서 한방에 출력
	}// main

	public static String input = "1\r\n" + "5\r\n" + "1 1 1 1 1\r\n" + "1 1 1 2 2\r\n" + "1 1 1 2 1\r\n"
			+ "1 9 1 1 1\r\n" + "1 1 1 1 1\r\n" + "";

}