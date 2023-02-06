package browserrough;

import java.util.Scanner;

class Brow{
	private static String[] url;
	public Brow(){
		
	}
	public Brow(String [] url) {
		this.url=url;
	}
	public  void setUrl(String[] url) {
		this.url = url;
	}
	public void show() {
		for(int i=0;i<4;i++) {
			System.out.println(url[i]);
		}
		
	}
	
}
class Browser{
	

	public static void main(String[] args) {
	String[] a = new String[4];

	for(int i=0;i<4;i++)
	{
		Scanner s =new Scanner(System.in);
		a[i]=s.nextLine();
	
	}
	Brow browser1 = new Brow();
	browser1.setUrl(a);
	new Brow(a);
	browser1.show();
}
}