package Chapter2;

import java.io.*;

public class Chapter2Q4_1 {
	public static void main(String[]args) throws IOException {
		BufferedReader inbr = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° ���� �Է��ϼ���(����) : ");
		int a = Integer.parseInt(inbr.readLine());
		System.out.print("�ι�° ���� �Է��ϼ���(�Ǽ�) : ");
		double b = Double.parseDouble(inbr.readLine());
		System.out.println("*�� ���� ��Ģ����*");
		System.out.println(a + " + " + b + " = " + (int)(a+b));
		System.out.println(a + " - " + b + " = " + (int)(a-b));
		System.out.println(a + " * " + b + " = " + (int)(a*b));
		System.out.println(a + " / " + b + " = " + (int)(a/b));
	}
}
