package question8;

import java.util.Scanner;

public class MainClass {

	public static void main(String...a) {
//		int size = 5;
//		int[] priority = {2, 9, 3, 2, 3};
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] priority =  new int[size];
		for(int i=0; i <=size-1; i++) {
			int value = scanner.nextInt();
			priority[i] = value;
		}
		
		CompliancePriority comP = new CompliancePriority(size,priority);
		priority = comP.reassingedPriorities();
		for(int i=0; i< priority.length ;i ++) {
			System.out.println(priority[i]);
		}
	}
}
