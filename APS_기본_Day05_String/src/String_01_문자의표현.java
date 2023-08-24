
public class String_01_문자의표현 {
	public static void main(String[] args) {
		char a = 'A';
		
		System.out.println('A');
		System.out.println((int)'A'); //명시적 형 변환을 통해서 저장할 수 있음.
		
		int b = 'A';  //묵시적 형변환 : char는 2바이트 int 는 4바이트
		System.out.println(b);
		System.out.println('9'-48); // 48 = 0의 아스키코드값
		System.out.println('7'-'0');
		
		//심화
		//대문자와 소문자의차이 32
		//비트 연산자라고 하는 것을 배우진 않았다.
		System.out.println('A'^32); //^ 는 xor 연산
		System.out.println((char)('A'^32));
	}
}
