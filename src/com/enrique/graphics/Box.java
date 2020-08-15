package com.enrique.graphics;

import javax.swing.JButton;

import com.enrique.players.IPlayable;

public class Box {
	private boolean isOccupied = false;
	private IPlayable occupier;
	private short xPos;
	private short yPos;
	public boolean isOccupied() {
		return isOccupied;
	}
	public IPlayable getOccupier() {
		return occupier;
	}
	public short getxPos() {
		return xPos;
	}
	public short getyPos() {
		return yPos;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	public void setOccupier(IPlayable occupier) {
		this.occupier = occupier;
	}
	
	public Box(short xPos, short yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	public JButton button = new JButton();
	
}
