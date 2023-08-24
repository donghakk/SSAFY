
public class Array3_01_BabyGin_완전검색 {
	public static void main(String[] args) {
		int[] cards = { 3, 4, 5 };
		int N = 3;

		// 순열을 반복문을 이용해서 만들어보자~~
		// 첫번째 카드를 뽑는 경우
		for (int i = 0; i < N; i++) {
			// 두번째 카드 뽑는 경우
			for (int j = 0; j < N; j++) {
				// i와j가 같지 않을때...
				if (i != j) {
					// 세번째 카드 뽑는 경우
					for (int k = 0; k < N; k++) {
						// k는 i와 j와는 달라야 한다.
						if (k != i && k != j) {
							System.out.printf("%d %d %d\n", cards[i], cards[j], cards[k]);

							// runCheck
							System.out.println(runCheck(cards[i], cards[j], cards[k]));
						}

					} // 3
				} // 조건문
			} // 2
		} // 1
	}

	// run : 세개의 숫자가 연속된 숫자인지를 쳌
	public static boolean runCheck(int a, int b, int c) {
//		if(b == a+1 && c == a+2) {
//			return true;
//		}else {
//			return false;
//		}
//		if (b == a + 1 && c == a + 2)
//			return true;
//		return false;

		return b == a + 1 && c == a + 2;
	}

	// triplet : 세개의 숫자가 같은 숫자인지 쳌
	public boolean tripletCheck(int a, int b, int c) {
		return a == b && a == c;
	}

}
