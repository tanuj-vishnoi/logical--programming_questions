package mainclass;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import question1.CountCounterFeitClass;

public class MainClass {
	
	
	public static void main(String...a) {
		
		List<String> serialNumbers =  new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		int totalInput = scanner.nextInt();
		for(int i=0; i <=totalInput-1; i++) {
			String value = scanner.next();
			serialNumbers.add(value);
		}
		CountCounterFeitClass countCounterFeit = new CountCounterFeitClass(serialNumbers);
		System.out.println(countCounterFeit.countCounterFeit());
	}
	
	

}
