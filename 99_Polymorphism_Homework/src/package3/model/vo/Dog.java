package package3.model.vo;

public class Dog extends Animal {
	public static final String PLACE = "애견카페";
	private int weight;

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

//생성자 : 기본
	public Dog() {
		// TODO Auto-generated constructor stub
	}

public Dog(String name, String kinds, int weight) {
	super(name, kinds); //Ainmal 밑에 이미있는 name kinds를 바라보게 하기 위해서
	this.weight = weight;
}

//@Override speak ctel + space
@Override
public void speak() {
	System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
	
}

//생성자 : 필수
	

}
