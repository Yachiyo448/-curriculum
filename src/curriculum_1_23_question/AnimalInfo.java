package curriculum_1_23_question;

public class AnimalInfo {
	
	// フィールド
	private String name = "";	// 名前
	private double height = 0.0d;	// 体長
	private int speed = 0;	// 速度
	
	// setterメソッド

	/**
	 * 動物の名前を設定します。
	 * @param animalName 動物名
	 */
	public void setName(String animalName) {
		this.name = animalName;
	}
	
	/**
	 * 動物の体長(m)を設定します。
	 * @param animalHeight 動物の体長
	 */
	public void setHeight(double animalHeight) {
		this.height = animalHeight;
	}
	
	/**
	 * 動物の速度(km/h)を設定します。
	 * @param animalSpeed 動物の速度
	 */
	public void setSpeed(int animalSpeed) {
		this.speed = animalSpeed;
	}
	
	// getterメソッド
	
	/**
	 * 動物の名前を取得します。
	 * @return 動物の名前
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 動物の体長(m)を取得します。
	 * @return 動物の体長
	 */
	public double getHeight() {
		return this.height;
	}

	/**
	 * 動物の速度(km/h)を取得します。
	 * @return 動物の速度
	 */
	public int getSpeed() {
		return this.speed;
	}

}
