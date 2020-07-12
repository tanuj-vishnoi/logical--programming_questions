package question3;

import java.util.ArrayList;
import java.util.List;

public class TableOfContent {
	
	private String titlePattern = "# ";
	private String subHeadingPattern = "## ";
	
	private String[] lines;
	private List<String> tableOfContents;
	
	public TableOfContent(String[] lines) {
		this.lines = lines;
		tableOfContents = new ArrayList<String>();
	}
	
	
	public String[] tableOfContents() {
		int headingCount = 0 , subHeadingCount = 0;
		for(int i=0; i< lines.length ;i ++) {
			if(lines[i].startsWith(titlePattern)) {
				headingCount++;
				subHeadingCount = 0;
				tableOfContents.add(headingCount+". "+lines[i].replace(titlePattern, ""));
			}else {
				if(lines[i].startsWith(subHeadingPattern)) {
					subHeadingCount++;
					tableOfContents.add(headingCount+"."+subHeadingCount+". "+lines[i].replace(subHeadingPattern, ""));
				}
			}
			
		}
		
		return tableOfContents.toArray(new String[tableOfContents.size()]);
	}
	
	
	
	

}
