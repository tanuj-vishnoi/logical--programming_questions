package question5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeLancingPlatform {

	
		
	
	public int minCost(int numberOfProjects , List<Integer> projectIds, List<Integer> bids) {
		Integer[] projects,bIds;
		Map<Integer,Integer> totalMiniumCost;
		int totalProjects;
		totalProjects = numberOfProjects;
		projects = new Integer[projectIds.size()];
		for(int i =0; i<projectIds.size() ; i++) {
			projects[i] = projectIds.get(i);
		}
		bIds = new Integer[numberOfProjects];
		for(int i =0; i<bids.size() ; i++) {
			bIds[i] = bids.get(i);
		}
		totalMiniumCost = new HashMap<Integer,Integer>();
		for(int i = 0; i<projects.length; i++) {
			if(!totalMiniumCost.containsKey(projects[i])) {
				totalMiniumCost.put(projects[i], bIds[i]);
			}else {
				int temp = totalMiniumCost.get(projects[i]);
				if(temp > bIds[i]) {
					totalMiniumCost.put(projects[i], bIds[i]);
				}
			}
		}
		if(totalMiniumCost.size()!=totalProjects)
			return -1;
		else {
			int sum = 0;
			for(int i : totalMiniumCost.values()) {
				sum = sum +i;
			}
			return sum;
		}
		
	}
	
	
}
