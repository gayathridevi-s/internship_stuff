package inheritance;

public class Machine implements Info {
	protected String name;
	private int id=7;
public void start() {
	System.out.println("lets start");
}
public void stop() {
	System.out.println("lets stop");
}

public void showInfo() {
	
	System.out.println("machine id="+id);
}
}
