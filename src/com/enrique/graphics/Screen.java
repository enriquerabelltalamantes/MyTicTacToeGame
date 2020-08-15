package com.enrique.graphics;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Screen {

	    public void startPanel(JPanel panel) {
		    panel.removeAll();
		    panel.setBackground(Utils.colors[3]);
		    panel.setForeground(null);
		    panel.setLayout(null);
	    }
	    
	    //panels 
	    public JPanel setInitial(JPanel panel) {
		   startPanel(panel);
		   panel.add(instructions());
		   panel.add(cross(40,350));
		   panel.add(circle(350,350));
		   panel.add(logo(350,10));
		   panel.add(button("ok", 200, 400));

		   return panel;
		}
	    
	   	public JPanel setGame(JPanel panel) {			
			//startPanel(panel);
		    panel = Game.startGameScreen();
		   // panel.setBackground(Utils.colors[3]);
			panel.add(new JLabel());
			//panel.add(circle(100,100));
		  
		   return panel;
		}
	    public JPanel setWin(JPanel panel) {
		   startPanel(panel);
		   panel.add(congrats());
		   
		   return panel;
		}
	    public JPanel setLose(JPanel panel) {
			startPanel(panel);
			panel.add(sorry());
		   
		   return panel;
		}
	    public JPanel setError(JPanel panel) {
		   startPanel(panel);
		   panel.add(error());
		   panel.add(cross(350,50));

		   return panel;
		}
		
		//labels
		private JLabel instructions() {
			JLabel label = new JLabel("<html><body><h1>Hola bienvenido </h1>a tic tac toe<br> o 3 en raya por Enrique."
					+ "<br>El juego consiste en juntar 3 simbolos tuyos en linea recta <br>ya sea diagonal,"
					+ "horizontal o vertical. En esta ocasion jugaras contra el AI,<br> espero que te guste</body></html>");
			label.setForeground(Utils.colors[0]);
			
			label.setBounds(10, 10, 300, 300);
			label.setFont(new Font("Arial", 20, 20));
		
			return label;
		}
		private JLabel cross(int x, int y){
			JLabel label = new JLabel(Utils.cross());
			label.setBounds(x, y, 110, 110);
			 
			return label;
		}
		private JLabel circle(int x, int y) {
			JLabel label = new JLabel(Utils.circle());
			label.setBounds(x, y, 110, 110);
			
			return label;
		}
		private JLabel logo(int x, int y) {
			JLabel label = new JLabel(Utils.logo);
			label.setBounds(x, y, 110, 110);
			
			return label;
		}
		private JLabel congrats() {
			JLabel label = new JLabel("<html><body<h1>" + htmlSpace(1)+ " Felicidades</h1><br><p>has ganado, prueba"
					+ " otra<br>"+htmlSpace(12)+" dificultad<p></body></html>", SwingConstants.CENTER);
			label.setBounds(100,60,300,300);
			label.setOpaque(true);
			
			return label;
		}
		private JLabel sorry() {
			JLabel label = new JLabel("<html><body<h1>" + htmlSpace(5) +" Derrota</h1><br><p>"+ htmlSpace(3)
					+" has perdido, prueba otra<br> dificultad y sigue practicando<p></body></html>",
					SwingConstants.CENTER);
			label.setBounds(100,60,300,300);
			label.setOpaque(true);
			
			return label;
		}
		private JLabel error() {
			JLabel label = new JLabel("<html><body><h1>¡Oh no! </h1>Algo salio mal. Intenta:<br><ul>"
					+ "<li>Reiniciar la aplicacion<li>Contactar al proovedor</ul><body></html>");
			label.setForeground(Utils.colors[0]);
			label.setBounds(10, 50, 300, 300);
			label.setFont(new Font("Arial", 20, 20));
		
			return label;
		}
		
		private String htmlSpace(int i) {
			String s = "";
			for(int j = 0; i > j ;j++) {
				s = s + "&nbsp";
			}
			return s;
		}
		
		//buttons
		private JButton button(String text, int x,int y) {
			JButton button = new JButton(text);
			button.setBounds(x, y, 100, 50);
			button.setBackground(Utils.colors[2]);
			button.setBorder(null);
			
			return button;
		}
}
