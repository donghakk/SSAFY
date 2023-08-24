//사용할 클래스 불러오기
import java.io.*;
import java.util.StringTokenizer;

public class Algo4_대전_4반_이민형 {

	public static void main(String[] args) throws IOException {	//BufferedReader 클래스의 readLine() 메서드에서 공백이 들어올 것을 대비하여 예외처리
		//값을 읽어오고 핸들링하는 클래스 초기화 및 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st; 
		
		StringTokenizer stt = new StringTokenizer(br.readLine(),);
		//테스트케이스 수 초기화
		int t = Integer.parseInt(br.readLine());
		
		//테스트케이스 수 만큼 반복문 실행
		for(int tc = 1; tc<=t; tc++) {
			//달팽이 배열의 크기 입력받음
			int n = Integer.parseInt(br.readLine());
			//달팽이 크기의 배열 초기화, default값은 0
			int[][] snail = new int[n][n];
			//시작점 선언
			int r = 0;
			int c = 0;
			//이후 0인 경우에 수를 변경하는 조건을 추가할 예정으로 시작점은 1로 변경
			snail[r][c]=1;
			//증가시키면서 넣을 수 k를 초기화, 시작점은 1로 할당하였기에 2로 시작
			int k = 2;
			//k가 배열의 row*col까지 증가한 경우에 멈추는 반복문 while 생성
			while(k<=n*n) {
				//아래 방향, 아래 행이 배열의 범위를 벗어나지 않으며, 0인 경우 k로 값 변환하며 계속 이동
				while(r+1<n && snail[r+1][c]==0) {
					snail[++r][c]=k++;
				}
				//우측 방향, 우측 열이 배열의 범위를 벗어나지 않으며, 0인 경우 k로 값 변환하며 계속 이동
				while(c+1<n && snail[r][c+1]==0) {
					snail[r][++c]=k++;
				}
				//위 방향, 위 행이 배열의 범위를 벗어나지 않으며, 0인 경우 k로 값 변환하며 계속 이동
				while(r-1>=0 && snail[r-1][c]==0) {
					snail[--r][c]=k++;
				}
				//좌측 방향, 좌측 열이 배열의 범위를 벗어나지 않으며, 0인 경우 k로 값 변환하며 계속 이동
				while(c-1>=0 && snail[r][c-1]==0) {
					snail[r][--c]=k++;
				}
			}//달팽이 배열 숫자 할당 끝 
			//출력 값 입력
			sb.append("#").append(tc).append(" ").append('\n');
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<n; j++) {
					sb.append(snail[i][j]).append(" ");
				}
				sb.append('\n');
			}
		}//테이스케이스 종료
		//Buffered를 이용하여 입력값 출력 
		bw.write(sb.toString());
		//열려있는 Stream close
		br.close();
		bw.close();
	}

}
