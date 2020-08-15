package com.enrique.players;

import com.enrique.graphics.Box;
import com.enrique.graphics.Game;


public class User implements IPlayable{
	
	@Override
	public void chuck(Box box) {
		// TODO Auto-generated method stub
		Game.occupiedBoxes++;
		box.setOccupied(true);
		box.setOccupier(this);
		
	}

}
