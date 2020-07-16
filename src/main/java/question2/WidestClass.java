package question2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WidestClass {

	public static int widestGap(int lengthOfRoad, List<Integer> start, List<Integer> end) {
		Integer[] sstart = start.toArray(new Integer[start.size()]);
		Integer[] send = end.toArray(new Integer[end.size()]);
		int[] sroadblock = new int[lengthOfRoad+1];
		for(int i=0;i < sroadblock.length; i++) {
			sroadblock[i] = 0;
		}
		for(int i=0; i < sstart.length; i++) {
			sroadblock[sstart[i]] = 1;
			for(int j = sstart[i] ; j <=send[i]; j++)
				sroadblock[j] = 1;

		}
		int count = 0, maxCount = 0; int startingIndex = 0;
		for(int i =1 ;i<sroadblock.length; i++) {
			if(sroadblock[i]!=0) {
				startingIndex = i;
				break;
			}
		}
		for(int i=startingIndex; i < sroadblock.length ; i++) {
			//System.out.println(i+"->"+sroadblock[i]);
			if(sroadblock[i]==0) {
				count++;
				continue;
			}else {
				if(count> maxCount) {
					maxCount = count;
					count = 0;
				}
			}
		}
		return maxCount;
	}
}
