package package3.model.vo;

public class Horse extends Animal{
//�ʵ�
	private String locatlon;
	private String color;

	// �޼���
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

	// ������ : �⺻
	public Horse() {

	}

	// ������ : �ʼ�
	public Horse(String name, String kinds, String locatlon, String color) {
		super(name, kinds);
		this.locatlon = locatlon;
		this.color = color;
	}

	// @Override speak ������ͼ� ����ϱ�
	@Override
	public void speak() {
		System.out.println(super.toString() + " " +locatlon 
				+ "�� �����ϸ�, ������" + color + "�Դϴ�.");
}
}
