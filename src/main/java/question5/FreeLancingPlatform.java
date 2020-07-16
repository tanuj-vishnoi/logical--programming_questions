package question5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeLancingPlatform {


	public long minCost(int numberOfProjects , List<Integer> projectIds, List<Integer> bids) {
		Map<Integer,Integer> utotalMiniumCost = new  HashMap<Integer,Integer>();
		Integer[] uprojectIds = projectIds.toArray(new Integer[projectIds.size()]);
		Integer[] ubids = bids.toArray(new Integer[bids.size()]);
		for(int i = 0; i<uprojectIds.length; i++) {
			if(!utotalMiniumCost.containsKey(uprojectIds[i])) {
				utotalMiniumCost.put(uprojectIds[i], ubids[i]);
			}else {
				int temp = utotalMiniumCost.get(uprojectIds[i]);
				if(temp > ubids[i]) {
					utotalMiniumCost.put(uprojectIds[i], ubids[i]);
				}
			}
		}
		if(utotalMiniumCost.size()!=numberOfProjects)
			return -1;
		else {
			long sum = 0;
			for(int i : utotalMiniumCost.values()) {
				sum = sum +i;
			}
			return sum;
		}

	}


}