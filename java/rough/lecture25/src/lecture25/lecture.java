package lecture25;

public class lecture {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();  //StringBuilder constructs a string builder with no characters in it
	sb.append("hello");
	sb.append(" ");
	sb.append("my name is gayathri");
	//formatting
	System.out.println(sb.toString());  //use of println,it will print in new line
	System.out.print("hello guys\thai all\ngayathr");    //it will print in same line unless giving\t and \n
	System.out.printf("i am %d",8);  //it will assign value to format %d
	for(int i=0;i<15;i++) {
		System.out.printf("%-2d:hello\n",i);//align to left by 2 units
	}
	for(int i=0;i<15;i++) {
	System.out.printf("%2d:hello %s\n",i,"mmmmm");//align to right by 2 units
}
	System.out.printf("%.2f\n",5.7890);//.2f displays two positions of float
	System.out.printf("%6.1f",5.7890);//6.1f displays right aligned positions of float with 1 decimal point
	
}
}

