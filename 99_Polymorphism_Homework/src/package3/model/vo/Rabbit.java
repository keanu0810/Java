package package3.model.vo;

// Animal extends
public class Rabbit extends Animal {
//필드
	private int weight;
	private String coler;
	
//메서드
	//Setter	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColer(String coler) {
		this.coler = coler;
	}
	//Getter
	public int getWeight() {
		return weight;
	}
	public String getColer() {
		return coler;
	}
	
	//생성자 : 기본
	public Rabbit() {
		
	}
	//생성자 : 필수 alt shift s o 선택한 다음에 부모클래스에 있는 필드 추가
	public Rabbit(String name, String kinds, int weight, String coler) {
		super(name, kinds);
		this.weight = weight;
		this.coler = coler;
	}
	
	//@Override speak 가지고와서 출력하기
	@Override
	public void speak() {
		System.out.println(super.toString() + "토끼의 무게" + weight + "토끼의 색상 : "+ coler);
	}
}
