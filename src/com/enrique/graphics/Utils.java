package com.enrique.graphics;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Utils {
 
	   public final static Color[] colors = {new Color(18,1,54),new Color(3,90,166), 
			   new Color(64,186,213), new Color(252,191,28)};
	
	   static ImageIcon logo = new ImageIcon("Images/logo.png");
	   
	   public static ImageIcon cross() {
		   ImageIcon rawCross = new ImageIcon("Images/tache.png");
		   ImageIcon cross = new ImageIcon(rawCross.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH));
		   
		   return cross;
	   }
	   
	   public static ImageIcon circle() {
		   ImageIcon rawCircle = new ImageIcon("Images/circulo.png");
		   ImageIcon circle = new ImageIcon(rawCircle.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH));
		   
		   return circle;
	   }
	   static ImageIcon board() {
		   ImageIcon rawBoard = new ImageIcon("Images/board.png");
		   ImageIcon board = new ImageIcon(rawBoard.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH));
		  
		   return board;
	   }

}

