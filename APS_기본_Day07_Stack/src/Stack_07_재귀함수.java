
public class Stack_07_재귀함수 {
	public static int cnt =0;
	public static void main(String[] args) {
		func2(10);
	}
	
	public static void func1() {
		//무한히 호출 되어야 할거 같은데...
		//적당히 할당해준 메모리가 있다. 그런데 그거 넘치니까 멈춰.
		cnt++;
		System.out.println(cnt);
		func1();
	}
	
	//재귀함수는 두 부분으로 작성하는 경우가 많다.
	public static void func2(int num) {
		//1.기본파트 : 재귀함수를 종료하는 조건을 작성하는 부분
		if(num == 0) {
			return;
		}
		//2.재귀파트 : 나 자신을 다시 호출하는 부분
		System.out.println(num+"함수호출");
		func2(--num);
		System.out.println(num+"함수리턴");
	}
	
	
	
	
}
   