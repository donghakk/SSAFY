//사용할 클래스 불러오기
import java.io.*;
import java.util.StringTokenizer;

public class Algo1_대전_4반_이민형 {
	
	public static void main(String[] args) throws IOException {	//BufferedReader 클래스의 readLine() 메서드에서 공백이 들어올 것을 대비하여 예외처리
	
		//값을 읽어오고 핸들링하는 클래스 초기화 및 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		//특정 좌표를 기준으로 탐색할 두 방향(우, 하) 객체 생성, -를 활용하여 역방향도 탐색해 육목 이상인지 판별할 예정
		int[][] delta = {{0,1},{1,0}};
		//같은 돌이 연속적으로 있는 횟수를 count 하는 cnt 객체 생성
		int cnt = 0;
		//테스트케이스 수 초기화
		int t = Integer.parseInt(br.readLine());
		
		//테스트케이스 만큼 반복문 실행
		for(int tc = 1; tc<=t; tc++) {
			//8x8 크기의 오목판 초기화, default값은 0 
			int[][] place = new int[8][8];
			//오목이 있는지 없는지 판별하는 객체 생성, 0: 없음, 1: 있음
			int result = 0;
			//오목판에 테스트 값 할당하기
			for(int r = 0; r<8; r++) {
				st = new StringTokenizer(br.readLine());
				for(int c = 0; c<8; c++) {
					place[r][c] = Integer.parseInt(st.nextToken());
				}
			}//오목판 테스트 값 할당 끝
			
			//2차원 배열을 한 칸씩 순회(모든 좌표 탐색)하면서, 
			//해당 좌표를 기준으로 상하, 좌우를 동시에 탐색하며, 연속된 돌의 개수가 5인 경우 오목으로 판별하여 loop 탈출
			loop:
			for(int r = 0; r<8; r++) {
				for(int c = 0; c<8; c++) {
					//탐색 좌표가 0인 경우 돌이 없으므로 continue
					if(place[r][c]==0)
						continue;
					//백돌이 놓여 있는 경우 delta를 이용한 탐색 시작
					else {
						for(int i = 0; i<2; i++) {
							//탐색 방향이 변경될 때 마다 cnt를 재할당
							cnt=1;
							//1. 정방향 탐색
							//행별로 다음 칸 값 초기화
							int dr = r + delta[i][0]; 
							int dc = c + delta[i][1];
							//다음칸 값이 인덱스의 범위를 안벗어나면서 기준 좌표와 같이 동일할 경우(=돌이 동일할 경우) 한 칸씩 이동하며 cnt를 늘려나가는 while 반복문 실행
							while(dr>=0 && dr<8 && dc>=0 && dc<8 && place[dr][dc]==place[r][c]) {
								cnt++;
								dr += delta[i][0];
								dc += delta[i][1];
							}
							
							//2. 역방향 탐색, 육목 이상인 경우를 확인
							//행별로 다음 칸 값 재할당
							dr = r - delta[i][0]; 
							dc = c - delta[i][1];
							//다음칸 값이 인덱스의 범위를 안벗어나면서 기준 좌표와 같이 동일할 경우(=돌이 동일할 경우) 한 칸씩 이동하며 cnt를 늘려나가는 while 반복문 실행
							while(dr>=0 && dr<8 && dc>=0 && dc<8 && place[dr][dc]==place[r][c]) {
								cnt++;
								dr -= delta[i][0];
								dc -= delta[i][1];
							}//기준 좌표에 대해 양방향 탐색 끝
							
							//cnt가 5인 경우 오목으로 판별
							if(cnt==5) {
								//오목이 있어 result를 1로 재할당
								result = 1;
								//출력값 입력
								sb.append("#").append(tc).append(" 1").append('\n');
								//오목이 발견되었으니 loop 탈출
								break loop;
							}
						}
					}//delta 탐색 끝
				}
			}

			//오목이 발견되지 않은 경우 출력값 0입력
			if(result==0)
				sb.append("#").append(tc).append(" 0").append('\n');
		}//테스트케이스 종료
		//Buffered를 이용하여 입력값 출력 
		bw.write(sb.toString());
		//열려있는 Stream close
		br.close();
		bw.close();
	}
}
