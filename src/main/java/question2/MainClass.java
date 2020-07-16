package question2;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	private static WidestClass widestClass;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 10;
		List<Integer> start = new ArrayList<Integer>();
		List<Integer> end = new ArrayList<Integer>();
		
//		start.add(1); start.add(2); start.add(6); start.add(6);
//		end.add(4); end.add(4);end.add(10);end.add(8);
		
//		start.add(3); start.add(8); // start.add(5); start.add(8);
//		end.add(4); end.add(9);//end.add(6);end.add(10);
		
		start.add(1); start.add(2); start.add(5); start.add(8);
		end.add(2); end.add(2);end.add(6);end.add(10);
		widestClass  = new WidestClass();
		//widestClass.widestGap(t, start, end);
		System.out.println(widestClass.widestGap(t, start, end));
	}

}
