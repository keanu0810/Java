import java.util.Scanner;

public class VariableScan {

	public static void main(String[] args) {
		//����ڿ��� �Է¹��� ������ ����
		//Scanner�� �̿��ؼ� �Է¹��� ������ ��ǻ�Ϳ� ǥ������
		//System.in ����ؼ� Ű���� �Է��� �о�� �� ���
		// Scanner �ڷ��� �ڸ��� int�� String�̳� �Ǽ� boolean����
		// Ȯ����� ��Ÿ�� �� ���� ������ �ʵ�Դ� Scanner��� ���
		// nextLine() : ���� �Ǵ� ���͸� ġ�� �������� ���� ��ü�� �Է� �޴´�.
		// �Էµ� ���ڸ� ��� �� �����´�. (����, Ư������ ��� ��� ������)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("������� ��� ���� �Է��ϼ���");
		String live = sc.nextLine();
		System.out.println(live);
		
		System.out.println("������� �ڵ������θ� �Է��ϼ���.");
		String phoneNumber = sc.nextLine();
		System.out.println(phoneNumber);
		
		//Scanner String�� ����ؼ�
		// ������� Ű, ������� ����, ������� �г����� �Է¹ޱ�
		
		// ������� ŰString height
		// ������� ���� String age
		// ������� �г��� String nickName
		
		System.out.print("������� Ű�� �Է����ּ���.");
		String height = sc.nextLine();
		System.out.println(height);
		
		System.out.println("������� ���̸� �Է����ּ���.");
		String age = sc.nextLine();
		System.out.println(age);
		
		System.out.print("�ÿ����� �г����� �Է����ּ���.");
		String nickName = sc.nextLine();
		System.out.println(nickName);
		
		
		
		
		

	}

}
