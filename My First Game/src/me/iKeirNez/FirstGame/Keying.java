package me.iKeirNez.FirstGame;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keying extends JPanel {
	private static final long serialVersionUID = 1L;

	public Rectangle character;
	
	Font font = new Font(Options.font, Font.TRUETYPE_FONT,Options.fontSize);
	
	public int charW = Options.CharacterWidth;
	public int charH = Options.CharacterHeight;
	
	public int spawnX = Options.spawnX;
	public int spawnY = Options.spawnY;
	
	public boolean right = false;
	public boolean left = false;
	public boolean forward = false;
	public boolean backward = false;
	public boolean respawn = false;
	public boolean invertColors = false;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if (invertColors){
			this.setBackground(Options.rectColor);
			g.setColor(Options.background);
		} else {
			this.setBackground(Options.background);
			g.setColor(Options.rectColor);
		}
		g.fillRect(character.x, character.y, character.width, character.height);
		
		if(right){
			character.x += Options.speed;
		}
		
		if (left){
			character.x -= Options.speed;
		}
		
		if (forward){
			character.y -= Options.speed;
		}
		
		if (backward){
			character.y += Options.speed;
		}
		
		if(respawn){
			character.x = spawnX;
			character.y = spawnY;
		}
		
		repaint();
		
		g.setColor(Options.fontColor);
		g.setFont(font);
		g.drawString((Options.text + Main.version) , Options.textX, Options.textY);
	}
	
	public Keying(Display f, Images i){
		character = new Rectangle(spawnX, spawnY, charW, charH);
		
		f.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
				
				if (e.getKeyCode() == KeyEvent.VK_D){
					right = true;
					//repaint();
				}
				
				if (e.getKeyCode() == KeyEvent.VK_A){
					left = true;
					//repaint();
				}
				
				if (e.getKeyCode() == KeyEvent.VK_W){
					forward = true;
					//repaint();
				}
				
				if (e.getKeyCode() == KeyEvent.VK_S){
					backward = true;
					//repaint();
				}
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER){
					respawn = true;
					//repaint();
				}
				
				if (e.getKeyCode() == KeyEvent.VK_I){
					if (invertColors){
						invertColors = false;
						//repaint();
					} else {
						invertColors = true;
						//repaint();
					}
				}
				
			}
			
			public void keyReleased(KeyEvent e){
				if (e.getKeyCode() == Options.rightControl){
					right = false;
					//repaint();
				}
				
				if (e.getKeyCode() == Options.leftControl){
					left = false;
					//repaint();
				}
				
				if (e.getKeyCode() == Options.forwardControl){
					forward = false;
					//repaint();
				}
				
				if (e.getKeyCode() == Options.backwardControl){
					backward = false;
					//repaint();
				}
				
				if (e.getKeyCode() == Options.respawnControl){
					respawn = false;
					//repaint();
				}
			}
			
		});
	}
	
}
