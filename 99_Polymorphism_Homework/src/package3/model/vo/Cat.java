package package3.model.vo;

public class Cat extends Animal {
//�ʵ�
	private String location;
	private String color;

//�޼���
	// Setter
	public void setLocation(String location) {
		this.location = location;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Getters
	public String getLocation() {
		return location;
	}

	public String getColor() {
		return color;
	}

	// ������ : �⺻
	public Cat() {

	}

	// ������ : �ʼ�
	public Cat(String name, String kids, String location, String color) {
		super(name, kids);
		this.location = location;
		this.color = color;
	}

	// @Override
	@Override
	public void speak() {
		System.out.println(super.toString() + " " + location + "�� �����ϸ�, ������ " + color + "�Դϴ�.");
	}

}
