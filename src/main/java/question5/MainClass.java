package question5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfProjects = 4;
		List<Integer> projectId = new ArrayList<Integer>();
		projectId.add(2); projectId.add(0); projectId.add(1); projectId.add(2);
		System.out.println(projectId);
		List<Integer> bids = new ArrayList<Integer>();
		bids.add(8); bids.add(7); bids.add(6); bids.add(9);
		System.out.println(bids);
		
		FreeLancingPlatform freeLancing = new FreeLancingPlatform(numberOfProjects, projectId, bids);
		
		System.out.println(freeLancing.minCost());

	}

}
