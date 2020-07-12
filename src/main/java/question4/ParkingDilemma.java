package question4;

import java.awt.CardLayout;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParkingDilemma {

	private int[] carsParkingIndex;
	private int coverSize;
	
	public ParkingDilemma(int[] carsParkingIndex, int coverSize) {
		this.carsParkingIndex = carsParkingIndex;
		this.coverSize = coverSize;
	}
	
	public int carParkingRoof() {
		Arrays.sort(carsParkingIndex);
		Set<Integer> coverRequirement = new HashSet<Integer>();
		int cars = carsParkingIndex.length;
		for(int i=0;i< cars; i++) {
			int sum = 0;
			try {
				sum = carsParkingIndex[i + coverSize-1] - carsParkingIndex[i] + 1 ;
				coverRequirement.add(sum);
			}catch(ArrayIndexOutOfBoundsException e) {
				break;
			}
		}
		Integer[] arr = new Integer[coverRequirement.size()]; 
        arr = coverRequirement.toArray(arr); 
        System.out.println(coverRequirement);
		return arr[0];
	}
	
	
}
