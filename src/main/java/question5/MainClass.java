package question5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfProjects = 5;
		List<Integer> projectId = new ArrayList<Integer>();
		projectId.add(25); projectId.add(32); projectId.add(44); projectId.add(51);projectId.add(63);
		System.out.println(projectId);
		List<Integer> bids = new ArrayList<Integer>();
		bids.add(8); bids.add(7); bids.add(6); bids.add(9);bids.add(10);
		System.out.println(bids);
		
		FreeLancingPlatform freeLancing = new FreeLancingPlatform();
		
		System.out.println(freeLancing.minCost(numberOfProjects, projectId, bids));

	}

}
