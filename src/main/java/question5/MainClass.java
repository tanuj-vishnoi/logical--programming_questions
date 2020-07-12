package question5;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int numberOfProjects = 4;
//		int[] projectId = {2, 0, 1, 2};
//		int[] bids = {8, 7, 6, 9};
		
		Scanner scanner = new Scanner(System.in);
		int numberOfProjects = scanner.nextInt();
		int numberOfProjectIds = scanner.nextInt();
		int[] projectId =  new int[numberOfProjectIds];
		for(int i=0; i <= numberOfProjectIds-1; i++) {
			int value = scanner.nextInt();
			projectId[i] = value;
		}
		int numberOfBids = scanner.nextInt();
		int[] bids =  new int[numberOfBids];
		for(int i=0; i <= numberOfBids-1; i++) {
			int value = scanner.nextInt();
			bids[i] = value;
		}
		
		FreeLancingPlatform freeLancing = new FreeLancingPlatform(numberOfProjects, projectId, bids);
		
		System.out.println(freeLancing.minCost());

	}

}
