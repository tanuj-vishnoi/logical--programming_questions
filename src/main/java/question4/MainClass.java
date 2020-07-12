package question4;

import java.util.Scanner;

public class MainClass {

	public static void main(String...a) {
//		int[] cars = {6,2,12,7};
//		int reqCoverSize = 3;
		
		Scanner scanner = new Scanner(System.in);
		int totalInput = scanner.nextInt();
		int[] cars =  new int[totalInput];
		for(int i=0; i <=totalInput-1; i++) {
			int value = scanner.nextInt();
			cars[i] = value;
		}
		int reqCoverSize = scanner.nextInt();
		ParkingDilemma pD = new ParkingDilemma(cars, reqCoverSize);
		System.out.println(pD.carParkingRoof());
	}
}
