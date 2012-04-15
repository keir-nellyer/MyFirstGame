package me.iKeirNez.FirstGame;

import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
	private static final long serialVersionUID = 1L;
	public JPanel jp = (JPanel) getGlassPane();
	public Images i;
	public Keying k;
	
	public Display(){
		i = new Images();
		jp.setVisible(true);
		k = new Keying(this, i);
		
		jp.setLayout(new GridLayout(1, 1, 0, 0));
		this.setLayout(new GridLayout(1, 1, 0, 0));
		
		jp.add(k);
		this.add(i);
	}

}
