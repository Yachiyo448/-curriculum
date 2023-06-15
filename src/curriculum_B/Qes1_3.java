package curriculum_B;

// コンソール入力用のクラスをインポート
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		/* 問1
		 * ログイン時の入力チェックシステムを下記条件で作成してください
		 * ・コンソールにユーザー名を入力できるようにしてください
		 * ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		 * ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		 * ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		 */

		/* 問2
		 * ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		 */

		/******************************************************
		 * ユーザー名を入力する処理
		 ******************************************************/

		// Scannerクラスを宣言
		Scanner scanner;

		// ユーザー名の変数を宣言
		String name;

		// やり直しフラグの宣言
		boolean redo = true;

		// ユーザー名が正しく入力されるまで繰り返す
		do {

			// コンソール入力用のインスタンスを生成
			scanner = new Scanner(System.in);

			// ユーザー名にコンソールに入力した値を代入
			name = scanner.nextLine();

			// ユーザー名がnullか0文字以下の場合、「名前を入力してください」を出力
			if (name == null || name.length() <= 0 ) {
				System.out.println("「名前を入力してください」");

				// ユーザー名が10文字以上の場合、「名前を10文字以内にしてください」を出力
			} else if ( name.length() >= 10 ) {
				System.out.println("「名前を10文字以内にしてください」");

				// ユーザー名が正規表現パターンに当てはまる場合、「半角英数字のみで名前を入力してください」を出力
			} else if ( name.matches("^[^A-Za-z0-9]+$")) {
				System.out.println("「半角英数字のみで名前を入力してください」");

				// 上記以外の場合、「ユーザー名「 (ユーザー名変数) 」を登録しました」を出力
			} else {
				System.out.println("ユーザー名「" + name + "」を登録しました\n");

				// 入力処理の終了
				redo = false;
			}
		} while (redo);

		/* 問3-1
		 * じゃんけんのシステムを下記の条件で作成してください
		 * ・「0はグー、1：チョキ、2：パー」とすること
		 * ・じゃんけんに勝つまでループすること
		 * ・一回ごとに自分の手と相手の手を下記の通り出力してください
		 * 	ユーザー名「name」を登録しました
		 * 	nameの手は「パー」
		 * 	相手の手は「グー」
		 */

		/******************************************************
		 * 自分のじゃんけんの手を入力する処理
		 ******************************************************/

		// じゃんけんの手を配列で宣言
		String[] hand = {"グー", "チョキ", "パー"};

		// グー・チョキ・パーに対応する手の値を宣言（自分）
		int myHandVal = 0;
		// グー・チョキ・パーに対応する手の値を宣言（相手）
		int hondaHandVal = 0;

		// 勝つまでにかかった回数変数を宣言
		int count = 0;

		// ループフラグの宣言
		boolean loop = true;


		// ループフラグがtrueの間は処理を繰り返す
		do {

			// やり直しフラグの再代入
			redo = true;

			// 自分が出す手をコンソールに入力（0:グー 1:チョキ 2:パー）
			do {

				// メッセージを出力
				System.out.println("自分が出す手を決めてください（0:グー 1:チョキ 2:パー）");

				// コンソール入力用のインスタンスを生成・代入
				scanner = new Scanner(System.in);

				// コンソールに入力した文字列を代入
				String myHandStr = scanner.nextLine();

				// 入力内容がnullか0～2以外か0文字以下の場合はエラーメッセージを出力
				if (myHandStr == null || !myHandStr.matches("[012]") || myHandStr.length() <= 0) {
					System.out.println("「0～2の数字を指定してください」\n");
				} else {

					// 文字列を整数型に変換し、添え字に代入
					myHandVal = Integer.valueOf(myHandStr);

					// 入力処理の終了
					redo = false;
				}

			} while (redo);

			/******************************************************
			 * 自分・相手のじゃんけんの手を出力する処理
			 ******************************************************/

			// 相手の手の値を乱数から生成
			hondaHandVal = (int)Math.floor(Math.random() * 3);

			// 自分の手をメッセージで出力
			System.out.println(name + "の手は「" + hand[myHandVal] + "」");
			// 相手の手をメッセージで出力
			System.out.println("相手の手は「" + hand[hondaHandVal] + "」\n");

			/* 問3-2
			 * ・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
			 * ・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください
			 * ・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
			 * ・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください
			 * ・あいこの場合、下記が出力されるようにしてください
			 * （全て出力例略）
			 * じゃんけんを行った回数を表示してください
			 * ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください
			 */

			/******************************************************
			 * じゃんけんの結果を出力する処理：
			 * 【勝利】勝利メッセージを出力し、ループを抜けて勝利までの回数を出力
			 * 【あいこ・敗北】専用メッセージを出力し、ループの最初に戻る
			 ******************************************************/

			// 自分・相手の手が同じ場合
			if (myHandVal == hondaHandVal) {
				// あいこ時のメッセージを出力
				System.out.println("DRAW あいこ もう一回しましょう！\n");


			} else if (myHandVal == 0 && hondaHandVal == 2) {
				// 自分がグー・相手がパーの場合のメッセージ出力
				System.out.println("俺の勝ち！\n"
						+ "なんで負けたか、明日まで考えといてください。\n"
						+ "そしたら何かが見えてくるはずです\n");

			} else if (myHandVal == 1 && hondaHandVal == 0) {
				// 自分がチョキ・相手がグーの場合のメッセージ出力
				System.out.println("俺の勝ち！\n"
						+ "負けは次につながるチャンスです！\n"
						+ "ネバーギブアップ！\n");

			} else if (myHandVal == 2 && hondaHandVal == 1) {
				// 自分がパー・相手がチョキの場合のメッセージ出力
				System.out.println("俺の勝ち！\n"
						+ "たかがじゃんけん、そう思ってないですか？\n"
						+ "それやったら次も、俺が勝ちますよ\n");
			} else {
				// 勝利時のメッセージを出力
				System.out.println("やるやん。\n"
						+ "次は俺にリベンジさせて\n");
				// ループフラグをfalseに変更
				loop = false;
			}

			// 勝利までの回数をインクリメント
			count++;

		} while (loop);

		// 勝利までの回数をメッセージ出力
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");

		// プログラム終了時にscannerを閉じる
		scanner.close();

	}

}
