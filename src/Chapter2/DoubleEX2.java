package Chapter2;

public class DoubleEX2 {
	public static void main(String[]args) {
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) {	//i가 0에서 10000보다 크거나 같을 때까지(10000번) 더하기 실행
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);			//부동소수점 방식은 약간의 오차가 발생할 수 있다.
	}
}
