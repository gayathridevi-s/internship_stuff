package array;

public class values {
	public static void main(String[] args) {
		int[] values;
		values= new int[3];
		System.out.println(values);
		values[0]=10;
		System.out.println(values[0]);
		System.out.println(values);
		String[] words=new String[3];
		System.out.println(words[0]);
		words[0]="hello";
		words[1]="kutta";
				System.out.println(words[0]);
				String[] fruits= {"kiwi","apple","orange"};
	System.out.println(fruits[1]);
	int[][] num= {{1,2,3},
			{3,6,7},
			{2,0}};
	for (int i=0;i<num.length;i++)
	{
		for(int j=0;j<num.length;j++) {
			System.out.println(num[i][j]+" ");
		}
		System.out.println();
	}
	
			
}
}