package package3.model.vo;

// Animal extends
public class Rabbit extends Animal {
//�ʵ�
	private int weight;
	private String coler;
	
//�޼���
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
	
	//������ : �⺻
	public Rabbit() {
		
	}
	//������ : �ʼ� alt shift s o ������ ������ �θ�Ŭ������ �ִ� �ʵ� �߰�
	public Rabbit(String name, String kinds, int weight, String coler) {
		super(name, kinds);
		this.weight = weight;
		this.coler = coler;
	}
	
	//@Override speak ������ͼ� ����ϱ�
	@Override
	public void speak() {
		System.out.println(super.toString() + "�䳢�� ����" + weight + "�䳢�� ���� : "+ coler);
	}
}
