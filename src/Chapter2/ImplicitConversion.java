package Chapter2;

public class ImplicitConversion {
	public static void main(String[]args) {
		byte bNum = 10;
		int iNum = bNum;			//����Ʈ ũ�Ⱑ ���� �ڷ������� ū �ڷ������� �ڵ� �� ��ȯ
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;			//�������� �Ǽ��� �ڵ� �� ��ȯ
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;			//�� ������ �ڷ������� �� ������ �ڷ������� �ڵ� �� ��ȯ
		System.out.println(dNum);
		
		//�� ����� �� ��ȯ ����
		
		int iNum3 = 1000;
		byte bNum3 = (byte)iNum3;	//����Ʈ ũ�Ⱑ ū �ڷ������� ���� �ڷ������� ������ ���, ����� �� ��ȯ �ʿ�
		
		System.out.println(iNum3);	
		System.out.println(bNum3);	//����� �� ��ȯ�� �Ͽ�����, byte �ڷ������� 1000�� �� ����� ������ ������ ���ڷ� ��µ�
	}
}
