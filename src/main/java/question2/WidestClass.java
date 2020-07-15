package question2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WidestClass {
	
	public int widestGap(int lengthOfRoad, List<Integer> start, List<Integer> end) {
		int maxGap = 0;
		Set<Integer> roadBlocks = new HashSet<Integer>();
		for(int i =1; i<=lengthOfRoad ;i++) {
			roadBlocks.add(i);
		}
		for(int i=0;i< start.size() ; i++) {
			int startingBlock = start.get(i);
			int endingBlock = end.get(i);
			for(int j = startingBlock; j<=endingBlock ; j++) {
				roadBlocks.remove(j);
			}
		}
		Integer[] emptyBlocks = roadBlocks.toArray(new Integer[roadBlocks.size()]);
		if(emptyBlocks.length == 0)
			return maxGap;
		if(emptyBlocks.length == 1)
			return 1;
		
		int diff  = 1 ; 
		for(int i = 0; i < emptyBlocks.length -1 ; i ++) {
			if(emptyBlocks[i]+1 == emptyBlocks[i+1]) {
				diff++;
				continue;
			}
			if(diff > maxGap) {
				maxGap = diff;
				diff = 1;
			}
		}
		return maxGap;
	}
}
