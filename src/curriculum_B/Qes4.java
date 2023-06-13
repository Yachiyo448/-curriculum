package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		/* 問4
		 * for文を使用して下記の通りに出力してください
		 */

		// 「課題4」を出力
		System.out.println("課題4\n\n");

		// 1から9まで繰り返し処理
		for (int i=1; i<10; i++) {

			// 1から9まで繰り返し処理
			for (int j=1; j<10; j++) {

				// 式の答えを代入
				int result = i * j;

				// 9未満の時に区切り線を出力
				if (j<9) {
					System.out.print(String.format("%02d * %02d = %02d || ", i, j, result));
				} else {
					System.out.print(String.format("%02d * %02d = %02d\n\n", i, j, result));
				}

			}

		}

	}

}
