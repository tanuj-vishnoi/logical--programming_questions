package question5;

import java.util.HashMap;
import java.util.Map;

public class FreeLancingPlatform {

	private int[] projectIds,bids;
	private Map<Integer,Integer> totalMiniumCost;
	private int numberOfProjects;
		
	public FreeLancingPlatform(int numberOfProjects , int[] projectIds, int[] bids) {
		this.projectIds = projectIds;
		this.bids = bids;
		this.numberOfProjects = numberOfProjects;
		totalMiniumCost = new HashMap<Integer,Integer>();
	}
	
	public int minCost() {
		for(int i = 0; i<projectIds.length; i++) {
			if(!totalMiniumCost.containsKey(projectIds[i])) {
				totalMiniumCost.put(projectIds[i], bids[i]);
			}else {
				int temp = totalMiniumCost.get(projectIds[i]);
				if(temp > bids[i]) {
					totalMiniumCost.put(projectIds[i], bids[i]);
				}
			}
		}
		if(totalMiniumCost.size()!=numberOfProjects)
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
