package algorithm;

import java.util.Scanner;

public class Codeup1025 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		
	        char[] b = a.toCharArray();
	        // String.toCharArray메소드로 char[] type으로 변환
	        System.out.println("[" + b[0]+"0000]");
	        System.out.println("[" + b[1]+"000]");
	        System.out.println("[" + b[2]+"00]");
	        System.out.println("[" + b[3]+"0]");
	        System.out.println("[" + b[4]+"]"); //출력
		}
		
		

	}

