package Chapter2;

public class Chapter2Q4 {
	public static void main(String[]args) {
		double dNum = 2.0;
		int iNum = 10;
		
		int iNum1 = (int) (iNum + dNum);
		int iNum2 = (int) (iNum - dNum);
		int iNum3 = (int) (iNum * dNum);
		int iNum4 = (int) (iNum / dNum);
		System.out.println(iNum1);
		System.out.println(iNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		System.out.println(iNum + "+" +dNum+ "=" +(int)(iNum+dNum));
		
	}
}
