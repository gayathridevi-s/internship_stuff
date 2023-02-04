package objectclass;

class Frog{
	 private String name;
	 private int no;
	public String toString() {
		StringBuilder s=new StringBuilder();
		s.append(no).append(":").append(name);  //3: using that name and no values to get s and print it
		//System.out.println(s.toString());
		return s.toString();
	}
	public Frog(String name,int no) {
	this.name=name;     //   2:assigning the variables to lko and 8 by using this so that it reach the toString method
		this.no=no;
		
	}
	
}

public class study {
	public static void main(String[] args) {
		Frog frog1=new Frog("lko",8);       // 1:using  constructor calling,the given values reach up on constructor
		System.out.println(frog1);  //it will lead to toString method and s.toString is printed
System.out.println(frog1.toString());//both are same
}
}