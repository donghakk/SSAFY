//사용할 클래스 불러오기
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Algo3_대전_4반_이민형 {

	public static void main(String[] args) throws IOException {	//BufferedReader 클래스의 readLine() 메서드에서 공백이 들어올 것을 대비하여 예외처리
		//값을 읽어오고 핸들링하는 클래스 초기화 및 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		//테스트케이스 수 초기화
		int t = Integer.parseInt(br.readLine());
		
		//테스트케이스 수 만큼 반복문 실행
		for(int tc = 1; tc<=t; tc++) {
			//들어올 정수의 크기 초기화
			int n = Integer.parseInt(br.readLine());
			//n의 크기만큼 List 초기화, -50억부터 50억 으로 Long 타입으로 설정
			List<Long> arr = new ArrayList<>();

			//배열에 테스트 값 입력
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i<n; i++) {
				arr.add(Long.parseLong(st.nextToken()));
			}
			//Collections 클래스를 이용하여 List 클래스인 arr 객체를 내림차순(Collections.reverseOrder()) 정렬
			Collections.sort(arr,Collections.reverseOrder());
			//2번째 index값(세 번째로 큰 값)을 출력값에 입력
			sb.append("#").append(tc).append(" ").append(arr.get(2)).append('\n');
		}//테스트케이스 종료
		//Buffered를 이용하여 입력값 출력 
		bw.write(sb.toString());
		//열려있는 Stream close
		br.close();
		bw.close();
	}

}
