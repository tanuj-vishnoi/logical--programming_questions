package question2;

public class WidestClass {
	
	private int[] roadblock, start, end;

	public WidestClass(int lengthOfRoad, int[] start, int[] end) {
		roadblock = new int[lengthOfRoad];
		this.start = start;
		this.end = end;
	}
	
	public int widestGap() {
		setDefaultValue();
		for(int i=0 ; i < start.length; i++) {
			roadblock[start[i]-1] = 1;
			for(int j = start[i] ; j < end[i]; j++)
				roadblock[j] = 1;
			
		}
		printRoad();
		return getMaxConsecutivegaps(roadblock);
	}
	
	public int getMaxConsecutivegaps(int[] road) {
		int count = 0, maxCount = 0;
		for(int i=0; i < road.length ; i++) {
			if(road[i]==0) {
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
	
	private void setDefaultValue() {
		for(int i=0;i < roadblock.length; i++) {
			roadblock[i] = 0;
		}
	}
	
	private void printRoad() {
		for(int i=0 ; i < roadblock.length; i++) {
			System.out.print(roadblock[i]+" ");
		}
		System.out.println();
	}
}
