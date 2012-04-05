package me.iKeirNez.FirstGame;

import javax.swing.JFrame;

public class Main {
	
	public static Display f = new Display();
	
	public static int w = Options.windowWidth;
	public static int h = Options.windowHeight;
	
	public static double version = Options.version;
	
	public static void main(String args[]){
		f.setSize(w, h);
		f.setResizable(Options.resizable);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle(Options.windowTitle + version);
		f.setLocationRelativeTo(null);
		f.setAlwaysOnTop(false);
	}

}
