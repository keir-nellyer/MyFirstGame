package me.iKeirNez.FirstGame;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keying extends JPanel {
	
	public Rectangle character;
	
	Font font = new Font("Comic Sans MS", Font.TRUETYPE_FONT,20);
	
	public int charW = 24;
	public int charH = 36;
	
	public int spawnX = 180;
	public int spawnY = 180;
	
	public boolean right = false;
	public boolean left = false;
	public boolean forward = false;
	public boolean backward = false;
	
	public Keying(Display f, Images i){
		character = new Rectangle(spawnX, spawnY, charW, charH);
		
		f.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
				
				if (e.getKeyCode() == KeyEvent.VK_D){
					right = true;
				}
				
				if (e.getKeyCode() == KeyEvent.VK_A){
					left = true;
				}
				
				if (e.getKeyCode() == KeyEvent.VK_W){
					forward = true;
				}
				
				if (e.getKeyCode() == KeyEvent.VK_S){
					backward = true;
				}
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER){
					character.x = spawnX;
					character.y = spawnY;
				}
				
			}
			
			public void keyReleased(KeyEvent e){
				if (e.getKeyCode() == KeyEvent.VK_D){
					right = false;
				}
				
				if (e.getKeyCode() == KeyEvent.VK_A){
					left = false;
				}
				
				if (e.getKeyCode() == KeyEvent.VK_W){
					forward = false;
				}
				
				if (e.getKeyCode() == KeyEvent.VK_S){
					backward = false;
				}
			}
			
		});
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.RED);
		g.fillRect(character.x, character.y, character.width, character.height);
		
		if(right){
			character.x += 1;
		}
		
		if (left){
			character.x -=1;
		}
		
		if (forward){
			character.y -= 1;
		}
		
		if (backward){
			character.y += 1;
		}
		
		g.setColor(Color.WHITE);
		g.setFont(font);
		g.drawString(("iKeirNez's First Game Version " + Main.version) , 180, 180);
		repaint();
	}
}
