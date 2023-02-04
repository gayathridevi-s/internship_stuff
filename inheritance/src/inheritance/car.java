package inheritance;

public class car extends Machine {
	public void names() {
		System.out.println("give car name");
		System.out.println(name);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("kings");    //changing the contents of start here.when it is called by subclass object,it will execute
		//super.start();
	}

}
