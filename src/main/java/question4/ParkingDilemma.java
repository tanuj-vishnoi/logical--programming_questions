package question4;

import java.awt.CardLayout;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParkingDilemma {

	private List<Long> cars;
	private int k;
	
	public ParkingDilemma(List<Long> cars, int k) {
		this.cars = cars;
		this.k = k;
	}
	
	public int carParkingRoof() {
		Collections.sort(cars);
		Set<Long> coverRequirement = new HashSet<Long>();
		int carsTotal = cars.size();
		for(int i=0;i< carsTotal; i++) {
			long sum = 0;
			try {
				sum = cars.get(i + k - 1) - cars.get(i) + 1 ;
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
