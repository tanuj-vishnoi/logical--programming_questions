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
		
	   start.add(1); start.add(2); start.add(6); start.add(6);
	   end.add(4); end.add(4);end.add(10);end.add(8);
		
		//start.add(3); start.add(8); //start.add(5); start.add(8);
		//end.add(4); end.add(9);//end.add(6);end.add(10);
		
		//start.add(1); start.add(2); start.add(5); start.add(8);
		//end.add(2); end.add(2); end.add(6);end.add(10);
		
//		start.add(522); 
//		start.add(575); 
//		start.add(426); 
//		start.add(445);
//		start.add(772); 
//		start.add(81); 
//		start.add(447); 
//		start.add(629);
//		start.add(447);
//		start.add(202);
//		
//		end.add(676); 
//		end.add(803);
//		end.add(657);
//		end.add(500);
//		end.add(835); 
//		end.add(196);
//		end.add(718);
//		end.add(830);
//		end.add(680); 
//		end.add(919);
		widestClass  = new WidestClass();
		System.out.println(widestClass.widestGap(t, start, end));
	}

}
