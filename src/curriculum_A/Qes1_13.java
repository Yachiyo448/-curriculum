package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
		
		/* 問1
		 * 下記9個をローカル変数として宣言のみしてください
		 * ・バイト型・短整数型・整数型・長整数型
		 * ・単精度浮動小数点数型・倍精度浮動小数点数型
		 * ・文字型・文字列型
		 * ・ブーリアン型
		 */
		
		byte by;		// バイト型を宣言
		short sh;		// 短整数型を宣言
		int in;			// 整数型を宣言
		long lo;		// 長整数型を宣言
		float fl;		// 単精度浮動小数点型を宣言
		double db;		// 倍精度浮動小数点型を宣言
		char ch;		// 文字型を宣言
		String str;		// 文字列型を宣言
		boolean bool;	// ブーリアン型を宣言
		
		/* 問2
		 * それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		 */
		
		by = 0;			// バイト型の初期値0を代入
		sh = 0;			// 短整数型の初期値0を代入
		in = 0;			// 整数型の初期値0を代入
		lo = 0L;		// 長整数型の初期値0Lを代入
		fl = 0.0f;		// 単精度浮動小数点型の初期値0.0fを代入
		db = 0.0d;		// 倍精度浮動小数点型の初期値0.0dを代入
		ch = '\u0000';	// 文字型の初期値\u0000を代入
		str = null;		// 文字列型の初期値nullを代入
		bool = false;	// ブーリアン型の初期値false（偽）を代入
		
		/* 問3
		 * 初期化をしたそれぞれの変数に下記の値を代入してください
		 */
		
		by = 10;		// 10を代入
		sh = 100;		// 100を代入
		in = 1000;		// 1000を代入
		lo = 10000L;	// 10000Lを代入
		fl = 9.5f;		// 9.5fを代入
		db = 10.5d;		// 10.5dを代入
		ch = 'a';		// aを代入
		str = "ハロー";	// ハローを代入
		bool = true;	// true（真）を代入
		
		/* 問4
		 * 下記の通りにコンソール出力されるようにしてください
		 * 上記で作成した変数を必ず使用すること
		 * 11110
		 * 20
		 * a ハロー true
		 * 11130
		 * 10000000000
		 * 0.105
		 * -90
		 */
		
		System.out.println(by + sh + in + lo);					// +による変数の和算をし、コンソール出力
		System.out.println(by + by);							// 同じ変数どうしの和算をし、コンソール出力
		System.out.println(ch + " " +  str + " " + bool);		// 文字列・ブーリアン型どうしを連結をし、コンソール出力
		System.out.println((int)(by + sh + in + lo + fl + db));	// (int)を用いて強制型変換し、整数表示にしてコンソール出力
		System.out.println(by * sh * in * lo);					// *による変数の乗算をし、コンソール出力
		System.out.println(db / sh);							// /による変数の除算をし、コンソール出力
		System.out.println(by - sh);							// -による変数の減算をし、コンソール出力
		
		System.out.println();									// 改行としてコンソール出力
		
		/* 問5
		 * 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		 * 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		 * 　String num="20";
		 * 　int num1=23;
		 * 　System.out.println("ハローJAVA"+(num+num1));
		 */
		
		int num = 20;										// 整数型でnumを宣言し、20を代入
		int num1 = 23;										// 整数型でnumを宣言し、20を代入
		System.out.println("ハローJAVA" + (num + num1));	// "ハローJAVA"とnum + num1の結果を連結し、コンソール出力
		
		System.out.println();								// 改行としてコンソール出力
		
		/* 問6
		 * 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 * ローカル変数に代入し○○に入れてください
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 */
		
		String name = "山田太郎";	// 文字列型で変数を宣言し、代入
		int age = 18;				// 整数型で変数を宣言し、代入
		double height = 170.5;		// 倍精度浮動小数点型で変数を宣言し、代入
		double weight = 62.2;		// 倍精度浮動小数点型で変数を宣言し、代入
		String favFood = "寿司";	// 文字列型で変数を宣言し、代入
		
		System.out.println("初めまして" + name +  "です");			// 変数と連結した文字列をコンソール出力
		System.out.println("年齢は" + age + "歳です");				// 変数と連結した文字列をコンソール出力
		System.out.println("身長は" + height + "cmです");			// 変数と連結した文字列をコンソール出力
		System.out.println("体重は" + weight + "kgです");			// 変数と連結した文字列をコンソール出力
		System.out.println("好きな食べ物は" + favFood + "です");	// 変数と連結した文字列をコンソール出力
		
		System.out.println();					// 改行としてコンソール出力
		
		/* 問7
		 * 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		 * 「BMIは○○です」
		 * ただし計算は数値を直書きせず、全て変数を使ってすること
		 */
		
		double height_m = height / 100;							// 身長をm表記にした変数を宣言
		double bmi = weight / (height_m * height_m);			// 体重(kg)÷(身長(m)×身長(m))をBMIに代入し宣言
		double bmi_ceil = (double)Math.round(bmi * 10) / 10;	// BMIの小数点第2位を切り上げて代入し宣言
		System.out.println("BMIは" + bmi_ceil + "です");		// 変数と連結した文字列をコンソール出力

		System.out.println();					// 改行としてコンソール出力
		
		/* 問8
		 * 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		 * 　初めまして鈴木一郎です
		 * 　年齢は24歳です
		 * 　身長168.5cmです
		 * 　体重は64.2kgです
		 * 　好きな食べ物はオムライスです
		 * 　BMIは22.6です
		 */
		
		name = "鈴木一郎";								// 変数nameに再代入
		age = 24;										// 変数ageに再代入
		height = 168.5;									// 変数heightに再代入
		weight = 64.2;									// 変数weightに再代入
		favFood = "オムライス";							// 変数favFoodに再代入
		height_m = height / 100;						// 身長をm表記にした変数を再代入
		bmi = weight / (height_m * height_m);			// 体重(kg)÷(身長(m)×身長(m))をBMIに再代入
		bmi_ceil = (double)Math.round(bmi * 10) / 10;	// BMIの小数点第2位を切り上げて再代入
		
		System.out.println("初めまして" + name +  "です");			// 変数と連結した文字列をコンソール出力
		System.out.println("年齢は" + age + "歳です");				// 変数と連結した文字列をコンソール出力
		System.out.println("身長は" + height + "cmです");			// 変数と連結した文字列をコンソール出力
		System.out.println("体重は" + weight + "kgです");			// 変数と連結した文字列をコンソール出力
		System.out.println("好きな食べ物は" + favFood + "です");	// 変数と連結した文字列をコンソール出力
		System.out.println("BMIは" + bmi_ceil + "です");			// 変数と連結した文字列をコンソール出力
		
		System.out.println();					// 改行としてコンソール出力
		
		/* 問9
		 * 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		 * 　初めまして鈴木一郎です
		 * 　年齢は48歳です
		 * 　身長337.0cmです
		 * 　体重は128.4kgです
		 * 　好きな食べ物はオムライスです
		 * 　BMIは11.31です
		 */
		
		age += age;											// 変数ageにageを加算し再代入
		height += height;									// 変数heightにheightを加算し再代入
		weight += weight;									// 変数weightにweightを加算し再代入
		height_m = height / 100;							// 身長をm表記にした変数を再代入
		bmi = weight / (height_m * height_m);				// 体重(kg)÷(身長(m)×身長(m))をBMIに再代入
		bmi_ceil = (double)Math.round(bmi * 100) / 100;		// BMIの小数点第3位を切り上げて再代入
		
		System.out.println("初めまして" + name +  "です");			// 変数と連結した文字列をコンソール出力
		System.out.println("年齢は" + age + "歳です");				// 変数と連結した文字列をコンソール出力
		System.out.println("身長は" + height + "cmです");			// 変数と連結した文字列をコンソール出力
		System.out.println("体重は" + weight + "kgです");			// 変数と連結した文字列をコンソール出力
		System.out.println("好きな食べ物は" + favFood + "です");	// 変数と連結した文字列をコンソール出力
		System.out.println("BMIは" + bmi_ceil + "です");					// 変数と連結した文字列をコンソール出力
		
		System.out.println();					// 改行としてコンソール出力
		
		/* 問10
		 * 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		 */
		
		age = 24;								// 変数ageに再代入
		System.out.println(age >= 25);			// ageが25以上ならtrue、それ以外ならfalseとなる条件式をコンソール出力
		
		System.out.println();					// 改行としてコンソール出力
		
		/* 問11
		 * 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		 */
		
		String ageStr = String.valueOf(age);				// 整数型の変数ageを文字列型に変換して宣言
		String heightStr = String.valueOf(height);			// 倍精度浮動小数点型の変数heightを文字列型に変換して宣言
		String weightStr = String.valueOf(weight);			// 倍精度浮動小数点型の変数weightを文字列型に変換して宣言
		
		System.out.println(ageStr + heightStr + weightStr);	// 文字列型変数を連結し、コンソール出力
		
		System.out.println();					// 改行としてコンソール出力
		
		/* 問12
		 * 11で変換した【年齢・身長】を整数型に変換して出力してください
		 */
		
		int ageInt = Integer.valueOf(ageStr);			// 文字列型の変数ageStrを整数型に変換して宣言
		double heightDb = Double.valueOf(heightStr);	// 文字列型の変数heightStrを倍精度浮動小数点型に変換して宣言
		int heightInt = (int)heightDb;					// 倍精度浮動小数点型の変数heightDbを整数型に変換して宣言
		
		System.out.println(ageInt);						// 変数ageIntをコンソール出力
		System.out.println(heightInt);					// 変数heightIntをコンソール出力
		
		System.out.println();					// 改行としてコンソール出力
		
		/* 問13
		 * 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		 * ただしif文は使わないでください
		 */

		System.out.println(ageInt == 25 || heightInt >= 160);	// ageIntが25と等しいか、heightIntが160以上の場合、trueが出力される条件式をコンソール出力
		
	}
	
}
