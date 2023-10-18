package algorithm;

import java.util.Scanner;

// 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
public class Codeup1019 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String date = scan.next();
		
		String[] dateParts = date.split("\\.");
		
		int year = Integer.parseInt(dateParts[0]);
		int month = Integer.parseInt(dateParts[1]);
		int day = Integer.parseInt(dateParts[2]);
		
		String result = String.format("%04d.%02d.%02d", year, month, day);
		System.out.println(result);
		
	}

}
