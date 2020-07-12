package question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String...a) {
//		String[] lines = new String[10];
//		lines[0] = "# Games";
//		lines[1] = "## Board";
//		lines[2] = "## Zero Sum";
//		lines[3] = "## Computer";
//		lines[4] = "## MultiPlayer";
//		lines[5] = "# Startergies";
//		lines[6] = "## Greedy";
//		lines[7] = "## Tree pruning";
//		lines[8] = "## Others";
//		lines[9] = "# Summary";
		
		
		Scanner scanner = new Scanner(System.in);
		int totalInput = scanner.nextInt();
		String[] lines =  new String[totalInput];
		for(int i=0; i <=totalInput-1; i++) {
			String value = scanner.next();
			lines[i] = value;
		}
		TableOfContent tableOfContent = new TableOfContent(lines);
		String[] tableContent  = tableOfContent.tableOfContents();
		for(String s: tableContent) {
			System.out.println(s);
		}
	}
}
