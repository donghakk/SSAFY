
public class Stack_08_팩토리얼 {
	public static void main(String[] args) {
		System.out.println(fac(5));
	}
	
	public static int fac(int num) {
		if(num == 1)
			return 1;
		return num * fac(num-1);		
	}
}
//사실 팩토리얼 은 재귀보단 이터레이션이 더 효율적이라고 할 수 있는데?
// 재귀의 꽃은 아직 맛보지 않았다.
// 여러가지 분기가 있을때, 재귀의 참맛이 느껴진다.
