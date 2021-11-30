package Chapter2;

public class Constant {
	public static void main(String[]args) {
		final int MAX_NUM = 100;		//상수를 사용하는 이유 = 해당 값만 바꾸면 해당 상수를 사용하는 곳에서 모든 값이 바뀌기 때문에 편리
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000; → 상수는 값을 변경할 수 없기 때문에 오류 발생함(주석 처리)
	}
}
