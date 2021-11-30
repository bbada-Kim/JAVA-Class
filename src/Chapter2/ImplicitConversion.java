package Chapter2;

public class ImplicitConversion {
	public static void main(String[]args) {
		byte bNum = 10;
		int iNum = bNum;			//바이트 크기가 작은 자료형에서 큰 자료형으로 자동 형 변환
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;			//정수에서 실수로 자동 형 변환
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;			//덜 정밀한 자료형에서 더 정밀한 자료형으로 자동 형 변환
		System.out.println(dNum);
		
		//↓ 명시적 형 변환 예제
		
		int iNum3 = 1000;
		byte bNum3 = (byte)iNum3;	//바이트 크기가 큰 자료형에서 작은 자료형으로 대입할 경우, 명시적 형 변환 필요
		
		System.out.println(iNum3);	
		System.out.println(bNum3);	//명시적 형 변환을 하였지만, byte 자료형에서 1000을 다 못담기 때문에 엉뚱한 숫자로 출력됨
	}
}
