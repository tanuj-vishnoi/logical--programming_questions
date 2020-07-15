package question3;

import java.util.ArrayList;
import java.util.List;

public class TableOfContent {
	
	
	public List<String>  tableOfContents(List<String> lines) {
		String[] aLines = lines.toArray(new String[lines.size()]);
		String titlePattern = "# ";
		String subHeadingPattern = "## ";
		List<String> tableOfContents = new ArrayList<String>();
		System.out.println(aLines.length);
		int headingCount = 0 , subHeadingCount = 0;
		for(int i=0; i< aLines.length ;i ++) {
			if(aLines[i].startsWith(titlePattern)) {
				headingCount++;
				subHeadingCount = 0;
				tableOfContents.add(headingCount+". "+aLines[i].replace(titlePattern, ""));
			}else {
				if(aLines[i].startsWith(subHeadingPattern)) {
					subHeadingCount++;
					tableOfContents.add(headingCount+"."+subHeadingCount+". "+aLines[i].replace(subHeadingPattern, ""));
				}
			}
			
		}
		
		//return tableOfContents.toArray(new String[tableOfContents.size()]);
		return tableOfContents;
	}
	
	
	
	

}
