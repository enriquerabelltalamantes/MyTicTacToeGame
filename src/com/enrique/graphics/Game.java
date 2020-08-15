package com.enrique.graphics;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.enrique.players.EasyAI;
import com.enrique.players.Match;
import com.enrique.players.User;

public class Game {
	
	public static int occupiedBoxes = 0;
	
	public static Box[][] boxes = new Box[3][3];
		
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel();
	
	static User user = new User();
	static EasyAI ai = new EasyAI();
	
	public static JPanel startGameScreen(){
		//panel.add(circle(100,100));
		panel.add(board());
		//panel.add(circle(100,100));

		return panel;
	}
	
	private static JLabel board() {
		JLabel label = new JLabel(Utils.board());
		label.setBounds(0, 0, 500, 500);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				boxes[i][j] = new Box((short)i, (short)j);
			}
		}
		
		for (Box[] boxs : boxes) {
			for (Box box : boxs) {
				box.button.setBounds(box.getxPos() * 133 + 50, box.getyPos() * 133 + 50, 133,133);
				box.button.setBackground(Utils.colors[3]);
				box.button.setBorder(null);
				ActionListener listener = new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(!box.isOccupied() && occupiedBoxes < 9 && !Match.checkMatch()) {
						user.chuck(box);
						box.button.setIcon(Utils.circle());
						if(occupiedBoxes < 9 && !Match.checkMatch()) {
							ai.chuck(box);
						}
						}
					}
				};
				
				box.button.addActionListener(listener);

				label.add(box.button);
			}
		}
		
		return label;
	}
	
}
