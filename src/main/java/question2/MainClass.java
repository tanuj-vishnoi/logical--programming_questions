package question2;

public class MainClass {

	private static WidestClass widestClass;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 10;
		int[] start = {3, 8};
		int[] end = {4, 9};
		widestClass  = new WidestClass(t, start, end);
		System.out.println(widestClass.widestGap());
	}

}
