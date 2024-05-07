package package3.model.vo;


//abstract �߻� �޼��带 ���� ���ؼ��� class�� �߻�Ŭ���� �̾������ ����Ҽ� ����
public abstract class Animal {

//�ʵ�
	private String name;
	private String kinds;
	//�޼���
		//Setter
	
	public void setName(String name) {
		this.name = name;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	//Getter
	public String getName() {
		return name;
	}
	public String getKinds() {
		return kinds;
	}
	
	//������ : �⺻ ctrl + space enter
	public Animal() {
		
	}
	//������ : �ʼ� art + shift s o
	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}
	
	//toString
	@Override // javaAPI String to String
	public String toString() {
		return "���� �̸���" + name + "�̰�, ������" + kinds + "�Դϴ�.";
	}
	
	public abstract void speak();
}
