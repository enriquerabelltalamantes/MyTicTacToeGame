package com.enrique.graphics;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window 
{
   private static final int WIDTH = 500, HEIGHT = 500;
   private static final String NAME = "Tic Tac Toe"; 
	
   static JFrame window = new JFrame(NAME);
     
   public static void windowShow()  { 
	    window.setSize(WIDTH, HEIGHT);
    	window.setResizable(false);
    	window.setLocationRelativeTo(null);
   		
    	window.setIconImage(Utils.logo.getImage());
    	
    	Screen s = new Screen();
    	JPanel panel = new JPanel();
    	
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	window.getContentPane().add(s.setGame(panel));
    	window.setVisible(true);

  
    }

}
