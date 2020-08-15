package com.enrique.players;

import com.enrique.graphics.Box;

public interface IAI extends IPlayable{
	public int [] actualThrow = new int[2];
	
	public Box chooseThrow ();

}
