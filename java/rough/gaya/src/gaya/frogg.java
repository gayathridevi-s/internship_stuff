package gaya;
class Frog{
	String name;   //instance variable
	static String desk;   //static variable
	int age;
	public static int count;
	final static int LUCKY_NUMBER=9;   //final keyword whose value cannot be changed
	public  Frog() {                 //constructor 1   //constructor does not has void or return type
		System.out.println("first");
		count++;
	}
		public Frog(String name) {             //constructor 2
			
			this("anitta",4);                 //calling constructor 3 in constructor 2,it has to be on first line
			System.out.println("second");
			
			
			
		}
		public Frog(String name,int age) {             //constructor 3
			System.out.println("third");
		}
		public void ruth() {
		System.out.println("hello "+name+" this is method without static");
		System.out.println(desk+ ":"+ name);
		}
			public static void gthr() {              //method using static 
			System.out.println("this is method with static");
			//it won't work:    system.out.println(name);  //static method cannot output instance variable
		}
			
			
	}

public class frogg {
	public static void main(String[]args) {
		System.out.println("before calling object count is "+ Frog.count);
		Frog frog1=new Frog();    //simply writing this will access constructor
Frog frog2=new Frog("go");   //another way of accessing constructor2,

frog1.name="kittu";//accessing instance variable name by using object frog1
frog2.name="mittu";
Frog.desk="lol";          //accessing static variable desk using class Frog
System.out.println(Frog.desk); //printing static variable value
System.out.println(frog1.name);   //printing instance variable value

new Frog();     //accessing constructor1
new Frog("hello");    //accessing constructor 2
new Frog("guy",5);    //accessing constructor3
System.out.println("after calling object count is "+ Frog.count);
Frog.gthr();    //accessing static method using class
frog1.ruth();   //accessing method using object frog1
frog2.ruth();    //accessing method using object frog2
System.out.println(Math.PI);
System.out.println(Frog.LUCKY_NUMBER);
}
}