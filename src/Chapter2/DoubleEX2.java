package Chapter2;

public class DoubleEX2 {
	public static void main(String[]args) {
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) {	//i�� 0���� 10000���� ũ�ų� ���� ������(10000��) ���ϱ� ����
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);			//�ε��Ҽ��� ����� �ణ�� ������ �߻��� �� �ִ�.
	}
}
