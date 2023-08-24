
public class String_04_atoi_itoa {
	public static void main(String[] args) {
		String sNum = "         1234            ";
		
		int num = Integer.parseInt(sNum.trim());
		System.out.println(num);
		
		String sNum2 = "-1234";
		int num2 = Integer.parseInt(sNum2);
		System.out.println(num2);
		
		//숫자를 문자열로 바꾸려면
		String sNum3 = String.valueOf(num);
		System.out.println(sNum3);
		
		String sNum4 = num+"";
		System.out.println(sNum4);
		
		System.out.println(atoi(sNum3));
	}
	
	//어렵게 원래라면 어떻게 동작하는지를 구현해보자
	
	public static int atoi(String text) {
		//chatAt으로 받아서 아스키 코드값 이용?
		int value = 0;
		int digit = 0;
		for(int i = 0; i<text.length(); i++) {
			char num = text.charAt(i);
			if(num >= '0' && num <= '9') {
				//이건 숫자야
				digit = num -'0';
			}
			else {
				//여기에 들어오면.. 숫작 ㅏ아닌 이상한 것 이 껴있다.
				//필요한 작업을 할 수 있따.
			}
			value = (value*10) + digit;
		}
		return value;
	}
}
