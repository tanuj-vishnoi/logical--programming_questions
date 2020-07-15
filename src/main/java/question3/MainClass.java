package question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String...a) {
		List<String> lines = new ArrayList<String>();
		lines.add("# Games");
		lines.add("## Board");
		lines.add("## Zero Sum");
		lines.add("## Computer");
		lines.add("## MultiPlayer");
		lines.add("# Startergies");
		lines.add("## Greedy");
		lines.add("## Tree pruning");
		lines.add("## Others");
		lines.add("# Summary");
		
		TableOfContent tableOfContent = new TableOfContent();
		System.out.println(tableOfContent.tableOfContents(lines));
	}
}
