import java.util.Arrays;

public class Stack_09_피보나치 {
	public static int[] cnt = new int[50];
	public static void main(String[] args) {
		System.out.println(fibo(45)); // 버거워 하네. ->중복된 호출이 너무 많은 로직이라 그래.
//		System.out.println(Arrays.toString(cnt)); // 이봐라 이.
		System.out.println(fibo2(45));
	}
	
	public static int fibo(int num) {
		cnt[num]++;
		if(num == 0)
			return num;
		if(num == 1)
			return num;
		return fibo(num-1) + fibo(num-2);
	}
	
	
	
	
	
	
	
	//고급스킬 전수(아괜)
	//기록을해두자!
	public static int[] memo = new int[50];
	//memo[0] = 0; memo[1] = 1;
	static {
		memo[0] = 0;
		memo[1] = 1;
	}
	public static int fibo2(int num) {
		if(num>=2 && memo[num] == 0)
		 memo[num] = fibo2(num-1) + fibo2(num-2);
		
		return memo[num];
	}
}




