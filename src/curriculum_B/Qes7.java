package curriculum_B;

//コンソール入力用のクラスをインポート
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		/* 問7
		 * N人の生徒の成績を管理するプログラムを下記条件で作成してください
		 * ・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
		 * ・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
		 * ・このプログラムの実行は必ず1回以上行われるようにしてください
		 * ・出力例を参考にプログラミングを作成してください
		 */

		/******************************************************
		 * 生徒の人数を入力する処理
		 ******************************************************/

		// コンソール入力用の変数を宣言
		Scanner scanner;
		// 入力内容を保存する文字列を宣言
		String input;
		// 生徒人数を宣言
		int studentNum = 0;
		// 教科の数を宣言
		final int SUBJECT_NUM = 4;

		// やり直しフラグの宣言
		boolean redo = true;

		do {

			// メッセージを出力
			System.out.print("生徒の人数を入力してください（2以上）：");

			// コンソール入力用のインスタンスを生成
			scanner = new Scanner(System.in);
			// コンソールに入力した値を代入
			input = scanner.nextLine();


			// 入力内容が数字以外の場合はエラーメッセージを出力
			if ( input == null || !input.matches("[0-9]+")) {
				System.out.println("「数字を入力してください」\n");
			} else {

				// 入力した文字列から生徒人数に変換
				studentNum = Integer.valueOf(input);

				// 生徒人数が2未満の場合はエラーメッセージを出力
				if ( studentNum < 2 ) {
					System.out.println("「2以上の数字を入力してください」\n");
				} else {

					// 入力処理を終了
					System.out.print("\n");
					redo = false;

				}

			}
		} while (redo);

		/******************************************************
		 * 各生徒の成績を入力する処理
		 ******************************************************/

		// 生徒の点数を格納する配列を宣言
		int[][] studentScore = new int[studentNum][SUBJECT_NUM];
		// 添え字に対応する教科の文字列を宣言
		String[] subject = {"英語","数学","理科","社会"};

		// 入力毎に配列に点数を格納
		for (int i = 0; i < studentNum; i++) {

			for (int j = 0; j < SUBJECT_NUM; j++) {

				// やり直しフラグの再代入
				redo = true;

				do {
					// 教科ごとに点数を入力
					System.out.print((i + 1) + "人目の『" + subject[j] + "』の点数を入力してください :");

					// コンソール入力用のインスタンスを生成
					scanner = new Scanner(System.in);
					// コンソールに入力した値を代入
					input = scanner.nextLine();

					// 入力内容が数字以外の場合はエラーメッセージを出力
					if ( input == null || !input.matches("[0-9]+")) {
						System.out.println("「数字を入力してください」\n");
					} else {
						// 入力した文字列から点数に変換
						int score = Integer.valueOf(input);

						// 点数を配列に代入
						studentScore[i][j] = score;

						// 入力処理の終了
						redo = false;
					}

				} while(redo);

			}

			// 改行を出力
			System.out.print("\n");

		}

		/******************************************************
		 * 平均点を生徒・教科・全体で出力する処理
		 ******************************************************/

		// 各生徒の平均点を格納する配列を宣言
		double[] aveStudent = new double[studentNum];
		// 各教科の平均点を格納する配列を宣言
		double[] aveSubject = new double[SUBJECT_NUM];
		// 全体の平均点を格納する配列を宣言

		// 各生徒の平均点を計算し出力
		for (int i = 0; i < studentNum; i++) {

			// 合計点を格納する変数を宣言
			int sum = 0;

			// 配列内の点数を合計
			for (int j = 0; j < SUBJECT_NUM; j++) {
				sum += studentScore[i][j];
			}

			// 合計点を教科数で割り、平均点を算出
			aveStudent[i] = (double)sum / (double)SUBJECT_NUM;

			// 出力するテキストをフォーマットに従い生成
			String message = String.format("%d人目の平均点は %.2f 点です。", i + 1, aveStudent[i]);
			System.out.println(message);

		}

		// 改行を出力
		System.out.print("\n");

		// 各教科の平均点を計算し出力
		for (int i = 0; i < SUBJECT_NUM; i++) {

			// 合計点を格納する変数を宣言
			int sum = 0;

			// 配列内の点数を合計
			for (int j = 0; j < studentNum; j++) {
				sum += studentScore[j][i];
			}

			// 合計点を生徒数で割り、平均点を算出
			aveSubject[i] = (double)sum / (double)studentNum;

			// 出力するテキストをフォーマットに従い生成
			String message = String.format("%sの平均点は %.2f 点です。", subject[i], aveSubject[i]);
			System.out.println(message);

		}

		// 全体の合計点を格納する変数を宣言
		int sumAll = 0;

		// 全体の平均点を計算し出力
		for (int i = 0; i < studentNum; i++) {

			// 配列内の点数を合計
			for (int j = 0; j < SUBJECT_NUM; j++) {
				sumAll += studentScore[i][j];
			}

		}

		// 合計点を教科数で割り、平均点を算出
		double aveAll = (double)sumAll / (double)(studentNum * SUBJECT_NUM);

		// 出力するテキストをフォーマットに従い生成
		String message = String.format("全体の平均点は %.2f 点です。", aveAll);
		System.out.println(message);

		// プログラム終了時にscannerを閉じる
		scanner.close();

	}
}
