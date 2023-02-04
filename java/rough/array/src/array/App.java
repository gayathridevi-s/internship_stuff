package array;
class Person{
	 String name;
	int age;
	void speak() {
		System.out.println("hello i am "+name+" my age is "+age);
	}
	int yearstoretirement() {
		return 65-age;
	}
	void give(String text) {
		System.out.println(text);
	}
		void write(String wr) {
			System.out.println(wr);
		}
		public void setName(String name) {
			
			System.out.println(name);
		}
	}

public class App {
	public static void main(String[] args) {
		Person person1=new Person();
		//person1.name= "gayu";
		//person1.age= 90;
		Person person2 =new Person();
		person2.name="aby";
		person2.age=2;
		person1.setName("gayathri");
		person1.speak();
		person2.speak();
				System.out.println(person2.name); 
				System.out.println(person1.age);
				person2.give("haiguy");
				String come="ghost";
				person2.write(come);
		int years =person2.yearstoretirement(); 
		System.out.println(years);
		
	}

}
