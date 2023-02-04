package switchstudy;

import java.util.Scanner;

public class prgrm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		String line=scanner.nextLine();
		switch(line) {
		case "start":
			System.out.println("system is started");
			break;
		case "stop":
			System.out.println("system is ended");
			break;
		default:
			System.out.println("system is not recognized");
		}
		
	}

}
