import java.util.Arrays;

public class String_02_문자열생성 {
	 public static void main(String[] args) {
		//문자열 생성하는 방법
		 String str1 = "abc"; //기초자료형 만들듯이 만들기 가넝 새로 만들었따.
		 String str2 = new String("abc"); 
		 System.out.println(str1);
		 System.out.println(str2);
		 
		 System.out.println(str1 == str2); // 주소비교
		 System.out.println(str1.equals(str2)); // 값비교
		 
		 String str3 = "abc";  // str1에서 이미 만들어 놓은 abc를 가리킨다.
		 String str4 = str2;
		 String str5 = str3;
		 
		 System.out.println(str1 == str3);
		 System.out.println(str2 == str4);
		 System.out.println(str3 == str5);
		 
		 System.out.println(str1.equals(str3));
		 System.out.println(str2.equals(str4));
		 System.out.println(str3.equals(str5));
		 
		 System.out.println(str3.charAt(1));//문자열의 요소를 하나씩 가져올 수 있따.
		 char[] c = str3.toCharArray();
		 System.out.println(Arrays.toString(c));
		 
	}
}
