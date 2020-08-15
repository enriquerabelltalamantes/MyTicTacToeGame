package com.enrique.players;

import com.enrique.graphics.Box;
import com.enrique.graphics.Game;
import com.enrique.graphics.Utils;

public class EasyAI implements IAI {

	@Override
	public Box chooseThrow() {
		// este metodo es lo que diferenciara la dificultad de aiç
		boolean next = false;
		int x;
		int y;
		do {
			x  = (int)(Math.random()*3);
			y = (int)(Math.random()*3);
			
			if(Game.boxes[x][y].isOccupied()) {
			}else {
				next = !next;
				
			}
			System.out.println("calculating ...");
			
		}while(!next);
		Game.boxes[x][y].setOccupied(true);
		Game.boxes[x][y].setOccupier(this);		
		Game.boxes[x][y].button.setIcon(Utils.cross());;
		return Game.boxes[x][y];
		
	}

	@Override
	public void chuck(Box box) {
		// TODO Auto-generated method stub
		Game.occupiedBoxes++;
		chooseThrow();
		
	}
	
}
