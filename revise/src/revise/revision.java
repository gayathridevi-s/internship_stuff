package revise;
class Person{
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
//	String name;
//	int age;
//	void speak() {
//		System.out.println("hello");
//		System.out.println("my name is "+name+"\n"+"my age is"+age);
//	}
//	int getAge() {
//		return age;
//	}
//	public String getName() {
//		return name;
//	}
//	public String setName(String name) {
//		this.name = name;
//		return name;
//	}
}
public class revision {
public static void main(String[] args) {
	Person person1=new Person();
	person1.setData(23);
	System.out.println(person1.getData());
//	Person person1 = new Person();
//	person1.name="Gayathri";
//	person1.age=23;
//	person1.speak();
//	System.out.println(person1.age);
//	Person person2 = new Person();
//	person2.name="anju";
//	person2.age=21;
//	person2.speak();
//	person2.getAge();
//	//person2.setName("koy");
//	System.out.println(person2.setName("koy"));
//	System.out.println(person2.getAge());
	
}
}
