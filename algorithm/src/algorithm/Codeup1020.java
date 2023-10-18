package algorithm;

import java.util.Scanner;

public class Codeup1020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String birth = scan.next();
		
		String result = birth.replace("-", "");
		System.out.println(result);
	}

}
