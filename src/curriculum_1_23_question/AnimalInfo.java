package curriculum_1_23_question;

public class AnimalInfo {

	// フィールドを宣言
	// 名前
	private String name;
	// 体長(m)
	private double height;
	// 速度(km/h)
	private int speed;

	// コンストラクタ
	public AnimalInfo() {
	}

	// setterメソッド

	/**
	 * 動物の名前を設定
	 * @param animalName 動物名
	 */
	public void setName(String animalName) {
		this.name = animalName;
	}

	/**
	 * 動物の体長(m)を設定
	 * @param animalHeight 動物の体長
	 */
	public void setHeight(double animalHeight) {
		this.height = animalHeight;
	}

	/**
	 * 動物の速度(km/h)を設定
	 * @param animalSpeed 動物の速度
	 */
	public void setSpeed(int animalSpeed) {
		this.speed = animalSpeed;
	}

	// getterメソッド

	/**
	 * 動物の名前を取得
	 * @return 動物の名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 動物の体長(m)を取得
	 * @return 動物の体長
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * 動物の速度(km/h)を取得
	 * @return 動物の速度
	 */
	public int getSpeed() {
		return speed;
	}

}
