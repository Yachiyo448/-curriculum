package curriculum_1_23_question;

public class Main {

	public static void main(String[] args) {
		
		// 動物の情報を設定・取得するクラス
		AnimalInfo lion = new AnimalInfo();
		
		// 動物の名前・体長・速度をsetterメソッドから設定
		lion.setName("ライオン");
		lion.setHeight(2.1);
		lion.setSpeed(80);
		
		// 動物の名前・体長・速度をgetterメソッドから取得しコンソール出力
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getHeight() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
		
	}

}
