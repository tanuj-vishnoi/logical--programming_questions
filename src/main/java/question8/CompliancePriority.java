package question8;

public class CompliancePriority {

	private int[] priority;
	
	public CompliancePriority(int size, int[] priority) {
		this.priority = priority;
	}
	
	public int[] reassingedPriorities() {
		int maxNumber = getMaximumValueFromArray(priority);
		int[] tempArray = new int[maxNumber+1];
		for(int i=0; i< tempArray.length ;i ++) {
			tempArray[i] = 0;
		}
		
		for(int i=0; i< priority.length ;i ++) {
			tempArray[priority[i]] = 1;
		}
		int startinPriority = 1;
		for(int i=0; i< tempArray.length ;i ++) {
			if(tempArray[i]==1) {
				for(int j=0; j< priority.length ;j ++) {
					if(priority[j] ==i) {
						priority[j] = startinPriority;
					}
				}
				startinPriority++;
			}
		}
		return priority;
		
	}
	
	
	private int getMaximumValueFromArray(int[] inputArray) {
		int max = 0;
		for(int i=0; i< inputArray.length ;i ++) {
			if(inputArray[i]> max)
				max = inputArray[i];
		}
		return max;
	}
	
	private void print(int[] pri) {
		for(int i=0; i< pri.length ;i ++) {
			System.out.print(pri[i]+"\t");
		}
		System.out.println();
	}
}
