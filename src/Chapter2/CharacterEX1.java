package Chapter2;

public class CharacterEX1 {
	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);		//문자 출력
		System.out.println((int)ch1);	//문자에 해당하는 정수 값 출력(아스키 코드 값)
		
		char ch2 = 66;					//정수 값 대입
		System.out.println(ch2);		//정수 값에 해당하는 문자 출력
		
		int ch3 = 67;
		System.out.println(ch3);		//문자 정수 값 출력
		System.out.println((char)ch3);	//정수 값에 해당하는 문자 출력
		
		//아스키코드값 65 = A이고 여기서 32를 더한 값인 97을 넣어줄 경우, a가 출력됨
		
	}
}
