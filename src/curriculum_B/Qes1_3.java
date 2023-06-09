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
		
		// コンソール入力用の変数を宣言
		Scanner scanner;
		
		// ユーザー名の変数を宣言
		String name;
		
		// ユーザー名が正しく入力されるまで繰り返す
		while (true) {
			
			// コンソール入力用のインスタンスを生成
			scanner = new Scanner(System.in);
			
			// ユーザー名にコンソールに入力した値を代入
			name = scanner.nextLine();
			
			// ユーザー名が10文字以上の場合、「名前を10文字以内にしてください」を出力
			if ( name.length() >= 10 ) {
				System.out.println("「名前を10文字以内にしてください」");
				
			// ユーザー名が0文字以下かnullの場合、「名前を入力してください」を出力
			} else if ( name.length() <= 0 || name == null ) {
					System.out.println("「名前を入力してください」");
					
					
			// ユーザー名が正規表現パターンに当てはまる場合、「半角英数字のみで名前を入力してください」を出力
			} else if ( name.matches("^[^A-Za-z0-9]+$")) {
						System.out.println("「半角英数字のみで名前を入力してください」");
					
			// 上記以外の場合、「ユーザー名「 (ユーザー名変数) 」を登録しました」を出力
			} else {
				System.out.println("ユーザー名「" + name + "」を登録しました\n");
				break;
			}
		}
			
		/* 問3-1
		 * じゃんけんのシステムを下記の条件で作成してください
		 * ・「0はグー、1：チョキ、2：パー」とすること
		 * ・じゃんけんに勝つまでループすること
		 * ・一回ごとに自分の手と相手の手を下記の通り出力してください
		 * 	ユーザー名「name」を登録しました
		 * 	nameの手は「パー」
		 * 	相手の手は「グー」
		 */
		
		// 自分のじゃんけんの手を配列で宣言
		String[] myHand = {"グー", "チョキ", "パー"};
		// 相手のじゃんけんの手を配列で宣言
		String[] hondaHand = {"グー", "チョキ", "パー"};
		
		// グー・チョキ・パーに対応する手の値を宣言（自分）
		int myHandVal;
		// グー・チョキ・パーに対応する手の値を宣言（相手）
		int hondaHandVal;
		
		// 勝つまでにかかった回数変数を宣言
		int count = 0;
		
		// 勝利フラグの宣言
		boolean youwin = false;
		
		// 勝利フラグがfalseの間は処理を繰り返す
		while (youwin == false) {
			
			// 自分が出す手をコンソールに入力（0:グー 1:チョキ 2:パー）
			while (true) {
			
			// メッセージを出力
			System.out.println("自分が出す手を決めてください（0:グー 1:チョキ 2:パー）");
			
			// コンソール入力用のインスタンスを生成・代入
			scanner = new Scanner(System.in);
			
			// コンソールに入力した文字列を代入
			String myHandStr = scanner.nextLine();
			
			// 入力内容が0～2以外の場合はエラーメッセージを出力
			if ( myHandStr.matches("^[^0-2]+$") || myHandStr.length() <= 0 || myHandStr == null ) {
				System.out.println("「0～2の数字を指定してください」");
			} else {
				
				// 文字列を整数型に変換し、添え字に代入
				myHandVal = Integer.valueOf(myHandStr);
				break;
			}
			
			}
			
			// 相手の手の値を乱数から生成
			hondaHandVal = (int)Math.floor(Math.random() * 3);
			
			// 自分の手をメッセージで出力
			System.out.println(name + "の手は「" + myHand[myHandVal] + "」");
			// 相手の手をメッセージで出力
			System.out.println("相手の手は「" + hondaHand[hondaHandVal] + "」\n");
			
			// 自分の手の値によって分岐
			switch (myHandVal) {
			
			// 自分の手が0（グー）の時：
			case 0:
				switch (hondaHandVal) {
				// 相手の手が0（グー）の時：
				case 0:
					// あいこ時のメッセージを出力
					System.out.println("DRAW あいこ もう一回しましょう！\n");
					break;
					
				// 相手の手が1（チョキ）の時：
				case 1:
					// 勝利時のメッセージを出力
					System.out.println("やるやん。\n"
							+ "次は俺にリベンジさせて\n");
					// 勝利フラグをtrueに変更
					youwin = true;
					break;
				
				// 相手の手が2（パー）の時：
				case 2:
					// パーに敗北時のメッセージを出力
					System.out.println("俺の勝ち！\n"
							+ "なんで負けたか、明日まで考えといてください。\n"
							+ "そしたら何かが見えてくるはずです\n");
					break;
				}
				break;
			
			// 自分の手が1（チョキ）の時：
			case 1:
				switch (hondaHandVal) {
				// 相手の手が0（グー）の時：
				case 0:
					// チョキに敗北時のメッセージを出力
					System.out.println("俺の勝ち！\n"
							+ "負けは次につながるチャンスです！\n"
							+ "ネバーギブアップ！\n");
					break;
					
				// 相手の手が1（チョキ）の時：
				case 1:
					// あいこ時のメッセージを出力
					System.out.println("DRAW あいこ もう一回しましょう！\n");
					break;
					
				// 相手の手が2（パー）の時：
				case 2:
					// 勝利時のメッセージを出力
					System.out.println("やるやん。\n"
							+ "次は俺にリベンジさせて\n");
					// 勝利フラグをtrueに変更
					youwin = true;
					break;
				}
				break;
				
			// 自分の手が2（パー）の時：
			case 2:
				switch (hondaHandVal) {
				// 相手の手が0（グー）の時：
				case 0:
					// 勝利時のメッセージを出力
					System.out.println("やるやん。\n"
							+ "次は俺にリベンジさせて\n");
					// 勝利フラグをtrueに変更
					youwin = true;
					break;
				
				// 相手の手が1（チョキ）の時：
				case 1:
					// グーに敗北時のメッセージを出力
					System.out.println("俺の勝ち！\n"
							+ "負けは次につながるチャンスです！\n"
							+ "ネバーギブアップ！\n");
					break;
					
				// 相手の手が2（パー）の時：
				case 2:
					// あいこ時のメッセージを出力
					System.out.println("DRAW あいこ もう一回しましょう！\n");
					break;
				}
				break;
			
			}
			
			// 勝利までの回数をインクリメント
			count++;
			
		}
		
		// 勝利までの回数をメッセージ出力
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");
	
		// プログラム終了時にscannerを閉じる
		scanner.close();
	
	}
	
}
