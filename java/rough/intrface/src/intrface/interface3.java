package intrface;

public class interface3 implements inter{
	@Override
	public void showInfo() {
		System.out.println("name"+name);
		
	}
	private String name;
	public interface3(String name) {
		this.name=name;
	}
public void gain() {
	System.out.println("come");
}
}
