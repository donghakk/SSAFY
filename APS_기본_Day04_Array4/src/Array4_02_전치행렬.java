import java.util.Arrays;

public class Array4_02_전치행렬 {
	static int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	static int N = arr.length;

	public static void main(String[] args) {

//		for(int i = 0 ; i<N; i++) {
//			for(int j = 0 ; j<N; j++) {
////				System.out.printf("%3d", arr[i][j]);
//				System.out.print(arr[i][j] +"  ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println(Arrays.deepToString(arr)); //이것도 하나의 방법이다.
//		

		// 전치 행렬 (엥 그대로 출력되네?)
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
			}
		}

		// 전치 행렬 찐
//		for(int i = 0 ; i<N; i++) {
//			for(int j = 0 ; j<N; j++) {
//				if(i < j) {
//					int tmp = arr[i][j];
//					arr[i][j] = arr[j][i];
//					arr[j][i] = tmp;
//				}
//			}
//		}
		// 전치 행렬 찐2
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
			}
		}

		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}

	}
}
