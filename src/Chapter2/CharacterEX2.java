package Chapter2;

public class CharacterEX2 {
	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C';		//'한'이라는 글자의 유니코드값이며 16진수로 표현되고 16진수 숫자 하나가 4비트를 사용('D55C'에 해당됨)
									//한글 유니코드는 www.unicode.org/charts/PDF/UAC.pdf에서 확인 가능하다.
		System.out.println(ch1);
		System.out.println(ch2);
	}
}
