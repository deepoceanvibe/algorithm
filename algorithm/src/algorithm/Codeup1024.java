package algorithm;

import java.util.Scanner;

public class Codeup1024 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		for(int i = 0; i < word.length(); i++) {
			System.out.println("'" + word.charAt(i) + "'");
		}

	}

}
