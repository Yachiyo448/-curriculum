package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
		
		/* 問1
		 * 下記9個をローカル変数として宣言のみしてください
		・バイト型・短整数型・整数型・長整数型
		・単精度浮動小数点数型・倍精度浮動小数点数型
		・文字型・文字列型
		・ブーリアン型
		 */
		
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String str;
		boolean bool;
		
		/* 問2
		 * それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		 */
		
		b = 0;
		s = 0;
		i = 0;
		l = 0;
		f = 0f;
		d = 0;
		c = 'a';
		str = "";
		bool = true;
		
		/* 問3
		 * 初期化をしたそれぞれの変数に下記の値を代入してください
		 */
		
		b = 10;
		s = 100;
		i = 1000;
		l = 10000;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		str = "ハロー";
		bool = true;
		
		/* 問4
		 * 下記の通りにコンソール出力されるようにしてください
		上記で作成した変数を必ず使用すること
		11110
		20
		a ハロー true
		11130
		10000000000
		0.105
		-90
		 */
		
		System.out.println(b + s + i + l);
		System.out.println(b * 2);
		System.out.println(c + str + bool);
		System.out.println(b + s + i + l + f + d);
		System.out.println(b * s * i * l);
		System.out.println(d / s);
		System.out.println(b - s);
		
		/* 問5
		 * 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		　String num="20";
		　int num1=23;
		　System.out.println("ハローJAVA"+(num+num1));
		 */
		
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		
		/* 問6
		 * 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		ローカル変数に代入し○○に入れてください
		『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 */
		
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String favFood = "寿司";
		
		System.out.println("初めまして" + name +  "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favFood + "です");
		
		/* 問7
		 * 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		「BMIは○○です」
		ただし計算は数値を直書きせず、全て変数を使ってすること
		 */
		
		double bmi = weight / (height * height / 10000);
		System.out.println("BMIは" + bmi + "です");
		
		/* 問8
		 * 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		　初めまして鈴木一郎です
		　年齢は24歳です
		　身長168.5cmです
		　体重は64.2kgです
		　好きな食べ物はオムライスです
		　BMIは22.6です
		 */
		
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		favFood = "オムライス";
		bmi = weight / (height * height / 10000);
		
		System.out.println("初めまして" + name +  "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favFood + "です");
		System.out.println("BMIは" + bmi + "です");
		
		/* 問9
		 * 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		　初めまして鈴木一郎です
		　年齢は48歳です
		　身長337.0cmです
		　体重は128.4kgです
		　好きな食べ物はオムライスです
		　BMIは11.31です
		 */
		
		age += age;
		height += height;
		weight += weight;
		bmi = weight / (height * height / 10000);
		
		System.out.println("初めまして" + name +  "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favFood + "です");
		System.out.println("BMIは" + bmi + "です");
		
		/* 問10
		 * 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		 */
		
		System.out.println(age >= 25);
		
		/* 問11
		 * 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		 */
		
		String ageStr = age + "";
		String heightStr = height + "";
		String weightStr = weight + "";
		
		System.out.println(ageStr + heightStr + weightStr);
		
		/* 問12
		 * 11で変換した【年齢・身長】を整数型に変換して出力してください
		 */
		
		int ageInt = Integer.valueOf(ageStr);
		double heightDb = Double.valueOf(heightStr);
		
		System.out.println(ageInt);
		System.out.println((int)heightDb);
		
		/* 問13
		 * 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		ただしif文は使わないでください
		 */
		
		System.out.println(ageInt == 25 || heightDb >= 160);
	}
	
}
