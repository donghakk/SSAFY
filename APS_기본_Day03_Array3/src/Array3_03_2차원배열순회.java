
public class Array3_03_2차원배열순회 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, 
						{ 4, 5, 6 }, 
						{ 7, 8, 9 } };

		int N = arr.length;
		int M = arr[0].length;

		// 1.행우선 순회
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
		}
		System.out.println();

		// 2. 행 역우선 순회
		for (int i = 0; i < N; i++) {
			for (int j = M - 1; j >= 0; j--) {
				System.out.printf("%3d", arr[i][j]);
			}
		}
		System.out.println();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.printf("%3d", arr[i][M - 1 - j]);
			}
		}
		System.out.println();

		// 3. 열 우선 순회
		for (int j = 0; j < M; j++) { // 열 고정
			for (int i = 0; i < N; i++) {
				System.out.printf("%3d", arr[i][j]);
			}
		}
		System.out.println();
		// 행과 열의 크기가 동일할 경우 이렇게 생각도 가넝이야
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.printf("%3d", arr[j][i]);
			}
		}
		System.out.println();

		// 4. 열 역우선 순회
		for (int j = 0; j < M; j++) {
			for (int i = N - 1; i >= 0; i--) {
				System.out.printf("%3d", arr[i][j]);
			}
		}
		System.out.println();

		// 5. 지그재그 순회
		for (int i = 0; i < N; i++) {
			// 정방향
			if (i % 2 == 0) {
				for (int j = 0; j < M; j++) {
					System.out.printf("%3d", arr[i][j]);
				}
			} else {
				for (int j = M - 1; j >= 0; j--) {
					System.out.printf("%3d", arr[i][j]);
				}
			}
		}
		System.out.println();
		for (int i = 0; i < N; i++) {
			// 정방향
			if (i % 2 == 0) {
				for (int j = 0; j < M; j++) {
					System.out.printf("%3d", arr[i][j]);
				}
			} else {
				for (int j = 0; j < M; j++) {
					System.out.printf("%3d", arr[i][M - 1 - j]);
				}
			}
		}
		System.out.println();

		for (int i = 0; i < N; i++) {
			// 정방향
			for (int j = 0; j < M; j++) {
				System.out.printf("%3d", arr[i][j + (M - 1 - j - j) * (i % 2)]);
			}
		}
		System.out.println();

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
