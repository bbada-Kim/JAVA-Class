package Chapter2;

public class CharacterEX2 {
	public static void main(String[] args) {
		char ch1 = '��';
		char ch2 = '\uD55C';		//'��'�̶�� ������ �����ڵ尪�̸� 16������ ǥ���ǰ� 16���� ���� �ϳ��� 4��Ʈ�� ���('D55C'�� �ش��)
									//�ѱ� �����ڵ�� www.unicode.org/charts/PDF/UAC.pdf���� Ȯ�� �����ϴ�.
		System.out.println(ch1);
		System.out.println(ch2);
	}
}
