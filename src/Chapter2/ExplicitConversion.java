package Chapter2;

public class ExplicitConversion {
	public static void main(String[]args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;	//dNum1�� fNum2�� �� ��ȯ(int) ���� �����̱� ������, 1+0�� �Ǿ� 1�� ��µ�
		int iNum4 = (int)(dNum1 + fNum2);		//dNum1�� fNum2�� ���� ���ϸ� 2.1�� �ǰ�, �� �� �� ��ȯ�ϸ� 2�� ��µ�
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
}
