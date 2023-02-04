package inputuser;

import java.util.Scanner;

public class user {
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			String line=scan.nextLine();
			System.out.println(line);
			 double x=scan.nextDouble();
			System.out.println(x);
			int value=scan.nextInt();
			/*while(value!=5)
			{
				value=scan.nextInt();
				System.out.println(value);
			}
			System.out.println("print5");
		}*/
	do {
		value=scan.nextInt();
		System.out.println(value);
	}
	while(value!=5);
	
}

