package Chapter2;

public class CharacterEX3 {
	public static void main(String[] args) {
		int a = 65;
		int b = -66;					
		
		char a2 = 65;
		//char b2 = -66;				//문자형 변수에 음수를 넣으면 오류가 발생하므로 주석 처리함
		
		System.out.println((char)a);
		System.out.println((char)b);	//정수형 변수 b는 음수이기 때문에 char형으로 출력할 경우 "알 수 없는 값" 인 "?"가 출력된다.
		System.out.println(a2);
	}
}
