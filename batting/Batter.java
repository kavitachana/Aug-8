package com.kavita.batting;

import java.util.ArrayList;
import java.util.Scanner;

public class Batter {

	private Scanner getStats = new Scanner(System.in);
	
	private String playerName = null;
	private String userResult = null;
	private ArrayList<Integer> results = new ArrayList<>();

	private int atBats = 0;
	private int result = 0;
	private float totalBases = 0.0f;
	private float totalHits = 0.0f;

	public Batter(String playerName, int atBats) {
		
		this.playerName = playerName;
		this.atBats = atBats;

		playerStats(atBats);
		
	}
	
	public int getAtBats() {
		return atBats;
	}

	public String getPlayerName() {
		return this.playerName;
	}

	public void playerStats(int userAtBats) {
		
		for (int i = 0; i < userAtBats; i++) {
			
			System.out.println("Please enter a result (0 - 4) for at bat number " + (i+1) + ":");

			userResult = getStats.nextLine();
			result = Integer.parseInt(userResult);
			
			if (result < 0 || result > 4) {
			
				System.out.println("You've entered an invalid number. Please restart the calculator.\n");
				System.exit(0);
			}
			
			results.add(result);
			
			if (Integer.parseInt(userResult) > 0) {

				totalHits++;
			}
						
			totalBases += results.get(i);
			}
	}

	public void slugPercent () {
			
			float slugPerc = totalBases/atBats;
			System.out.printf("%.3f\n", slugPerc);		

	}

	public void battingAvg () {
			
			float batAvg = totalHits/atBats;
			System.out.printf("%.3f\n", batAvg);

	}
			
}

	
	
	
	
	
	

