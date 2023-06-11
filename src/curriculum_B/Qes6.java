package curriculum_B;

// Map（連想配列）用のクラスをインポート
import java.util.HashMap;
// コンソール入力用のクラスをインポート
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
		/* 問6
		 * 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		 * ・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
		 * ・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
		 * ・テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 
		 * ・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字
		 * ・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
		 * ・入力された値は「、」区切りで指定してください
		 * ・そのほかの値が入力された場合下記を出力されるようにしてください
		 * 		『受け取った値』は指定の商品ではありません
		 * ・残り台数は0〜11までのランダムな値が出力されるようにしてください
		 */
		
		/******************************************************
		 * 0～11のランダムな値を各商品の残り台数に代入
		 ******************************************************/
		
		// 各商品の残り台数を格納する配列を宣言
		HashMap<String, Integer> goods = new HashMap<>();
		
		goods.put("パソコン", (int)Math.floor(Math.random() * 12));
		goods.put("冷蔵庫", (int)Math.floor(Math.random() * 12));
		goods.put("扇風機", (int)Math.floor(Math.random() * 12));
		goods.put("洗濯機", (int)Math.floor(Math.random() * 12));
		goods.put("加湿器", (int)Math.floor(Math.random() * 12));
		goods.put("テレビ", (int)Math.floor(Math.random() * 12));
		
				
		// メッセージを出力
		System.out.println("商品名を入力してください");
		// コンソール入力用のインスタンスを生成
		Scanner scanner = new Scanner(System.in);
		
		// ユーザー名にコンソールに入力した値を代入
		String input = scanner.nextLine();
		
		// 入力した文字列を"、"で分割
		String[] inputArr = input.split("、");
		
		for (String goodsName : inputArr) {
			
			switch (goodsName) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(goodsName + "の残り台数は" + goods.get(goodsName) + "台です\n");
				break;
				
			case "テレビ":
			case "ディスプレイ":
				int displayCount = 11 - goods.get("テレビ");
				System.out.println(goodsName.equals("テレビ") ? "テレビの残り台数は" + goods.get("テレビ") + "台です\n" : "ディスプレイの残り台数は" + displayCount + "台です\n");
				break;
				
			default:
				System.out.println("『" + goodsName + "』は指定の商品ではありません\n");
				break;
			}
			
		}
		
		scanner.close();
	
	}
	
}
