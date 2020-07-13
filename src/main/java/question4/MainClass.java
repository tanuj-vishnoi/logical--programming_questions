package question4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String...a) {
//		int[] cars = {6,2,12,7};
//		int reqCoverSize = 3;
		
		Scanner scanner = new Scanner(System.in);
		int totalInput = scanner.nextInt();
		long[] cars =  new long[totalInput];
		for(int i=0; i <=totalInput-1; i++) {
			long value = scanner.nextLong();
			cars[i] = value;
		}
		int reqCoverSize = scanner.nextInt();
		;
		//ParkingDilemma pD = new ParkingDilemma(Arrays.stream(cars).boxed().collect(Collectors.toList()), reqCoverSize);
		//System.out.println(pD.carParkingRoof());
	}
}
