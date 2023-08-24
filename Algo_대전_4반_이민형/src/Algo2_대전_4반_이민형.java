//사용할 클래스 불러오기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Algo2_대전_4반_이민형 {

	public static void main(String[] args) throws IOException {	//BufferedReader 클래스의 readLine() 메서드에서 공백이 들어올 것을 대비하여 예외처리
		
		//값을 읽어오고 핸들링하는 클래스 초기화 및 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		//비교하고자 하는 월/일 날짜를 받을 객체 생성
		StringTokenizer date1;
		StringTokenizer date2;
		Scanner sc = new Scanner(System.in);
		
		
		//월별 일자를 담아놓는 map 초기화 및 할당
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 65);
		map.put(2, 66);
		map.put(3, 64);
		map.put(4, 66);
		map.put(5, 62);
		map.put(6, 62);
		map.put(7, 63);
		map.put(8, 56);
		map.put(9, 65);
		map.put(10, 62);
		map.put(11, 56);
		//테스트케이스 수 초기화
		int t = Integer.parseInt(br.readLine());
		
		//테스트케이스 수 만큼 반복문 실행
		for(int tc = 1; tc<=t; tc++) {
			//날짜 차이를 나타낼 객체 초기화
			int diff = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " /", false);
			st = new StringTokenizer(br.readLine());
			//date1,2에 월/일을 토큰으로 나누어 입력
			date1 = new StringTokenizer(st.nextToken(),"/");
			date2 = new StringTokenizer(st.nextToken(),"/");
			//월 일을 분리하여 각각 개체를 초기화
			int month1 = Integer.parseInt(date1.nextToken());
			int day1 = Integer.parseInt(date1.nextToken());
			int month2 = Integer.parseInt(date2.nextToken());
			int day2 = Integer.parseInt(date2.nextToken());
			
			//비교하고자 하는 날짜의 월이 같은 경우, diff에 두 날짜의 차이를 더하며 끝
			if(month1==month2)
				diff+=(day2-day1);
			//비교하고자 하는 날짜의 월이 다른 경우
			else {
				//첫 번째 기준 월의 전체 일자에서 기준 일자를 빼준 값을 diff에 더해줌 
				diff+=(map.get(month1)-day1);
				//비교하고자 하는 월들 사이의 모든 달의 일자를 map을 통해 diff에 더해줌
				for(int i = month1+1; i<month2; i++) {
					diff+=map.get(i);
				}
				//두 번째 기준 월의 기준 일을 diff에 더해줌 
				diff+=day2;
			}
			//날짜의 차이를 출력 형식에 맞추어 입력
			sb.append("#").append(tc).append(" ").append(diff).append('\n');
		}//테스트 케이스 종료
		//Buffered를 이용하여 입력값 출력
		System.out.println(sb.toString());
		bw.write(sb.toString());
		//열려있는 Stream close
		br.close();
		bw.close();
	}

}
