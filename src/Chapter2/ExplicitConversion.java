package Chapter2;

public class ExplicitConversion {
	public static void main(String[]args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;	//dNum1과 fNum2의 형 변환(int) 이후 연산이기 때문에, 1+0이 되어 1이 출력됨
		int iNum4 = (int)(dNum1 + fNum2);		//dNum1과 fNum2를 먼저 더하면 2.1이 되고, 그 후 형 변환하면 2가 출력됨
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
}
