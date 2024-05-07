package package3.model.vo;

public class Horse extends Animal{
//필드
	private String locatlon;
	private String color;

	// 메서드
	// Setter
	public void setLocatlon(String locatlon) {
		this.locatlon = locatlon;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Getter
	public String getLocatlon() {
		return locatlon;
	}

	public String getColor() {
		return color;
	}

	// 생성자 : 기본
	public Horse() {

	}

	// 생성자 : 필수
	public Horse(String name, String kinds, String locatlon, String color) {
		super(name, kinds);
		this.locatlon = locatlon;
		this.color = color;
	}

	// @Override speak 가지고와서 출력하기
	@Override
	public void speak() {
		System.out.println(super.toString() + " " +locatlon 
				+ "에 서식하며, 색상은" + color + "입니다.");
}
}
