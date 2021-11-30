package Chapter2;

import java.io.*;

public class Chapter2Q4_1 {
	public static void main(String[]args) throws IOException {
		BufferedReader inbr = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 값을 입력하세요(정수) : ");
		int a = Integer.parseInt(inbr.readLine());
		System.out.print("두번째 값을 입력하세요(실수) : ");
		double b = Double.parseDouble(inbr.readLine());
		System.out.println("*두 수의 사칙연산*");
		System.out.println(a + " + " + b + " = " + (int)(a+b));
		System.out.println(a + " - " + b + " = " + (int)(a-b));
		System.out.println(a + " * " + b + " = " + (int)(a*b));
		System.out.println(a + " / " + b + " = " + (int)(a/b));
	}
}
