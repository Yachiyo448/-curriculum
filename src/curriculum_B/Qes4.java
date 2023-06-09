package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		
		// 1から9まで繰り返し処理
		for (int i=1; i<10; i++) {
			
			// 1から9まで繰り返し処理
			for(int j=1; j<10; j++) {
				
				// 式と答えをそれぞれ0埋めした2桁の数字で出力
				System.out.print(String.format("%02d * %02d = %02d", i, j, i*j));
				
				// 9未満の時に区切り線を出力
				if (j<9) {
					System.out.print(" || ");
				}
			
			}
			
			// 改行（2行分）を出力
			System.out.print("\n\n");
			
		}

	}

}
