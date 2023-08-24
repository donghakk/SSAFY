
public class Array4_01_Delta {
	static int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	static int N = arr.length;

	public static void main(String[] args) {

		// 현재 나의 좌표
		int r = 2;
		int c = 1;

		// 상하좌우 : 문제에서 주어진 방향이 있으면 그것을 따르고 없으면 내맘
		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		// 한방에 2차원 배열로 작성하는게 나는 더 좋은듯
		int[][] drc = {{-1,0},{1,0},{0,-1},{0,1}};
		
		
		
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d]; //현제 d방향으로 이동한 곳의 값을 알고 싶어
			int nc = c + dc[d]; 
			
			//아래의 것을 선호하는 경우도 있음.
			int nr2 = r + drc[d][0];
			int nc2 = c + drc[d][1];
			
			
			//현재 내위치에 따라서 문제가 발생할 수도 있다.
//			System.out.println(arr[nr][nc]);
			
			//바로 확인하면 안된다.~~~
			//현재 내위치가 경계인지 아닌지를 쳌
			//1. 내 품안에 들어왔으면 진행시켜~~
//			if(nr >= 0 && nr <N && nc>=0 && nc<N) {
//				System.out.println(arr[nr][nc]);
//			}
//			
			//2. 내 품안에 들어오지 않았어? 그러면 안해~~
			if(nr < 0 || nr >= N || nc < 0 || nc >=N){
				continue;
			}
			System.out.println(arr[nr][nc]);
			
			//다음좌표의 값을 비교하고 그리고 범위체크 (위험)
			//범위체크하고 다음좌표의 값을 비교            (안전)
		}

	}// main
	
	public static boolean isRange(int nr, int nc) {
		if(nr < 0 || nr >= N || nc < 0 || nc >=N)
			return false;
		return true;
	}
	
	public static boolean isRange2(int nr, int nc) {
		if(nr >= 0 && nr <N && nc>=0 && nc<N)
			return true;
		return false;
	}
	
	public static boolean isRange3(int nr, int nc) {
		return nr >= 0 && nr <N && nc>=0 && nc<N;
	}
	
	public static boolean isRange4(int nr, int nc) {
		return !(nr < 0 || nr >= N || nc < 0 || nc >=N);
	}
	
	
	
	
	
	
	
	
	
	
	

}
