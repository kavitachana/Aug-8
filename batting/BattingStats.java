package com.kavita.batting;

import java.util.Scanner;

public class BattingStats {
	
	public static void main(String[] args) {
		
		Scanner getBatters = new Scanner(System.in);
	    String userBatters = null;
	 
	    String batterName = null;
	    String userAtBats = null;
	    
		System.out.println("Welcome to the batting average and slugging percentage calculator!\n");
		System.out.println("Please enter the number of batters: ");
		
		userBatters = getBatters.nextLine();
		int numOfBatters = Integer.parseInt(userBatters);
		
	    Batter[] playerProfile = new Batter[numOfBatters];
	    
		for(int i = 0; i < numOfBatters; i++) {
			
			System.out.println("Please enter the name for batter "+ (i+1) + ":");
			batterName = getBatters.nextLine();

			System.out.println("Please enter the number of at bats: ");
			userAtBats = getBatters.nextLine();
			int numAtBats = Integer.parseInt(userAtBats);
			
			playerProfile[i] = new Batter(batterName, numAtBats);
			
		}
		
		getBatters.close();
		
		for(int j = 0; j < numOfBatters; j++) {
			
			System.out.println("\nPlayer Name: " + playerProfile[j].getPlayerName());
			System.out.println("Number of at bats: " + playerProfile[j].getAtBats());
			System.out.println("Slugging percentage is: "); 
				playerProfile[j].slugPercent();
			System.out.println("Batting average is: ");
				playerProfile[j].battingAvg();
		}
	}
}
