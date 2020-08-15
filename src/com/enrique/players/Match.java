package com.enrique.players;

import com.enrique.graphics.Game;

public class Match {
	
	private static boolean[] matches = new boolean[9];
	
	private static boolean isMatch = false;
		
	private static int counter;
	
	public static boolean checkMatch(){
		counter = 0;
			for(int i = 0; i < 3; i++) {
				matches[counter] = (Game.boxes[i][0].getOccupier() == Game.boxes[i][1].getOccupier() &&
						Game.boxes[i][0].getOccupier() == Game.boxes[i][2].getOccupier() &&
						areOccupied(i, 0, i, 1, i, 2) );
						System.out.println("match numero "+ counter + " = " + i +"0" + i +"1" + i +"2");
						System.out.println(matches[counter]);
				counter++;
			}
			for(int i = 0; i < 3; i++) {
				matches[counter] = (Game.boxes[0][i].getOccupier() == Game.boxes[1][i].getOccupier() &&
						Game.boxes[0][i].getOccupier() == Game.boxes[2][i].getOccupier() &&
						areOccupied(0, i, 1, i, 2, i));
				System.out.println("match numero "+ counter + " = " + "0" + i + "1" + i + "2" + i);
				System.out.println(matches[counter]);
				counter ++;
			}
			for(int i = 0; i < 3; i+=2) {
				matches[counter] = (Game.boxes[0][i].getOccupier() == Game.boxes[1][1].getOccupier() &&
						Game.boxes[0][i].getOccupier() == Game.boxes[2][boringMethod(i)].getOccupier() &&
						areOccupied(0, i, 1, 1, 2, boringMethod(i)));
				System.out.println("match numero " + counter + " = " + "0" + i + "11" + "2" + i);
				System.out.println(matches[counter]);
				counter ++;
			}
			for(int i = 0; i < 8; i++) {
				System.out.println("checking:" + i + " es: " + matches[i]);
				if (matches[i]) {
					isMatch = true;
					System.out.println("match: " + i + " es " + isMatch);
				}
			}
			return isMatch;
	}
	private static int boringMethod(int i) {
		if(i == 0) {
			return 2;
		}else {
			return 0;
		}
	}
	private static boolean areOccupied(int i, int j, int k, int l, int m, int n) {
		boolean areOccupied = false;
		areOccupied = (Game.boxes[i][j].isOccupied() && Game.boxes[k][l].isOccupied() && Game.boxes[m][n].isOccupied());
		return areOccupied;
	}

}
