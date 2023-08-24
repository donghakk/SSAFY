import java.util.Arrays;

public class String_03_문자열뒤집기 {
	//why? 
	public static void main(String[] args) {
		//뒤집을 문자열 하나 준비해 보자.
		String text = "조용히관리하겠습니다";
		
		char[] str = new char[text.length()];
		for(int i = text.length()-1;i>=0; i--) {
			str[text.length()-1-i] = text.charAt(i);
		}
		System.out.println(Arrays.toString(str));
	
		//2.swap방식
		
		char[] str2 = text.toCharArray();
		int len = str2.length;
		for(int i = 0; i < len/2; i++) {
			char temp = str2[i];
			str2[i] = str2[len-1-i];
			str2[len-i-1] = temp;
		}
		
	System.out.println(Arrays.toString(str2));
	StringBuilder sb = new StringBuilder();
	sb.append(text);
	sb.reverse();
	System.out.println(sb.toString());
	
	
	
	}
}
