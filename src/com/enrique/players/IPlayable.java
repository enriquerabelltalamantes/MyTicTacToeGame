package com.enrique.players;

import com.enrique.graphics.Box;

public interface IPlayable {
	void chuck(Box box);                           
	
	default void setTag() {
		
	}

	
}
