package algorithm;

import java.util.Scanner;

public class Codeup1023 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] number = scan.next().split("\\.");
		
		int integerPart = Integer.parseInt(number[0]);
		int fractionPart = Integer.parseInt(number[1]);
		
		System.out.println(integerPart);
		System.out.println(fractionPart);

	}
}
