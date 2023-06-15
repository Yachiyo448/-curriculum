package curriculum_New_question;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void str_int_marge(String str, int in) {
		// 受け取った引数2つを文字列として結合
		String marge = str + " " + String.valueOf(in);
		System.out.println(marge + "\n");
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void calculate(int int_A, int int_B) {
		// 引数同士を乗算
		int result = int_A * int_B;
		System.out.println(result + "\n");
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void arrayOut(int[] array) {
		// 引数として受け取った配列から要素を順次出力
		for (int num : array) {
			System.out.println(num);
		}
		System.out.println();
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void calculate(double double_A, double double_B) {
		// 受け取った引数2つを和算
		double result = double_A + double_B;
		System.out.println(result + "\n");
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] randomArrayOut(int in) {
		// 引数分の配列を宣言し、各要素に順次格納
		int[] array = new int[in];
		for (int i = 0; i < array.length; i++) {
			// 1～100のランダムな整数を要素に代入し出力
			array[i] = (int) Math.ceil(Math.random() * 100);
			System.out.println(array[i]);
		}
		System.out.println();
		// メソッド呼び出し元に配列を返す
		return array;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double arrayAverageOut(int[] array) {
		// 配列内の要素を合計する
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		// 合計値を要素数で割り、平均値を求める
		double average = (double) sum / array.length;
		System.out.println(average + "\n");
		// メソッド呼び出し元に平均値を返す
		return average;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean judgeNum(double db) {
		// 50以上ならtrueとなるブーリアン型変数を宣言
		boolean judge = db >= 50;
		// メソッド呼び出し元に真偽を返す
		return (judge);
	}

	/* 後で消す
	 * 戻り値
	 * メソッドのオーバーロード
	 * メソッドを組み合わせる
	 * 真偽値の戻り値
	 */

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		System.out.println("Q1:");
		str_int_marge("Hello JavaSE", 11);

		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		System.out.println("Q2:");
		calculate(7, 8);

		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		System.out.println("Q3:");
		int[] q3array = { 3, 87, 2, 3, 55 };
		arrayOut(q3array);

		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		System.out.println("Q4:");
		calculate(4.3, 9.5);

		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
		System.out.println("Q5:");
		int[] q5array = randomArrayOut(9);

		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		System.out.println("Q6:");
		double average = arrayAverageOut(q5array);

		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		System.out.println("Q7:");
		System.out.println(judgeNum(average));

	}
}