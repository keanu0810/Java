package package3.model.vo;

public class Dog extends Animal {
	public static final String PLACE = "�ְ�ī��";
	private int weight;

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

//������ : �⺻
	public Dog() {
		// TODO Auto-generated constructor stub
	}

public Dog(String name, String kinds, int weight) {
	super(name, kinds); //Ainmal �ؿ� �̹��ִ� name kinds�� �ٶ󺸰� �ϱ� ���ؼ�
	this.weight = weight;
}

//@Override speak ctel + space
@Override
public void speak() {
	System.out.println(super.toString() + "�����Դ� " + weight + "kg �Դϴ�.");
	
}

//������ : �ʼ�
	

}
